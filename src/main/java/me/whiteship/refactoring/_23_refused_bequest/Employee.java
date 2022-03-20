package me.whiteship.refactoring._23_refused_bequest;

// 상속 포기
// 서브 클래스가 슈퍼클래스에서 제공하는 메소드나 데이터를 잘 활용하지 않는다는 것은 상속 구조에 문제가 있다는 뜻
// 기존의 서브클래스 또는 새로운 서브클래스를 만들고 슈퍼클래스에서 메소드와 필드를 내려주면 슈퍼클래스에 공동으로 사용하는 기능만 남길 수 있다.
// 서브클래스가 슈퍼클래스의 기능을 재사용하고 싶지만 인터페이스를 따르고 싶지 않은 경우에는 슈퍼클래스 또는 서브클래스를 위임으로 교체하기 적용가능
public class Employee {

}
