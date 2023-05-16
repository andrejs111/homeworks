package io.codelex.classesandobjects.practice.Exercise8;

public class SavingsAccount {
    double balance;
    double interestRate;
    public SavingsAccount(double startingBalance) {
        this.balance = startingBalance;
    }
    public void setInterest(double interestRate) {
        this.interestRate = interestRate;
    }

    public void deposit(double number) {
        balance += number;
    }

    public void withdraw(double number) {
        balance -= number;
    }
    public void calculateInterest() {
        double monthlyInterestRate = interestRate / 12;
        double interest = balance * monthlyInterestRate;
        balance += interest;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "startingBalance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }
}

