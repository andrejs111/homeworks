package io.codelex.classesandobjects.practice.Exercise8;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How much money is in the account?: ");
        double startingBalance = input.nextDouble();

        System.out.println("Enter the annual interest rate (e.g. 0,03): ");
        double interestRate = input.nextDouble();

        System.out.println("How long has the account been opened for? ");
        int months = input.nextInt();

        SavingsAccount mySavings = new SavingsAccount(startingBalance);
        mySavings.setInterest(interestRate);

        int deposits = 0;
        int withdrawals = 0;

        for (int i = 1; i <= months; i++) {
            System.out.printf("Enter the amount deposited for month %d: ", i);
            double deposit = input.nextDouble();
            mySavings.deposit(deposit);
            deposits += deposit;

            System.out.printf("Enter the amount withdrawn for month %d: ", i);
            double withdrawal = input.nextDouble();
            mySavings.withdraw(withdrawal);
            withdrawals += withdrawal;

            mySavings.calculateInterest();
        }

        double finalInterest = mySavings.balance - startingBalance - deposits + withdrawals;
        System.out.printf("Total deposited: %d$\nTotal withdrawn: %d$\nInterest earned: %.2f$\nEnding balance: %.2f$", deposits, withdrawals, finalInterest, mySavings.balance);
    }
    }

