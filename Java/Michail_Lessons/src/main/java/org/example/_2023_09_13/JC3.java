package org.example._2023_09_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JC3 {
  public static void main(String[] args) {

    List<String> list = new ArrayList<>();

    String[] strings = {"Contents", "Home", "bin", "java -", "javaagent:", "/private/", "var"};

    for (int i = 0; i < strings.length; i++) {
      System.out.println(strings[i]);
    }
    System.out.println(Arrays.toString(strings));


  }
}
