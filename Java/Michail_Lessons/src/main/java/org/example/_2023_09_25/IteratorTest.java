package org.example._2023_09_25;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorTest {
  private static boolean isPalindrome(String word) {
    return true;
  }

  public static void main(String[] args) {
    String palindrome = "MADAM";
    String notPalindrome = "YESTERDAY";

    System.out.println("MADAM: " + isPalindrome(palindrome));
    System.out.println("YESTERDAY: " + isPalindrome(palindrome));


  }

//  private static boolean palindrome(String word) {
//    List<Character> pal = new ArrayList<>();
//    for (int i = 0; i < word.length(); i++) {
//      pal.add(word.charAt(i));
//    }
//    ListIterator<Character> listForward = pal.listIterator();
//    ListIterator<Character> listBack = pal.listIterator(pal.size());
//
////    while (listForward.hasNext() && listBack.hasPrevious()) {
////      char start = listForward.next();
////      char end = listBack.previous();
////      if (start)
////
////    }
//
//  }
}
