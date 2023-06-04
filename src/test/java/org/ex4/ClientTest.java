package org.ex4;

import org.ex1.Component;
import org.ex3.ComponentInShoppingCart;
import org.ex3.ShoppingCart;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClientTest {

    @Test
    void test() {
        Component comp = new Component("name", "descr", 10);
        ComponentInShoppingCart compInCart = new ComponentInShoppingCart();
        compInCart.setComponent(comp);
        compInCart.setUnits(2);
        ShoppingCart cart = new StockWaiting();
        cart.setCartComponents(asList(compInCart));

        Client c = new Client("dni", "", asList(cart));
        List<Tuple<String, Integer>> allWaitingForComponents = c.getAllWaitingForComponents();

        assertEquals(1, allWaitingForComponents.size());
        assertEquals("name", allWaitingForComponents.get(0).getComponentName());
        assertEquals(2, allWaitingForComponents.get(0).getWaitingAmount());
    }
}