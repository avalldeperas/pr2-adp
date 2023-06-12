package org.ex4;

import org.ex3.ShoppingCart;
import org.junit.jupiter.api.Test;

import java.util.List;

class StockWaitingTest {

    @Test
    void test(){
        ShoppingCart stockWaiting = new StockWaiting();
        List<Tuple<String, Integer>> waitingComp = stockWaiting.getWaitingCartComponents();

        ShoppingCart served = new Served();
        List<Tuple<String, Integer>> waitingCartComponents = served.getWaitingCartComponents();
    }

}