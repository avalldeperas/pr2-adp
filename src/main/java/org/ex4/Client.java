package org.ex4;

import lombok.Data;
import org.ex3.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

@Data
public class Client {
    private String dni;
    private String name;
    private List<ShoppingCart> shoppingCarts;
    private ShoppingCartIterator carts;

    public Client(String dni, String name, List<ShoppingCart> cart) {
        this.dni = dni;
        this.name = name;
        this.shoppingCarts = cart;
    }

    public List<Tuple<String, Integer>> getAllWaitingForComponents(){
        List<Tuple<String, Integer>> allWaitingComponents = new ArrayList<>();

        while (carts.hasNext()){
            ShoppingCart cart = carts.next();
            allWaitingComponents.addAll(cart.getWaitingCartComponents());
        }

        return allWaitingComponents;
    }
}
