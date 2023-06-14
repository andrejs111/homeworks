package io.codelex.java.advanced.test.Exercise1;

import java.math.BigDecimal;

public abstract class Card {
    private String number;
    private String ownerName;
    private String ccv;
    private BigDecimal balance;


    public Card(String number, String ownerName, String ccv, BigDecimal balance) {
        this.number = number;
        this.ownerName = ownerName;
        this.ccv = ccv;
        this.balance = balance;
    }
    public BigDecimal addFunds(BigDecimal funds) {
        return balance = balance.add(funds);
    }
    public BigDecimal takeFunds(BigDecimal funds) throws NotEnoughFundsException {
        return balance = balance.subtract(funds);
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Card{" +
                "number='" + number + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", ccv='" + ccv + '\'' +
                ", balance=" + balance +
                '}';
    }
}
