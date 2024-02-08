package org.example._2023_11_15.regex;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx5 {
    public static void main(String[] args) {
        String cardData = "23562415889512361225999";
        String regex = "(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cardData);
        String newString = matcher.replaceAll("CARD NUMBER:$1 $2 $3 $4 DATA:$5/$6 CVV:$7");
        System.out.println(newString);
    }
}