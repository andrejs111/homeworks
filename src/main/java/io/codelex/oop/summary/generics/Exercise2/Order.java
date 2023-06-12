package io.codelex.oop.summary.generics.Exercise2;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
    private ArrayList<SellableThing> orderedItems;

    public Order(ArrayList<SellableThing> orderedItems) throws WrongOrderException, BadFoodException {
        if (orderedItems.isEmpty()) {
            throw new WrongOrderException("Cannot create an invoice with an empty order.");
        }
        for (SellableThing item : orderedItems) {
            if (item instanceof FoodItem foodItem) {
                checkFoodItemExpiration(foodItem);
            }
        }
        this.orderedItems = orderedItems;
    }

    public void addItems(SellableThing abstractItem) {
        if (abstractItem instanceof FoodItem foodItem) {
            checkFoodItemExpiration(foodItem);
        }
        orderedItems.add(abstractItem);
    }

    private void checkFoodItemExpiration(FoodItem foodItem) {
        if (foodItem.getExpirationDate().isBefore(LocalDate.now())) {
            throw new BadFoodException("Cannot add a food item with an expired date to the order.");
        } else if (foodItem.getExpirationDate().isEqual(LocalDate.now().plusDays(1))) {
            throw new BadFoodException("Cannot add a food item with a 1-day expiration date to the order.");
        }
    }

    public ArrayList<SellableThing> getItemsList() {
        return orderedItems;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderedItems=" + orderedItems +
                '}';
    }
}
