package de.telran.serializable.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonJsonMain {
    public static void main(String[] args) throws Throwable {
        ObjectMapper om = new ObjectMapper();
        Person person = new Person("Вася", "Пупкин",
                new Address(7, "Н", "Бассейная"));

        String json = om.writeValueAsString(person);
        json = "{\"firstName\":\"Вася\",\"lastName\":\"Пупкин\",\"address\":{\"countryCode\":7,\"city\":\"Н\",\"street\":\"Бассейная\",\"number\":7}}";
        Person read = om.readValue(json, Person.class);
        System.out.printf("Read person: %s\n", read);
    }
}
