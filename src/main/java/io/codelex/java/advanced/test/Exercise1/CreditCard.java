package io.codelex.java.advanced.test.Exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card{
    public CreditCard(String number, String ownerName, String ccv, BigDecimal balance) {
        super(number, ownerName, ccv, balance);
    }

    @Override
    public BigDecimal addFunds(BigDecimal funds) {
        BigDecimal updatedBalance = super.addFunds(funds);
        System.out.println("Remaining funds: " + updatedBalance);
        return updatedBalance;
    }

    @Override
    public BigDecimal takeFunds(BigDecimal funds) throws NotEnoughFundsException {
        super.takeFunds(funds);
        if (getBalance().compareTo(BigDecimal.valueOf(100)) < 0) {
            System.out.println("Warning: Low funds");
        }
        return getBalance();
    }
}
