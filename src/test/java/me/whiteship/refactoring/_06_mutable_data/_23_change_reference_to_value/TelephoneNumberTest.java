package me.whiteship.refactoring._06_mutable_data._23_change_reference_to_value;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelephoneNumberTest {

    @Test
    void testEquals() {
        TelephoneNumber number1 = new TelephoneNumber("123", "1234");
        TelephoneNumber number2 = new TelephoneNumber("123", "1234");

        assertEquals(number1, number2);
    }

    @Test
    void testPerson() {
        TelephoneNumber number = new TelephoneNumber("123", "1234");
        Person person = new Person(number);

        assertEquals("123", person.officeAreaCode());
        assertEquals("1234", person.officeNumber());
    }
}