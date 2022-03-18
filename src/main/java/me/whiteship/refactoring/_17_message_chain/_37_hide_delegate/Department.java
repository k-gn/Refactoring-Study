package me.whiteship.refactoring._17_message_chain._37_hide_delegate;

// 메시지 체인
// 레퍼런스를 따라 계속해서 메소드 호출이 이어지는 코드
// 해당 코드의 클라이언트가 코드 체인을 모두 이해해야한다.
// 체인 중 일부가 변경된다면, 클라이언트의 코드도 변경해야 한다.

// 위임 숨기기
// 캡슐화 - 어떤 모듈이 시스템의 다른 모듈을 최소한으로 알아야 하는 것
// 그래야 변경 시, 최소한의 모듈만 그 변경에 영향을 받을 것이고, 그래야 무언가를 변경하기 쉽다.
// 처음 객체 지향에서 캡슐화를 배울 때 필드를 메소드로 숨기는 것이라 배우지만, 사실 메소드 호출도 숨길 수 있다.
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
