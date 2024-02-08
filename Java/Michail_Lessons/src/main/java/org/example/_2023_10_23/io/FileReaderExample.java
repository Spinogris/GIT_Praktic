package org.example._2023_10_23.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws FileNotFoundException {
        try (FileReader fileReader = new FileReader("222.txt")) {
            int c;

            while ((c = fileReader.read()) != -1) {
                System.out.print((char) c);
            }

            System.out.println("\n");
            System.out.println("***DONE***");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}