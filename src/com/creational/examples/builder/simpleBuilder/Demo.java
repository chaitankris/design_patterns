package com.creational.examples.builder.simpleBuilder;

public class Demo {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();

        Person krishna = personBuilder.name("Krishna")
                .companyName("Jane Street")
                .address("101 Jane Street, NY")
                .build();

        System.out.println(krishna);
    }
}
