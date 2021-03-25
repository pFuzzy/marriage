package com.codecool.marriage.model;

import com.codecool.marriage.exception.AlreadyMarriedException;
import com.codecool.marriage.exception.SameGenderException;
import com.codecool.marriage.exception.UnderAgeException;

public class Person {

    private String name;
    private boolean isMale;
    private int age;
    private boolean isMarried;

    public Person(String name, boolean isMale, int age) {
        this.name = name;
        this.isMale = isMale;
        this.age = age;
    }

    public boolean marry(Person personToMarry) throws SameGenderException, UnderAgeException, AlreadyMarriedException {
        if((isMale() && personToMarry.isMale()) || (!isMale() && !personToMarry.isMale())){
            throw new SameGenderException("Same gender marriage is not allowed!");
        }
        if(getAge() < 18 || personToMarry.getAge() < 18){
            throw new UnderAgeException("Underage marriage is not allowed!");
        }
        if(isMarried() || personToMarry.isMarried()){
            throw new AlreadyMarriedException("Already married!");
        }
        setMarried(true);
        personToMarry.setMarried(true);
        return true;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return isMale;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(boolean gender) {
        this.isMale = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }
}
