package org.ex3;

public class PercentageDiscount implements DiscountStrategy {

    private Integer percentage;

    @Override
    public Integer applyDiscount(Integer price) {
        return price - price * (percentage/100);
    }
}
