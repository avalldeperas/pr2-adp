package org.ex3;

import org.ex4.StockWaiting;

public class Main {
    public static void main(String[] args) {
        ShoppingCart s = new StockWaiting();
        s.setStrategy(new FixedDiscount());
        Integer price = s.getPriceWithDiscount();


        s.setStrategy(new PercentageDiscount());
        price = s.getPriceWithDiscount();
    }
}
