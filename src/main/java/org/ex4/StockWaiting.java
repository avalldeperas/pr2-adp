package org.ex4;

import org.ex3.ComponentInShoppingCart;
import org.ex3.ShoppingCart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StockWaiting extends ShoppingCart {

    public List<Tuple<String, Integer>> getWaitingCartComponents() {
        List<Tuple<String, Integer>> waitingComponents = new ArrayList<>();
        Iterator<ComponentInShoppingCart> components = cartComponents();

        while (components.hasNext()){
            ComponentInShoppingCart component = components.next();
            waitingComponents.add(new Tuple<>(component.getComponentName(), component.getUnits()));
        }

        return waitingComponents;
    }
}
