package com.codecool.marriage.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void basicPersonTest(){
        Person testPerson = new Person("Peter",true,24);

        assertEquals(testPerson.getName(), "Peter");
        assertTrue(testPerson.isMale());
        assertEquals(testPerson.getAge(), 24);
    }
}