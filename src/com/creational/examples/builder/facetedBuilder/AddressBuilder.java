package com.creational.examples.builder.facetedBuilder;

public class AddressBuilder extends PersonBuilder {
    protected Person person;

    public AddressBuilder(Person person){
        this.person = person;
    }

    public AddressBuilder streetAddress(String streetAddress) {
        person.streetAddress = streetAddress;
        return this;
    }

    public AddressBuilder postcode(String postcode) {
        person.postcode = postcode;
        return this;
    }

    public AddressBuilder city(String city) {
        person.city = city;
        return this;
    }
}
