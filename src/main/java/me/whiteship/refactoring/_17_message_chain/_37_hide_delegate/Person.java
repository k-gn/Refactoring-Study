package me.whiteship.refactoring._17_message_chain._37_hide_delegate;

public class Person {

    private String name;

    private Department department;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Person getManager() {
        return getDepartment().getManager(); // 위임과정을 getManager() 안으로 숨김
    }
}
