package com.creational.examples.builder.simpleBuilder;

public class PersonBuilder {
    private final Person person = new Person();

    public PersonBuilder name(String name){
        person.name = name;
        return this;
    }
    public PersonBuilder address(String address){
        person.address = address;
        return this;
    }
    public PersonBuilder companyName(String companyName){
        person.companyName = companyName;
        return this;
    }
    public Person build(){
        return person;
    }
}
