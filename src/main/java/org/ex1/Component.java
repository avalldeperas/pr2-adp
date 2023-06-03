package org.ex1;

import lombok.Data;

@Data
public class Component extends Subject {
    private String name;
    private String description;
    private Integer price;
    private Integer stock;

    public void stockArrive(Integer quantity){
        this.stock = quantity;
        notificar();
    }
}
