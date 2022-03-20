package me.whiteship.refactoring._22_data_class._42_encapsulate_record;

// 데이터 클래스 : public 필드 또는 필드에 대한 게터와 세터만 있는 클래스
// 코드가 적절한 위치에 있지 않아 이러한 냄새가 생길 수 있다.
// 단계 쪼개기에서 중간 데이터를 표현하는데 사용할 레코드는 불변 객체로 데이터를 전달하는 용도로 사용할 수 있다.
// public 필드를 가지고 있다면 레코드 캡슐화하기를 통해 고칠 수 있다.
// 변경 되지 않아야 할 필드에는 세터 제거하기를 사용한다.
// 게터와 세터가 사용되는 메소드를 찾아보고 함수 옮기기를 사용해 데이터 클래스로 옮길 수 있다.
// 메소드 전체가 아니라 일부 코드만 옮겨야 한다면 함수 추출하기를 선행한다.
public class Organization {

    public String name;

    public String country;

}
