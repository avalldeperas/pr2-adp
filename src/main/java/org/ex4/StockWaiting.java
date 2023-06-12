package org.ex4;

import org.ex3.ComponentInShoppingCart;
import org.ex3.ShoppingCart;

import java.util.Iterator;

public class StockWaiting extends ShoppingCart {

    @Override
    public Iterator<ComponentInShoppingCart> waitingComponents() {
        return getCartComponents().iterator();
    }
}
