package de.telran.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "JavaScript", "Python", "Ruby");
        long count =  list.stream()
                .filter(el -> el.contains("Java"))
                .count();
        System.out.println(count);

        count =  list.stream()
                .filter(el -> el.indexOf("Java") >= 0)
                .count();
        System.out.println(count);

        List <String> newList = list.stream()
                .filter(el -> el.contains("Java"))
                .map(el -> el+" Слон")
                .collect(Collectors.toList());

        List <Integer> intList = list.stream()
                .map(el -> {
                    int temp = el.length();
                    return temp;
                })
                .collect(Collectors.toList());

        System.out.println(intList);


    }
}

/*    *//**
     * Дан список строк. Необходимо найти количество строк, которые содержат заданную подстроку.
     *//*
    private static void m1() {
        List<String> list = Arrays.asList("Java", "JavaScript", "Python", "Ruby");*/
