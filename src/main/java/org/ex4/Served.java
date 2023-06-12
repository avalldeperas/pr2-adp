package org.ex4;

import org.ex3.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class Served extends ShoppingCart {

    @Override
    public List<Tuple<String, Integer>> getWaitingCartComponents() {
        return new ArrayList<>();
    }
}
