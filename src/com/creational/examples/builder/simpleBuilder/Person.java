package com.creational.examples.builder.simpleBuilder;

public class Person {
    String name;
    String companyName;
    String address;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
