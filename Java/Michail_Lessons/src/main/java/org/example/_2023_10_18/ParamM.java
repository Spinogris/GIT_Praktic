package org.example._2023_10_18;

import java.util.*;

public class ParamM {
    public static void main(String[] args) {
        // E = String
        List<String> list = new ArrayList<>();
        /**
         * List list = new ArrayList<>();
         *
         *
         * */


        //
        List<Integer> listq = new ArrayList<>();
        List<? extends Number> list1 = new ArrayList<>();
//        list1.add(5);
    }
}

class Gen<T, S> {
    public T getFirst(List<T> list) {
        return list.get(0);
    }

    public S getS(List<S> list) {
        return list.get(0);
    }


    public static double sum(List<? extends Number> list) {
        double sum = 0.0d;
        for (Number n : list) {
            sum = sum + n.doubleValue();
        }
        return sum;
    }
}
