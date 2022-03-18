package me.whiteship.refactoring._16_temporary_field._36_introduce_special_case;

public class UnknownCustomer extends Customer {

    public UnknownCustomer() {
        super("unknown", null, null);
    }

    @Override
    boolean isUnknown() {
        return true;
    }
}
