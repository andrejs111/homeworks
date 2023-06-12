package io.codelex.oop.summary.generics.Exercise2;

import java.math.BigDecimal;

public class ElectronicsItem extends AbstractItem {
    protected String power;
    public ElectronicsItem(String itemName, BigDecimal itemPrice, String power) {
        super(itemName, itemPrice);
        this.power = power;
    }

    public String showPower() {
        return power;
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
        return itemName + ", " + itemPrice + " EUR power:" + power;
    }
}
