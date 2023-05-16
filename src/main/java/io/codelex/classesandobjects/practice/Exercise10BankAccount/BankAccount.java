package io.codelex.classesandobjects.practice.Exercise10BankAccount;

public class BankAccount {
    public String name;

    public double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(name).append(", ");
        if (balance < 0) {
            result.append(String.format("%.2f", balance));
            result.append("$");
        } else {
            result.append(String.format("%.2f", balance));
            result.append("$");
        }
        return result.toString();
    }

}
