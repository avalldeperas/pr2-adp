package org.ex4;

import org.ex3.ComponentInShoppingCart;

import java.util.Iterator;

public class ComponentsInCartIterator implements Iterator<ComponentInShoppingCart> {

    private final ComponentInShoppingCart[] components;
    private Integer currentPos;

    public ComponentsInCartIterator(ComponentInShoppingCart[] components) {
        this.components = components;
    }

    @Override
    public boolean hasNext() {
        return currentPos < components.length;
    }

    @Override
    public ComponentInShoppingCart next() {
        currentPos++;
        return components[currentPos];
    }
}
