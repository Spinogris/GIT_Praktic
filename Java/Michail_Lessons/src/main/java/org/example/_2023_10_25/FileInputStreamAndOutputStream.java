package org.example._2023_10_25;

import java.io.*;

public class FileInputStreamAndOutputStream {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(s);
//        try (BufferedReader reader = new BufferedReader(new FileReader("img_1.png"));
//             BufferedWriter writer = new BufferedWriter(new FileWriter("img_1_B.png"))) {
//
//            int i;
//            while ((i = reader.read()) != -1) {
//                writer.write(i);
//            }
//            System.out.println("***DONE***");
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try (FileInputStream inputStream = new FileInputStream("img_1.png");
             FileOutputStream outputStream = new FileOutputStream("newImg.png")) {

            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }

            System.out.println("-----DONE-----");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}