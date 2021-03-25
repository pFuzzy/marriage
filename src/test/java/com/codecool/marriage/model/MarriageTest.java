package com.codecool.marriage.model;

import com.codecool.marriage.exception.AlreadyMarriedException;
import com.codecool.marriage.exception.SameGenderException;
import com.codecool.marriage.exception.UnderAgeException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MarriageTest {
    @Test
    public void sameGenderMarriageThrowsSameGenderException(){
        Person testPerson1 = new Person("James", true, 20);
        Person testPerson2 = new Person("Thomas", true, 22);

        assertThrows(SameGenderException.class, () -> testPerson1.marry(testPerson2));
    }

    @Test
    public void underAgeMarriageThrowsUnderAgeException(){
        Person testPerson1 = new Person("James", true, 17);
        Person testPerson2 = new Person("Jane", false, 19);

        assertThrows(UnderAgeException.class, ()-> testPerson1.marry(testPerson2));
    }

    @Test
    public void beingAlreadyMarriedThrowsAlreadyMarriedException(){
        Person testPerson1 = new Person("James", true, 20);
        Person testPerson2 = new Person("Jane", false, 21);
        testPerson1.setMarried(true);

        assertThrows(AlreadyMarriedException.class, ()-> testPerson1.marry(testPerson2));
    }
}
