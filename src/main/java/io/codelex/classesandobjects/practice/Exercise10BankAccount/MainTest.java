package io.codelex.classesandobjects.practice.Exercise10BankAccount;

public class MainTest {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Andrejs", 100);
        myAccount.deposit(0);
        myAccount.withdraw(101);
        System.out.println(myAccount);


    }
}
