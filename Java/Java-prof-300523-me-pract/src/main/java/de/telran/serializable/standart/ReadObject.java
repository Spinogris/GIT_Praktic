package de.telran.serializable.standart;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String login  =  "vasya";
        Path path = Paths.get(login+".dat");

        try (ObjectInputStream ois = new ObjectInputStream(
                Files.newInputStream(path))) {
            Person read = (Person) ois.readObject();
            System.out.printf("Read person: %s", read);
        }
    }
}
