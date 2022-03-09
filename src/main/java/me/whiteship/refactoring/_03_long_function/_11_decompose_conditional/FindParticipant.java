package me.whiteship.refactoring._03_long_function._11_decompose_conditional;

import java.util.List;

public class FindParticipant {
    private final String username;
    private final List<Participant> participants;

    public FindParticipant(String username, List<Participant> participants) {
        this.username = username;
        this.participants = participants;
    }

    public String getUsername() {
        return username;
    }

    public List<Participant> getParticipants() {
        return participants;
    }
}
