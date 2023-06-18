package io.codelex.java.advanced.test.Exercise1;

import java.math.BigDecimal;

public class CardTest {
    public static void main(String[] args) throws NotEnoughFundsException {
        CreditCard credit = new CreditCard("0000-9945-0012-3838", "Jānis Bērziņš", "003", BigDecimal.valueOf(873.45));
        credit.addFunds(BigDecimal.valueOf(100));
        credit.takeFunds(BigDecimal.valueOf(960));
        DebitCard debit = new DebitCard("0009-9384-3838-1138", "Pēteris Kļaviņš", "313", BigDecimal.valueOf(9833.99));
        debit.addFunds(BigDecimal.valueOf(1000));
        debit.takeFunds(BigDecimal.valueOf(11000));
    }
}
