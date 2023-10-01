package com.creational.examples.builder.inheritenceBuilder;

import java.util.Date;

public class Person {
    String name;
    String companyName;
    String address;
    Date dateOfBirth;
    String position;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", position='" + position + '\'' +
                '}';
    }
}
