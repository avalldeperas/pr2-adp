package org.ex3;

import lombok.Data;
import org.ex1.Component;

@Data
public class ComponentInShoppingCart {
    private Integer units;
    private Component component;

    public Integer getTotalPrice(){
        return component.getPrice() * units;
    }
}
