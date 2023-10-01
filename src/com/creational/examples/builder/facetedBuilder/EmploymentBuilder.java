package com.creational.examples.builder.facetedBuilder;

public class EmploymentBuilder extends  PersonBuilder{
    protected  Person person;

    public EmploymentBuilder(Person person) {
        this.person = person;
    }

    public EmploymentBuilder companyName(String companyName) {
        person.companyName = companyName;
        return this;
    }

    public EmploymentBuilder position(String position) {
        person.position = position;
        return this;
    }

    public EmploymentBuilder annualIncome(int income) {
        person.annualIncome = income;
        return this;
    }
}
