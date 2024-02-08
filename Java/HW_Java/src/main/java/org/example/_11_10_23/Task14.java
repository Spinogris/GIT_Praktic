package org.example._11_10_23;

import lombok.*;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Getter
@Setter
@Builder
@AllArgsConstructor
@ToString
public class Task14 {
  public static void main(String[] args) {

    m1();
    m2();
    m3();

  }
  // * Дан список строк. Необходимо найти количество строк, которые содержат заданную подстроку.

  private static void m1() {
    List<String> list = Arrays.asList("Java", "JavaScript", "Python", "Ruby");
    String string = "Java";
    long listM1 = list.stream()
            .filter(s -> s.contains(string))
            .count();
    System.out.println("Количество подстрок: " + listM1);

  }
//*************************************************************************************


//     * Дан список целых чисел. Необходимо найти максимальный
//     * элемент списка, который делится на заданное число без остатка.

    private static void m2() {
      List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);
      int n = 2;
      int max = list.stream()
              .filter(el -> el % 2 == 0)
              .max(Integer::compareTo)
              .get();
      System.out.println("Kоличество строк, которые содержат заданную подстроку: " + max);

    }
//*************************************************************************************

//       * Дана коллекция объектов класса Person. Класс Person содержит поля name и age.
//       * Необходимо найти средний возраст людей, чьи имена начинаются на заданную букву.

      private static void m3() {
        List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("Fan", 25),
                new Person("Jack", 30),
                new Person("Sames", 35),
                new Person("Will", 40)
        );
        Integer reduce = people.stream()
                .filter(person -> person.getName().startsWith("J"))
                .mapToInt(Person::getAge)
                .reduce(0, Integer::sum);

        Long count = people.stream()
                .filter(el-> el.getName().startsWith(("J")))
                .count();
        System.out.println("Cредний возраст людей, чьи имена начинаются на заданную букву: " + reduce / count);
      }
//*************************************************************************************


//         * Дана коллекция строк. Необходимо найти все уникальные слова, которые содержатся в
//         * этой коллекции строк, и вернуть их в виде списка.

        private static void m4() {
          List<String> lines = Arrays.asList(
                  "Java is a programming language.",
                  "Java is widely used in enterprise applications.",
                  "Python is gaining popularity as a data science tool.",
                  "Python is a versatile programming language."
          );

        }
//*************************************************************************************


//           * Подсчитать буквы в нижнем и верхнем регистре
           String ss = "KikJhYggfTgf";
//           *************************************************************************************

//           * Определите все символьные строки максимальной длины в заданном конечном потоке символьных строк. через Optional
//           Stream<String> stream = Stream.of("we", "wee", "qwer", "oooo");
//           Optional<Map.Entry<Integer, List<String>>> max =
//           *************************************************************************************

           /**
           * Дан список сотрудников, у каждого из которых есть поле "salary".
           * Необходимо найти среднюю зарплату сотрудников, работающих на должности "developer"
           * в компаниях, которые находятся в городах, начинающихся на букву "M".
           */
//*************************************************************************************

          /**
           * У нас есть список списков numbers,
           * и мы хотим получить все четные числа из этих списков.
           * Мы используем flatMap, чтобы преобразовать каждый внутренний
           * список в поток чисел, а затем фильтруем только четные числа.
           * Результат: Even numbers: [2, 4, 6].
           */
          List<List<Integer>> numbers = Arrays.asList(
                  Arrays.asList(1, 2),
                  Arrays.asList(3, 4),
                  Arrays.asList(5, 6)
          );
//*************************************************************************************

          /**
           * Есть два списка list1 и list2, и мы
           * хотим получить все возможные комбинации сумм чисел из обоих списков.
           * Мы используем flatMap, чтобы преобразовать каждый элемент из list1 в поток,
           * затем применяем map, чтобы создать поток сумм чисел из list1 и list2,
           * и наконец, собираем все значения в combinedList.
           * Результат: Combined list: [5, 6, 7, 6, 7, 8, 7, 8, 9].
           */
          List<Integer> list1 = Arrays.asList(1, 2, 3);
          List<Integer> list2 = Arrays.asList(4, 5, 6);


          // ------------------------------------------------------------------------------------------------------------------------
                 // Для тех кому все легко
          /**
           * Задача 1.txt: Найти k-ую перестановку из n элементов
           * Дано число n и число k, необходимо найти k-ую перестановку из n элементов.
           */

          /**
           * Задача 2: Разбить список на подсписки заданного размера
           * Дан список элементов и размер подсписков. Необходимо разбить список
           * на подсписки указанного размера.
           */
          // ------------------------------------------------------------------------------------------------------------------------
                  //Для людей-индиго
         // Найти сумму квадратов простых чисел, которые являются палиндромами в заданном диапазоне.
}
@Getter
class Person {
  String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  int age;
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}
