package org.ex3;

import lombok.Data;
import org.ex1.Component;
import org.ex4.Tuple;

@Data
public class ComponentInShoppingCart {
    private Integer units;
    private Component component;

    public Integer getTotalPrice(){
        return component.getPrice() * units;
    }

    public Tuple<String, Integer> getTupleComponent() {
        return new Tuple<>(component.getName(), units);
    }
}
