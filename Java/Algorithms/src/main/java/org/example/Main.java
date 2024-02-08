package org.example._23_09_06;

public class Main {
  public static void main(String[] args) {

    String nik = "Nik";
    String nik2 = "Nik";
    String nik3 = new String("Nik");



//    System.out.println(nik.equals(nik2));  // true
//    System.out.println(nik == nik2);  //  true
    System.out.println(nik == nik2);
    System.out.println(nik.equals(nik2));
    System.out.println(nik == nik3);    // сравнивает ссылку
    System.out.println(nik.equals(nik3));   // сравнивает содержимое

  }
}

