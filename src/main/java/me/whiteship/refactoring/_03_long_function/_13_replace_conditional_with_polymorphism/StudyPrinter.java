package me.whiteship.refactoring._03_long_function._13_replace_conditional_with_polymorphism;

        import java.io.FileWriter;
        import java.io.IOException;
        import java.io.PrintWriter;
        import java.util.Comparator;
        import java.util.List;

public abstract class StudyPrinter {

    protected int totalNumberOfEvents;

    protected List<Participant> participants;

//    protected PrinterMode printerMode;

    public StudyPrinter(int totalNumberOfEvents, List<Participant> participants) {
        this.totalNumberOfEvents = totalNumberOfEvents;
        this.participants = participants;
        this.participants.sort(Comparator.comparing(Participant::username));
//        this.printerMode = printerMode;
    }

    public abstract void execute() throws IOException;

    /*public void execute() throws IOException {
        switch (printerMode) {
            case CVS -> {
            }
            case CONSOLE -> {
            }
            case MARKDOWN -> {
            }
        }
    }*/

    /**
     * |:white_check_mark:|:white_check_mark:|:white_check_mark:|:x:|
     */
    protected String checkMark(Participant p) {
        StringBuilder line = new StringBuilder();
        for (int i = 1 ; i <= this.totalNumberOfEvents ; i++) {
            if(p.homework().containsKey(i) && p.homework().get(i)) {
                line.append("|:white_check_mark:");
            } else {
                line.append("|:x:");
            }
        }
        return line.toString();
    }
}
