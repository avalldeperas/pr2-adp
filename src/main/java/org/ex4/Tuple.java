package org.ex4;

import lombok.Getter;

@Getter
public class Tuple<String, Integer> {
    private final String componentName;
    private final Integer waitingAmount;

    public Tuple(String componentName, Integer waitingAmount) {
        this.componentName = componentName;
        this.waitingAmount = waitingAmount;
    }
}
