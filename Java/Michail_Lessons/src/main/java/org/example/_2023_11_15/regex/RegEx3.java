package org.example._2023_11_15.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx3 {
    public static void main(String[] args) {
        String text = "+ABCYDABCDE AB8CD ABC ABCDAB ABABABCF _ABCDABCDEF ABABF AB99 ABA";
        Pattern pattern = Pattern.compile("AB(AB)*");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + " : " + matcher.group());
        }
    }
}
