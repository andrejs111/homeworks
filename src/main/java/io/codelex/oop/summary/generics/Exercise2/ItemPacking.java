package io.codelex.oop.summary.generics.Exercise2;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class ItemPacking implements Service {

    private final String NAME = "Item packing";
    private final BigDecimal PRICE = BigDecimal.valueOf(5.00);

    @Override
    public String showName() {
        return NAME;
    }

    @Override
    public BigDecimal showPrice() {
        return PRICE;
    }

    @Override
    public String showFullInfo() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return NAME + ", " + decimalFormat.format(PRICE) + " EUR";
    }
}
