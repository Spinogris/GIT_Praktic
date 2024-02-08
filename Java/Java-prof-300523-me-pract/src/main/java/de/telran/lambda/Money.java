package de.telran.lambda;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Money {
    String currency;
    double value;

}
