package me.whiteship.refactoring._11_primitive_obsession._32_replace_conditional_with_polymorphism.swtiches;

import java.util.List;

// 조건부 로직을 다형성으로 바꾸기
// 복잡한 조건식을 상속과 다형성을 사용해 코드를 보다 명확하게 분리할 수 있다.
// switch 문을 사용해서 타입에 따라 각기 다른 로직을 사용하는 코드에서
// 기본 동작과 특수한 기능이 섞여있는 경우에 상속 구조를 만들어서 기본 동작을 상위클래스에 두고 특수한 기능을 하위클래스로 옮겨서 각 타입에 따른 차이점을 강조할 수 있다.
// 모든 조건문을 다형성으로 옮겨야 하는가? 단순한 조건문은 그대로 두어도 좋다. 오직 복잡한 조건문을 다형성을 활요해 좀 더 나은 코드로 만들 수 있을 때 적용한다.
public abstract class Employee {

//    protected String type;

    protected List<String> availableProjects;

//    public Employee(String type, List<String> availableProjects) {
//        this.type = type;
//        this.availableProjects = availableProjects;
//    }

    public Employee(List<String> availableProjects) {
        this.availableProjects = availableProjects;
    }

    public Employee() {
    }

    public abstract int vacationHours();
//    {
//        return switch (type) {
//            case "full-time" -> 120;
//            case "part-time" -> 80;
//            case "temporal" -> 32;
//            default -> 0;
//        };
//    }

    public abstract boolean canAccessTo(String project);
//    {
//        return switch (type) {
//            case "full-time" -> true;
//            case "part-time", "temporal" -> this.availableProjects.contains(project);
//            default -> false;
//        };
//    }
}
