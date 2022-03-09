package me.whiteship.refactoring._03_long_function._11_decompose_conditional;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueComment;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StudyDashboard {

    private final int totalNumberOfEvents;

    public StudyDashboard(int totalNumberOfEvents) {
        this.totalNumberOfEvents = totalNumberOfEvents;
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        StudyDashboard studyDashboard = new StudyDashboard(15);
        studyDashboard.print();
    }

    private void print() throws IOException, InterruptedException {
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
        List<Participant> participants = new CopyOnWriteArrayList<>();

        ExecutorService service = Executors.newFixedThreadPool(8);
        CountDownLatch latch = new CountDownLatch(totalNumberOfEvents);

        for (int index = 1 ; index <= totalNumberOfEvents ; index++) {
            int eventId = index;
            service.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        GHIssue issue = repository.getIssue(eventId);
                        List<GHIssueComment> comments = issue.getComments();

                        for (GHIssueComment comment : comments) {
                            Participant participant = findParticipant(new FindParticipant(comment.getUserName(), participants));
                            participant.setHomeworkDone(eventId);
                        }

                        latch.countDown();
                    } catch (IOException e) {
                        throw new IllegalArgumentException(e);
                    }
                }
            });
        }

        latch.await();
        service.shutdown();

        new StudyPrinter(this.totalNumberOfEvents, participants).execute();
    }

    private Participant findParticipant(FindParticipant findParticipant) {
        return isNewParticipant(findParticipant) ?
                createNewParticipant(findParticipant) :
                findExistingParticipant(findParticipant);
    }

    private Participant findExistingParticipant(FindParticipant findParticipant) {
        Participant participant;
        participant = findParticipant.getParticipants().stream()
                .filter(p -> p.username().equals(findParticipant.getUsername())).findFirst().orElseThrow();
        return participant;
    }

    private Participant createNewParticipant(FindParticipant findParticipant) {
        Participant participant;
        participant = new Participant(findParticipant.getUsername());
        findParticipant.getParticipants().add(participant);
        return participant;
    }

    private boolean isNewParticipant(FindParticipant findParticipant) {
        return findParticipant.getParticipants().stream()
                .noneMatch(p -> p.username().equals(findParticipant.getUsername()));
    }

}
