package io.codelex.oop.summary.generics.Exercise2;

import java.math.BigDecimal;

public abstract class AbstractItem implements Item {
    protected String itemName;
    protected BigDecimal itemPrice;

    public AbstractItem(String itemName, BigDecimal itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    @Override
    public String showName() {
        return itemName;
    }

    @Override
    public BigDecimal showPrice() {
        return itemPrice;
    }

    @Override
    public String showFullInfo() {
        return toString();
    }

    @Override
    public String toString() {
        return "AbstractItem{" +
                "itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }
}
