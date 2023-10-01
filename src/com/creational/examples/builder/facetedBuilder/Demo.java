package com.creational.examples.builder.facetedBuilder;

public class Demo {
    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();
        Person person = pb
                .works()
                    .annualIncome(150000)
                    .companyName("SalesForce")
                    .position("Developer")
                .lives()
                    .streetAddress("123 London Road")
                    .city("London")
                    .postcode("SW12BC")
                .build();
        System.out.println(person);
    }
}
