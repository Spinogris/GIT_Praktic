package org.example._2023_10_23.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        String text = "Conseguir un iPhone " +
                "con iOS 17 por solo 168 euros es " +
                "posible con esta irresistible oferta de Amazon";

        try (FileWriter writer = new FileWriter("write.txt", true)) {
            for (int i = 0; i < text.length(); i++) {
                writer.write(text.charAt(i));
            }
            System.out.println("***DONE***");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}