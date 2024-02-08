package de.telran.serializable.standart.auto;

import java.io.Serializable;
import java.util.Optional;

public class Address implements Serializable {
    private final int countryCode;
    private final String city;
    private final String street;

    public Address(int countryCode, String city, String street) {
        this.countryCode = countryCode;
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return "[Address " +
                "countryCode=" + countryCode +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ']';
    }
}