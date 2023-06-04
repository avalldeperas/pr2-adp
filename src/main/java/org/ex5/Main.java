package org.ex5;

import org.ex1.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static List<Category> categories = new ArrayList<>();

    public static void main(String[] args) {
        buildData();

        // user searches by a "text"
        // we need to unify all categories?
        //


    }

    private static void buildData() {
        List<Component> components = Arrays.asList(new Component("ico1", "ico1-descr", 10));
        InternalCategory internalCategory = new InternalCategory("ica1", "ica1-descr", components);
        components = Arrays.asList(new Component("eco1", "eco1-descr", 20));
        ExternalCategory externalCategory = new ExternalCategory("eca1", "eca1-descr", components);
        categories.add(internalCategory);
        categories.add(externalCategory);
    }
}
