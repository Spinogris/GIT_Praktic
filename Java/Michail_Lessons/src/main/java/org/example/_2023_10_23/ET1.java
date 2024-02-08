package org.example._2023_10_23;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *   try { code with problems}
 *   catch (exception) { do }
 */

/**
 * try (resources) { code with problems}
 * catch (exception) { do }
 */
public class ET1 {
    public static void main(String[] args) {


        while (true) {
            System.out.println("Please input a digit");
            try (Scanner scanner = new Scanner(System.in)) {
                int digit = scanner.nextInt();
                System.out.println("Digit: " + digit);
                break;
            } catch (InputMismatchException exception) {
                System.out.println("It is not a digit!!!!! Try again!");
            }
        }

        System.out.println("END");
    }
}
