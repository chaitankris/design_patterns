package com.creational.examples.builder.inheritenceBuilder;

import java.util.Calendar;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Person vishnu = new EmployeeBuilder().name("Vishnu")
                .companyName("Salesforce").position("Developer")
                .address("San Francisco, USA")
                .dob(new Date(1995, Calendar.SEPTEMBER,10))
                .build();
        System.out.println(vishnu);
    }
}
