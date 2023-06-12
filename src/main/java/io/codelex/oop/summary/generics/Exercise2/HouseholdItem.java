package io.codelex.oop.summary.generics.Exercise2;

import java.math.BigDecimal;

public class HouseholdItem extends AbstractItem{
        protected String color;
        public HouseholdItem(String itemName, BigDecimal itemPrice, String color) {
            super(itemName, itemPrice);
            this.color = color;
        }

        public String showColor() {
            return color;
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
            return itemName + ", " + itemPrice + " EUR color: "
                    + color;
        }

    }