package org.ex1;

import lombok.Data;

@Data
public class Component extends Subject {
    private String name;
    private String description;
    private Integer price;
    private Integer stock;

    public Component(String name, String description, Integer price){
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = 1000;
    }

    public void stockArrive(Integer quantity){
        this.stock = quantity;
        notificar();
    }
}
