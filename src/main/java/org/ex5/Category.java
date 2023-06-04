package org.ex5;

import lombok.AllArgsConstructor;
import org.ex1.Component;

import java.util.List;

@AllArgsConstructor
public abstract class Category implements ICategory {
    private String name;
    private String description;
    private List<Component> components;

    @Override
    public List<Component> getComponents() {
        return components;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }


}
