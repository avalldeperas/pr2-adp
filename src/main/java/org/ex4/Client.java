package org.ex4;

import lombok.Data;
import org.ex3.ComponentInShoppingCart;
import org.ex3.ShoppingCart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Data
public class Client {
    private String dni;
    private String name;
    private List<ShoppingCart> shoppingCarts;

    public Client(String dni, String name, List<ShoppingCart> cart) {
        this.dni = dni;
        this.name = name;
        this.shoppingCarts = cart;
    }

    public List<Tuple<String, Integer>> getAllWaitingForComponents(){
        List<Tuple<String, Integer>> list = new ArrayList<>();

        for (ShoppingCart cart: shoppingCarts){
            Iterator<ComponentInShoppingCart> waitingComponents = cart.waitingComponents();

            while (waitingComponents.hasNext()){
                ComponentInShoppingCart component = waitingComponents.next();
                list.add(new Tuple<>(component.getComponent().getName(), component.getUnits()));
            }
        }

        return list;
    }
}
