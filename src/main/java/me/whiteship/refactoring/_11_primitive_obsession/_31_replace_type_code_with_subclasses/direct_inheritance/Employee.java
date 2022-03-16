package me.whiteship.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.direct_inheritance;

import java.util.List;

// 타입 코드를 서브클래스로 바꾸기
// 비슷하지만 다른 것들을 표현해야 하는 경우, 문자열, 열거형, 숫자 등으로 표현하기도 한다.
// 타입을 서브클래스로 바꾸는 계기
// 1. 조건문을 다형성으로 표현할 수 있을 때
// 2. 특정 타입에만 유효한 필드가 있을 때

// 직접 상속 사용
public abstract class Employee {

    private String name;

    protected Employee(String name) {
        this.name = name;
    }

    public static Employee createEmployee(String name, String type) {
        return switch (type) {
            case "engineer" -> new Engineer(name);
            case "manager" -> new Manager(name);
            case "salesman" -> new Salesman(name);
            default -> throw new IllegalArgumentException(type);
        };
    }

    public abstract String getType();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", type='" + getType() + '\'' +
                '}';
    }
}
