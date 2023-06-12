package io.codelex.oop.summary.generics.Exercise2;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FoodItem extends AbstractItem {
    protected LocalDate expirationDate;
    public FoodItem(String itemName, BigDecimal itemPrice, int expDay, int expMonth, int expYear) {
        super(itemName, itemPrice);
        this.expirationDate = LocalDate.of(expYear, expMonth, expDay);
    }
    public String showExpirationDate() {
            return expirationDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        }

    @Override
    public String showName() {
        return super.showName();
    }

    @Override
    public BigDecimal showPrice() {
        return super.showPrice();
    }

    @Override
    public String showFullInfo() {
        return super.showFullInfo();
    }

    @Override
    public String toString() {
        return  itemName + ", " + itemPrice + " EUR best before: " + expirationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
}
