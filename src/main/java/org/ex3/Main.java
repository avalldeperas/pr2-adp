package org.ex3;

public class Main {
    public static void main(String[] args) {
        ShoppingCart s = new ShoppingCart();
        s.setStrategy(new FixedDiscount());
        Integer price = s.getPriceWithDiscount();


        s.setStrategy(new PercentageDiscount());
        price = s.getPriceWithDiscount();
    }
}
