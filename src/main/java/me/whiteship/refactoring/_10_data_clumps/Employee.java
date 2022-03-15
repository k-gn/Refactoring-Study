package me.whiteship.refactoring._10_data_clumps;

public class Employee {

    private TelephoneNumber personalPhoneNumber;
    private String name;

    public Employee(String name, TelephoneNumber telephoneNumber) {
        this.name = name;
        this.personalPhoneNumber = telephoneNumber;
    }

    public String personalPhoneNumber() {
        return this.personalPhoneNumber.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
