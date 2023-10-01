package com.creational.examples.builder.inheritenceBuilder;

import java.util.Date;

public class PersonBuilder<T extends PersonBuilder<T>> {
    protected final Person person = new Person();

    public T name(String name){
        person.name = name;
        return self();
    }
    public T address(String address){
        person.address = address;
        return self();
    }
    public T companyName(String companyName){
        person.companyName = companyName;
        return self();
    }
    public T dob(Date dob){
        person.dateOfBirth = dob;
        return self();
    }
    protected T self(){
        return (T) this;
    }
    public Person build(){
        return person;
    }
}
