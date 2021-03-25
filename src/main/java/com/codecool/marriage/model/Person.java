package com.codecool.marriage.model;

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
}
