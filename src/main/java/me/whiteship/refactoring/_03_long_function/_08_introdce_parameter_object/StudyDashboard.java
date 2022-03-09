package me.whiteship.refactoring._03_long_function._08_introdce_parameter_object;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueComment;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 매개변수 객체 만들기
// 같은 매개변수들이 여러 메소드에 걸쳐 나타난다면, 그 매개변수들을 묶은 자료구조를 만들 수 있다. (매개변수들이 서로 연관이 있다.)
public class StudyDashboard {

    public static void main(String[] args) throws IOException, InterruptedException {
        StudyDashboard studyDashboard = new StudyDashboard();
        studyDashboard.print();
    }

    private void print() throws IOException, InterruptedException {
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
        List<Participant> participants = new CopyOnWriteArrayList<>();

        int totalNumberOfEvents = 15;
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
                            String username = comment.getUserName();
                            boolean isNewUser = participants.stream().noneMatch(p -> p.username().equals(username));
                            Participant participant = null;
                            if (isNewUser) {
                                participant = new Participant(username);
                                participants.add(participant);
                            } else {
                                participant = participants.stream().filter(p -> p.username().equals(username)).findFirst().orElseThrow();
                            }

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

        try (FileWriter fileWriter = new FileWriter("participants.md");
             PrintWriter writer = new PrintWriter(fileWriter)) {
            participants.sort(Comparator.comparing(Participant::username));

            writer.print(header(totalNumberOfEvents, participants.size()));

            participants.forEach(p -> {
                String markdownForHomework = getMarkdownForParticipant(new ParticipantPrinter(totalNumberOfEvents, p));
                writer.print(markdownForHomework);
            });
        }
    }

    private double getRate(ParticipantPrinter participantPrinter) {
        long count = participantPrinter.getP().homework().values().stream()
                .filter(v -> v == true)
                .count();
        double rate = count * 100 / participantPrinter.getTotalNumberOfEvents();
        return rate;
    }

    private String getMarkdownForParticipant(ParticipantPrinter participantPrinter) {
        return String.format("| %s %s | %.2f%% |\n"
                , participantPrinter.getP().username()
                , checkMark(new ParticipantPrinter(participantPrinter.getTotalNumberOfEvents(), participantPrinter.getP()))
                , getRate(new ParticipantPrinter(participantPrinter.getTotalNumberOfEvents(), participantPrinter.getP())));
    }

    /**
     * | 참여자 (420) | 1주차 | 2주차 | 3주차 | 참석율 |
     * | --- | --- | --- | --- | --- |
     */
    private String header(int totalNumberOfEvents, int totalNumberOfParticipants) {
        StringBuilder header = new StringBuilder(String.format("| 참여자 (%d) |", totalNumberOfParticipants));

        for (int index = 1; index <= totalNumberOfEvents; index++) {
            header.append(String.format(" %d주차 |", index));
        }
        header.append(" 참석율 |\n");

        header.append("| --- ".repeat(Math.max(0, totalNumberOfEvents + 2)));
        header.append("|\n");

        return header.toString();
    }

    /**
     * |:white_check_mark:|:white_check_mark:|:white_check_mark:|:x:|
     */
    private String checkMark(ParticipantPrinter participantPrinter) {
        StringBuilder line = new StringBuilder();
        for (int i = 1 ; i <= participantPrinter.getTotalNumberOfEvents() ; i++) {
            if(participantPrinter.getP().homework().containsKey(i) && participantPrinter.getP().homework().get(i)) {
                line.append("|:white_check_mark:");
            } else {
                line.append("|:x:");
            }
        }
        return line.toString();
    }
}
