package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class Printer<T> {

    private final T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }

    public T getThingToPrint() {
        return thingToPrint;
    }
}

