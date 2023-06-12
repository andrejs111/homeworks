package io.codelex.oop.summary.generics.Exercise2;

import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Invoice {
    private String invoiceNumber;
    private Order order;
    private InvoiceStatus invoiceStatus;
    private final DecimalFormat decimalFormat = new DecimalFormat("0.00");

    private final BigDecimal VAT = BigDecimal.valueOf(0.21);

    public Invoice(String invoiceNumber, Order order) {
        this.invoiceNumber = invoiceNumber;
        this.order = order;
        this.invoiceStatus = InvoiceStatus.APPROVED;
    }

    public BigDecimal calculateTotalWithoutVat(Order order) {
        return order.getItemsList()
                .stream()
                .map(SellableThing::showPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal calculateVAT(Order order) {
        return calculateTotalWithoutVat(order).multiply(VAT);
    }

    public BigDecimal orderTotal(Order order) {
        return calculateTotalWithoutVat(order).add(calculateVAT(order));
    }

    public InvoiceStatus send() {
        return this.invoiceStatus = InvoiceStatus.SENT;
    }

    public String printOrder() {
        StringBuilder result = new StringBuilder();
        String blank = " ";
        result.append("=".repeat(50)).append("\n");
        result.append(String.format("= INVOICE NUMBER: %s" + blank.repeat((31 - invoiceNumber.length())) + "=\n", invoiceNumber));
        result.append(String.format("= STATUS: %s" + blank.repeat((39 - String.valueOf(invoiceStatus).length())) + "=\n", invoiceStatus));

        int itemNumber = 1;
        int maxItemInfoLength = 0;

        for (SellableThing item : order.getItemsList()) {
            String itemInfo = String.format("%d. %s, %s EUR", itemNumber, item.showName(), item.showPrice());

            if (item instanceof FoodItem foodItem) {
                itemInfo += String.format(", best before: %s", foodItem.showExpirationDate());
                result.append(String.format("= %s" + blank.repeat((47 - itemInfo.length())) + "=\n", itemInfo));
            } else if (item instanceof ElectronicsItem electronicsItem) {
                itemInfo += String.format(", power: %s", electronicsItem.showPower());
                result.append(String.format("= %s" + blank.repeat((47 - itemInfo.length())) + "=\n", itemInfo));
            } else if (item instanceof HouseholdItem householdItem) {
                itemInfo += String.format(", color: %s", householdItem.showColor());
                result.append(String.format("= %s" + blank.repeat((47 - itemInfo.length())) + "=\n", itemInfo));
            } else if (item instanceof ItemPacking) {
                result.append(String.format("= %s" + blank.repeat((47 - itemInfo.length())) + "=\n", itemInfo));
            }

                itemNumber++;

                maxItemInfoLength = Math.max(maxItemInfoLength, itemInfo.length());
            }

            BigDecimal totalWithoutVat = calculateTotalWithoutVat(order);
            BigDecimal vatAmount = calculateVAT(order);
            BigDecimal totalWithVat = orderTotal(order);

            DecimalFormatSymbols symbols = decimalFormat.getDecimalFormatSymbols();
            symbols.setDecimalSeparator('.');
            decimalFormat.setDecimalFormatSymbols(symbols);

            result.append(String.format("= SUM: %s EUR" + blank.repeat((38 - decimalFormat.format(totalWithoutVat).length())) + "=\n", decimalFormat.format(totalWithoutVat)));
            result.append(String.format("= VAT (21%%): %s EUR" + blank.repeat(32 - decimalFormat.format(vatAmount).length()) + "=\n", decimalFormat.format(vatAmount)));
            result.append(String.format("= TOTAL: %s EUR" + blank.repeat(36 - decimalFormat.format(totalWithVat).length()) + "=\n", decimalFormat.format(totalWithVat)));

            result.append("=".repeat(50)).append("\n");

            return result.toString();
        }
    }
