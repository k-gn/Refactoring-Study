package me.whiteship.refactoring._03_long_function._08_introdce_parameter_object;

public class ParticipantPrinter {
    private final int totalNumberOfEvents;
    private final Participant p;

    public ParticipantPrinter(int totalNumberOfEvents, Participant p) {
        this.totalNumberOfEvents = totalNumberOfEvents;
        this.p = p;
    }

    public int getTotalNumberOfEvents() {
        return totalNumberOfEvents;
    }

    public Participant getP() {
        return p;
    }
}
