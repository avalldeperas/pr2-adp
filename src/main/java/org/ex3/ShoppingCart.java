package org.ex3;

import lombok.Data;
import org.ex1.Client;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Data
public abstract class ShoppingCart {
    private Date date;
    private Integer hour;
    private List<ComponentInShoppingCart> cartComponents;
    private Client client;
    private DiscountStrategy strategy;

    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public Integer getPrice() {
        Integer totalPrice = 0;
        for (ComponentInShoppingCart cartComponent : cartComponents) {
            totalPrice += cartComponent.getTotalPrice();
        }
        // we omit the discount by client type done in PR1
        return totalPrice;
    }

    public Integer getPriceWithDiscount(){
        Integer price = getPrice();

        return strategy.applyDiscount(price);
    }

    public abstract Iterator<ComponentInShoppingCart> waitingComponents();
}
