package org.ex3;

public class FixedDiscount implements DiscountStrategy {

    private Integer quantity;

    @Override
    public Integer applyDiscount(Integer price) {
        return price - quantity;
    }
}
