package com.creational.examples.builder.inheritenceBuilder;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {

    public EmployeeBuilder position(String position) {
        person.position = position;
        return this;
    }

    @Override
    protected EmployeeBuilder self(){
        return this;
    }
}
