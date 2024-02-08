package de.telran.serializable.jackson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {
    private int countryCode;
    private String city;
    private String street;

    public Address(int countryCode, String city, String street) {
        this.countryCode = countryCode;
        this.city = city;
        this.street = street;
    }

    public Address() {
    }

    public int getCountryCode() {
        return countryCode;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "countryCode=" + countryCode +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
