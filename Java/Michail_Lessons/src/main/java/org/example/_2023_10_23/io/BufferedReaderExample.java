package org.example._2023_10_23.io;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws RuntimeException {
        try (BufferedReader reader = new BufferedReader(new FileReader("222.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("buffered.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}