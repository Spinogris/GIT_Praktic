package de.telran.serializable.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.protobuf.ProtobufMapper;
import com.fasterxml.jackson.dataformat.protobuf.schema.ProtobufSchema;

public class JacksonProtobufMain {
    public static void main(String[] args) throws Throwable {
        ProtobufMapper om = new ProtobufMapper();
        ProtobufSchema schema = om.generateSchemaFor(Person.class);

        Person person = new Person("Вася", "Пупкин",
                new Address(7, "Н", "Бассейная"));
        byte[] bytes = om.writer(schema).writeValueAsBytes(person);

        Person read = om.readerFor(Person.class)
                .with(schema)
                .readValue(bytes);
        System.out.printf("Read person: %s\n", read);
    }
}
