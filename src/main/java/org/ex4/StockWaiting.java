package org.ex4;

import org.ex3.ComponentInShoppingCart;
import org.ex3.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class StockWaiting extends ShoppingCart {

    @Override
    public List<Tuple<String, Integer>> getWaitingComponents() {
        List<Tuple<String, Integer>> waitingComponents = new ArrayList<>();

        for (ComponentInShoppingCart c: getCartComponents()){
            waitingComponents.add(c.getTupleComponent());
        }

        return waitingComponents;
    }
}
