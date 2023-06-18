package io.codelex.java.advanced.test.Exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card{
    public DebitCard(String number, String ownerName, String ccv, BigDecimal balance) {
        super(number, ownerName, ccv, balance);
    }

    @Override
    public BigDecimal addFunds(BigDecimal funds) {
        BigDecimal remainingFunds = getBalance().add(funds);
        if (remainingFunds.compareTo(BigDecimal.valueOf(10000)) > 0) {
            System.out.println("Warning: Too much money");
        }
        setBalance(remainingFunds);
        System.out.println("Remaining funds: " + remainingFunds);
        return remainingFunds;
    }

    @Override
    public BigDecimal takeFunds(BigDecimal funds) throws NotEnoughFundsException {
        super.takeFunds(funds);
        return getBalance();
    }
}
