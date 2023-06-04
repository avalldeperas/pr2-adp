package org.ex5;

import org.ex1.Component;

import java.util.List;

public interface ICategory {
    List<Component> getComponents();
    String getName();
    String getDescription();
}
