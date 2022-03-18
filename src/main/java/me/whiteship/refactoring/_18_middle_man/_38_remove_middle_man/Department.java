package me.whiteship.refactoring._18_middle_man._38_remove_middle_man;

// 중재자
// 캡슐화를 통해 내부의 구체적인 정보를 최대한 감출수 있다.
// 캡슐화도 정도가 있다.
// 그러나 어떤 클래스의 메소드가 대부분 다른 클래스로 메소드 호출을 위임하고 있다면 중재자를 제거하고 클라이언트가 해당 클래스를 직접 사용하도록 코드를 개선할 수 있다.
public class Department {

    private Person manager;

    public Department(Person manager) {
        this.manager = manager;
    }

    public Person getManager() {
        return manager;
    }
}
