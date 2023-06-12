package org.ex4;

import org.ex3.ShoppingCart;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Client c = new Client("c", "name", new ArrayList<>());
        ShoppingCartIterator iterator = c.getIterator();
        while(iterator.hasNext()){
            ShoppingCart next = iterator.next();

        }
    }
}
