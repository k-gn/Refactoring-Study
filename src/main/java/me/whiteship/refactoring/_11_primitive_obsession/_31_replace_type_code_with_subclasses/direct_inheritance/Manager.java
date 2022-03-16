package me.whiteship.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.direct_inheritance;

public class Manager extends Employee {

    public Manager(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "manager";
    }
}
