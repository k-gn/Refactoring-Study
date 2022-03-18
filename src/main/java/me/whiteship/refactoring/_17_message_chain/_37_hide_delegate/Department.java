package me.whiteship.refactoring._17_message_chain._37_hide_delegate;

// 메시지 체인
// 레퍼런스를 따라 계속해서 메소드 호출이 이어지는 코드
// 해당 코드의 클라이언트가 코드 체인을 모두 이해해야한다.
// 체인 중 일부가 변경된다면, 클라이언트의 코드도 변경해야 한다.

// 위임 숨기기

public class Department {

    private String chargeCode;

    private Person manager;

    public Department(String chargeCode, Person manager) {
        this.chargeCode = chargeCode;
        this.manager = manager;
    }

    public String getChargeCode() {
        return chargeCode;
    }

    public Person getManager() {
        return manager;
    }
}
