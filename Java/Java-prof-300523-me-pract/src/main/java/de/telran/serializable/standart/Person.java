package de.telran.serializable.standart;

import de.telran.serializable.standart.manual.Address;

import java.io.Serializable;

public class Person implements Serializable {
    private final String firstName;
    private final String lastName;
    private final Address address;

    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "[Person " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ']';
    }
}