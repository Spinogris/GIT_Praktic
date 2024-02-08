package org.example._2023_11_15.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {
    public static void main(String[] args) {
        String text = "+ABCYDABCDE AB8CD ABC ABCDAB ABCF _ABCDABCDEF ABF AB99 ABA";
        //String text = "ABC8";
        //Pattern pattern = Pattern.compile("ABC");
        //Pattern pattern = Pattern.compile("AB[C-Y]");
        //Pattern pattern = Pattern.compile("AB[C-Y0-9]");
        //Pattern pattern = Pattern.compile("AB[^C-Y0-9]");
        //Pattern pattern = Pattern.compile("AB[^C-Y0-9]");
        //Pattern pattern = Pattern.compile("AB[^C-Y0-9]");
        //Pattern pattern = Pattern.compile("AB(C|8)");
        //Pattern pattern = Pattern.compile("AB.");
        //Pattern pattern = Pattern.compile("[0-9]");
        //Pattern pattern = Pattern.compile("^ABC"); todo
        //Pattern pattern = Pattern.compile("[0-9]");
        //Pattern pattern = Pattern.compile("\\d");
        //Pattern pattern = Pattern.compile("\\D");
        //Pattern pattern = Pattern.compile("\\W");
        //Pattern pattern = Pattern.compile("\\w+");
        //Pattern pattern = Pattern.compile("\\w{4}");
        Pattern pattern = Pattern.compile("\\b\\w{4}\\b");
        //Pattern pattern = Pattern.compile("\\+\\w{3}"); todo
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + " : " + matcher.group());
        }
    }
}
