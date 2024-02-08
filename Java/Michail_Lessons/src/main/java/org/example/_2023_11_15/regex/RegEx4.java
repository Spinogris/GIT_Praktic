package org.example._2023_11_15.regex;

public class RegEx4 {
    public static void main(String[] args) {
        String text = "  mama  _myla          ramu";
        //text = text.replace("mama", "java");
        text = text.replaceAll(" {2,}", " ");
        System.out.println(text);


    }
}
