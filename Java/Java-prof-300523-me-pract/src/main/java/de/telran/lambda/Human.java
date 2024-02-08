package de.telran.lambda;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Setter
public class Human extends Person{
    int sex;
    List<Double> transactions;
    List<Money> wallet;

    public Human(String name, int age, int sex) {
        super(name, age);
        this.sex = sex;
    }


}
