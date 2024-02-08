package org.example._09_10_23;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class Main {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    int sum = numbers.stream()
            .filter(el -> el % 2 == 0)
            .mapToInt(Integer::intValue)
            .sum();


  }


}
