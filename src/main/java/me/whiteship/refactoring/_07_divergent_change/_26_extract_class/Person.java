package me.whiteship.refactoring._07_divergent_change._26_extract_class;

// 클래스 추출하기
// 클래스가 다루는 책임이 많아질수록 클래스가 점차 커진다
// 클래스를 쪼개는 기준
// - 데이터나 메소드 중 일부가 매우 밀접한 관련이 있을 경우
// - 일부 데이터가 대부분 같이 바뀌는 경우
// 하위 클래스를 만들어 책임을 분산 시킬 수도 있다.
// 클래스가 커질수록 클래스가 하는일을 이해하기 어려울 수 있다.
public class Person {

    private final TelephoneNumber telephoneNumber;
    private String name;

    public Person(TelephoneNumber telephoneNumber, String name) {
        this.telephoneNumber = telephoneNumber;
        this.name = name;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TelephoneNumber getTelephoneNumber() {
        return telephoneNumber;
    }
}
