package io.codelex.classesandobjects.practice.Exercise13;

public class AccountTest {
    public static void main (String[] args) {
        firstAccount();
        moneyTransfer();

    }
    public static void firstAccount() {
        Account firstAccount = new Account("Barto's account", 100);
        firstAccount.deposit(20);
        System.out.println(firstAccount);
    }
    public static void moneyTransfer() {
        Account mattsAccount = new Account("Matt's account", 1000);
        Account myAccount = new Account("My account", 0);
        mattsAccount.withdrawal(100.0);
        myAccount.deposit(100.0);
        System.out.println(mattsAccount);
        System.out.println(myAccount);
    }
    public static void transfer(Account from, Account to, double howMuch) {
        Account accountA = new Account("A", 100);
        Account accountB = new Account("B", 0.0);
        Account accountC = new Account("C", 0.0);
        accountA.withdrawal(50.0);
        accountB.deposit(50.0);
        accountB.withdrawal(25.0);
        accountC.deposit(25.0);
        System.out.println(accountA);
        System.out.println(accountB);
        System.out.println(accountC);
    }
}
