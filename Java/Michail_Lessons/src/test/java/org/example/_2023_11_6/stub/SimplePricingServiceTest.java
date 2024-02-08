package org.example._2023_11_6.stub;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class SimplePricingServiceTest {

    @Test
    void getHighestPricedTrade() {
        Price price1 = new Price(10);
        Price price2 = new Price(20);
        Price price3 = new Price(30);

        Collection<Trade> trades = new ArrayList<>();
        trades.add(new Trade(price1));
        trades.add(new Trade(price2));
        trades.add(new Trade(price3));
    }
}