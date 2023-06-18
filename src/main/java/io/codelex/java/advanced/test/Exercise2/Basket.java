package io.codelex.java.advanced.test.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket <T> {
    private final int MAX_AMOUNT = 10;
    private int amount;
    private T item;

    public Basket() {
        this.amount = 0;
    }
    public void addSomething(T item) {
        if (amount == MAX_AMOUNT) {
            throw new BasketFullException("Basket can't store more items");
        }
        if (amount > 0 && !item.getClass().equals(this.item.getClass())) {
            throw new RuntimeException("Basket can only store one type of item");
        }
        this.item = item;
        amount++;
    }
    public void removeSomething() {
        if (amount == 0) {
            throw new BasketEmptyException("Basket is empty");
        }
        amount--;
        if (amount == 0) {
            item = null;
        }
    }
    public int getMAX_AMOUNT() {
        return MAX_AMOUNT;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "MAX_AMOUNT=" + MAX_AMOUNT +
                ", amount=" + amount +
                ", item=" + item +
                '}';
    }
}

