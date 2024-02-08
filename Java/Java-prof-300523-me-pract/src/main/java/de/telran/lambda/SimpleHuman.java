package de.telran.lambda;

import lombok.val;

import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class SimpleHuman {
    public static void main(String[] args) {
        Human h1 = new Human("Вася",20, 1);
        h1.setTransactions(Arrays.asList(1.5, 2.7, 4.0));
        h1.setWallet(List.of(new Money("USD", 300), new Money("Euro",150)));
        Human h2 = new Human("Петя",21, 2);
        h2.setTransactions(Arrays.asList(1.2, 5.7, 4.9));
        h2.setWallet(List.of(new Money("USD", 100), new Money("Euro",250)));
        Human h3 = new Human("Дуня",25, 3);
        h3.setTransactions(Arrays.asList(1.5, 9.7, 3.0));
        h3.setWallet(List.of(new Money("USD", 50), new Money("Euro",50)));
        Human h4 = new Human("Лера",27, 3);
        h4.setTransactions(Arrays.asList(9.5, 4.7, 1.0));
        h4.setWallet(List.of(new Money("USD", 200), new Money("Euro",450)));

        List<Human> family = Arrays.asList(h1, h2, h3, h4);

        Double sum = family.stream().filter( x -> x.sex == 3)
                .flatMap(x -> x.transactions.stream())
                .mapToDouble(Double::doubleValue)
                .summaryStatistics()
                .getSum();

         System.out.println(sum);


        Double sumUSD = family.stream()
                .flatMap(x -> x.wallet.stream())
                 .filter(m -> m.currency.equalsIgnoreCase("USD"))
                 .mapToDouble(money -> money.value)
                 .sum();

        System.out.println(sumUSD);
    }
}
