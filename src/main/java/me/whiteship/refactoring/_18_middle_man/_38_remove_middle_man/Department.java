package me.whiteship.refactoring._18_middle_man._38_remove_middle_man;

// 중재자
// 캡슐화를 통해 내부의 구체적인 정보를 최대한 감출수 있다.
// 캡슐화도 정도가 있다.
// 그러나 어떤 클래스의 메소드가 대부분 다른 클래스로 메소드 호출을 위임하고 있다면 중재자를 제거하고 클라이언트가 해당 클래스를 직접 사용하도록 코드를 개선할 수 있다.

// 중재자 제거하기
// 위임 숨기기에 반대
// 필요한 캡슐화의 정도는 시간 또는 상황에 따라 바뀔 수 있다.
// 위임하고 있는 객체를 클라이언트가 사용할 수 있도록 getter 를 제공하고, 클라이언트는 메시지 체인을 사용하도록 코드를 고친뒤에 캡슐화에 사용했던 메소드를 제거한다.
// 디미터의 법칙 - 가장 가까운 객체만 사용한다.
// 지나치게 따르기 보다 상황에 맞게 활용하는게 중요함
public class Department {

    private Person manager;

    public Department(Person manager) {
        this.manager = manager;
    }

    public Person getManager() {
        return manager;
    }
}
