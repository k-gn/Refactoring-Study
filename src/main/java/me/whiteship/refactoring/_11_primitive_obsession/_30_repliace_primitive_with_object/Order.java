package me.whiteship.refactoring._11_primitive_obsession._30_repliace_primitive_with_object;

// 기본형 집착
// 애플리케이션이 다루고 있는 도메인에 필요한 기본타입을 만들지 않고 프로그래밍 언어가 제공하는 기본타입을 사용하는 경우가 많다.
// 기본형으로 단위 또는 표기법을 표현하기 어렵다.

// 기본형을 객체로 바꾸기
// 개발 초기에는 기본형으로 표현한 데이터가 나중에 해당 데이터와 관련있는 다양한 기능을 필요로 하는 경우가 발생
// ex) 문자열로 표현하던 전화번호의 지역코드가 필요하거나, 다양한 포맷을 지원하는 경우
// ex) 숫자로 표현하던 온도의 단위를 변환하는 경우
// 기본형을 사용한 데이터를 감싸줄 클래스를 만들면 필요한 기능을 추가할 수 있다.
public class Order {

    private Priority priority;

    public Order(String priorityValue) {
        this(new Priority(priorityValue));
    }

    public Order(Priority priority) {
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }
}
