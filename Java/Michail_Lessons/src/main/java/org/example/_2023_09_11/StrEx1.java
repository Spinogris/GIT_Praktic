package org.example._2023_09_11;

public class StrEx1 {
    public static void main(String[] args) {
        String nik = "Nik";
        String nik77 = "Nik";
        String nik2 = new String("Nik");

        int a = 10;
        String s = "" + a;
        int v = Integer.parseInt(s);

        StringBuilder sb = new StringBuilder("Nik");
        StringBuffer sbb = new StringBuffer();
        sb.append(" ").append(" hello ").append("!");
        System.out.println(sb.toString());


        System.out.println(nik.hashCode());

//        nik.equals(nik2)
//        System.out.println(nik.equals(nik2)); true

        System.out.println(nik == nik2);
        System.out.println(nik.equals(nik2));

    }
}
