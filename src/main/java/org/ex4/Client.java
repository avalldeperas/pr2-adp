package org.ex4;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.ex3.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Client {
    private String dni;
    private String name;
    private List<ShoppingCart> shoppingCarts;

    public List<Tuple<String, Integer>> getAllWaitingForComponents(){
        List<Tuple<String, Integer>> list = new ArrayList<>();

        for (ShoppingCart cart: shoppingCarts){
            list.addAll(cart.getWaitingComponents());
        }

        return list;
    }
}
