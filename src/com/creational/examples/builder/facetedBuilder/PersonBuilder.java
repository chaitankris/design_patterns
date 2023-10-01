package com.creational.examples.builder.facetedBuilder;

public class PersonBuilder {
    protected Person person = new Person();

    public AddressBuilder lives(){
        return new AddressBuilder(person);
    }

    public EmploymentBuilder works(){
        return new EmploymentBuilder(person);
    }

    public Person build(){
        return person;
    }
}
