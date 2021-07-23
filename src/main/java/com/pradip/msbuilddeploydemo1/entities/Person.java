package com.pradip.msbuilddeploydemo1.entities;

public class Person {
    String fullName;
    //String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.fullName = String.format("%s %s", firstName, lastName);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
