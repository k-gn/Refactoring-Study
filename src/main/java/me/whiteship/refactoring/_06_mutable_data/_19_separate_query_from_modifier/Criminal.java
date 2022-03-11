package me.whiteship.refactoring._06_mutable_data._19_separate_query_from_modifier;

import java.util.List;

public class Criminal {

    // 조회
    public String findMiscreat(List<Person> people) {
        for (Person p : people) {
            if (p.getName().equals("Don")) {
                return "Don";
            }

            if (p.getName().equals("John")) {
                return "John";
            }
        }
        return "";
    }

    // 변경
    public void alertForMiscreant(List<Person> people) {
        if(!findMiscreat(people).isBlank()) {
            setOffAlarms();
        }
    }

    private void setOffAlarms() {
        System.out.println("set off alarm");
    }
}
