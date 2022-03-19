package me.whiteship.refactoring._21_alternative_classes_with_different_interfaces;

// 서로다른 인터페이스의 대안 클래스들
// 비슷한 일을 여러곳에서 서로 다른 규약을 사용해 지원하고 있는 코드냄새 (비슷하지만 다른 일을 하는데 서로 호환되지 않는 인터페이스)
// 서로 상호교환되어 사용될 수 없는 상태
// 대안 클래스로 사용하려면 동일한 인터페이스를 구현하고 있어야 한다.
// 함수 선언 변경하기와 함수 옮기기를 사용해 서로 동일한 인터페이스를 구현하게끔 코드를 수정할 수 있다.
// 두 클래스에서 일부 코드가 중복되는 경우 슈퍼클래스 추출하기를 사용해 중복 코드를 슈퍼클래스로 옮기고 두 클래스를 새로운 슈퍼클래스의 서브클래스로 만들 수 있다.
public class Order {
    public String getEmail() {
        return null;
    }
}
