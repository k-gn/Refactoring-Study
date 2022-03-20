package me.whiteship.refactoring._22_data_class._42_encapsulate_record;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrganizationTest {

//    @Test
//    void test() {
//        Organization organization = new Organization();
//        organization.setName("gyul");
//        organization.setCountry("korea");
//        assertEquals("gyul", organization.getName());
//        assertEquals("gyul", organization.getName());
//    }

    @Test
    void test() {
        Organization organization = new Organization("gyul", "korea");
        assertEquals("gyul", organization.name());
        assertEquals("gyul", organization.country());
    }
}