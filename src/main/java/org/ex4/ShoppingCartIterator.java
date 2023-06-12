package org.ex4;

import org.ex3.ShoppingCart;

import java.util.Iterator;
import java.util.List;

public class ShoppingCartIterator implements Iterator<ShoppingCart> {

    private List<ShoppingCart> cart;
    private int currentPos;

    public ShoppingCartIterator(List<ShoppingCart> cart) {
        this.cart = cart;
        currentPos = -1;
    }

    @Override
    public boolean hasNext() {
        return currentPos + 1 < cart.size();
    }

    @Override
    public ShoppingCart next() {
        currentPos++;
        return cart.get(currentPos);
    }
}
