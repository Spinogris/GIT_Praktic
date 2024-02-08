package org.example._04_10_23;

import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 3, 5, 7, 3, 2, 5, 4, 2, 6, 7, 1, 4, 7);
    List<String> listString = Arrays.asList("1", "3", "4", "76", "3", "2", "5", "4", "2", "6", "4", "5", "1", "7");
    List<String> listStringWords = Arrays.asList(new String[]{
            "apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "honeydew", "kiwi", "lemon", "lime",
            "apple", "apricot", "blackberry", "date", "elderberry", "fig", "grape", "honeydew", "kiwi", "lemon",
            "mango", "nectarine", "orange", "papaya", "quince", "raspberry", "strawberry", "tangerine", "watermelon",
            "apple", "blueberry", "cantaloupe", "date", "elderberry", "fig", "grape", "honeydew", "kiwi", "lemon",
            "lime", "apricot", "banana", "cherry", "date", "elderberry", "fig", "grape", "honeydew", "kiwi", "lemon",
            "apple", "nectarine", "orange", "papaya", "quince", "raspberry", "strawberry", "tangerine", "watermelon",
            "apple", "banana", "cantaloupe", "date", "elderberry", "fig", "grape", "honeydew", "kiwi", "lemon",
            "mango", "nectarine", "orange", "papaya", "quince", "raspberry", "strawberry", "tangerine", "watermelon",
            "apple", "blueberry", "cantaloupe", "date", "elderberry", "fig", "grape", "honeydew", "kiwi", "lemon"
    });

    System.out.println("Задание 1: Фильтрация списка целых чисел на нечетные числа");
    List<Integer> list1 = list.stream()
            .filter(el -> (el % 2 == 0))
            .toList();
    System.out.println(list1);

    System.out.println("Задание 2: Преобразование списка строк в список чисел");
    List<Integer> list2 = listString.stream()
            .map(Integer::parseInt)
            .toList();
    System.out.println(list2);

    System.out.println("Задание 3: Суммирование списка чисел");
    int sum = list.stream()
            .mapToInt(Integer::intValue)
            .sum();
    System.out.println(sum);

    System.out.println("Задание 4: Определение максимального значения в списке");
    list.stream()
            .mapToInt(el -> {
              int maxVal = 0;
              for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > maxVal) {
                  maxVal = list.get(i);
                }
              }
              System.out.println(maxVal);
              return maxVal;
            });
    // Или
    List<Integer> max = list.stream()
            .max(Integer::compareTo)
            .stream().toList();
    System.out.println(max);
    // По подсказкам дошёл, но не понятно зачем второй stream на 48 строке...

    System.out.println("Задание 5: Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистр");
    List<String> upperCaseWords = listStringWords.stream()
            .filter(word -> word.startsWith(String.valueOf("q")))
            .map(String::toUpperCase)
            .toList();

    upperCaseWords.forEach(System.out::println);


    System.out.println("Задание 6: Получение списка уникальных слов из списка строк, длина которых больше 4 символов");
    List<String> wordsList = listStringWords.stream()
            .filter(words -> words.length() > 4)
            .distinct()
            .toList();
    wordsList.forEach(System.out::println);

    System.out.println("Задание 7:Преобразование списка объектов класса в список их имен, отсортированных по возрасту ------");


//Задание 8:Нахождение суммы чисел, кратных 3 и 5, из списка чисел -------
//Задание 9:Получение списка слов, содержащих только уникальные символы, из списка строк
  }

}