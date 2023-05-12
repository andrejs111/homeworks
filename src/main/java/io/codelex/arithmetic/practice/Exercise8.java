package io.codelex.arithmetic.practice;

public class Exercise8 {
    public static void calculatePay(double basePay, int workHours) {
        if (workHours > 60) {
            System.out.println("Invalid input, hours worked exceed 60.");
            return;
        } else if (basePay < 8.0) {
            System.out.println("Invalid input, base pay needs to be at least 8.0 (8$ per hour is the minimum wage).");
            return;
        }
        double finalPay;
        if (workHours <= 40) {
            finalPay = basePay * workHours;
        } else {
            finalPay = (basePay * 40) + (workHours - 40) * 1.5 * basePay;
        }
        System.out.println("Total pay is $"+finalPay);
    }
    public static void main (String[] args) {
        calculatePay(7.5, 35);
        calculatePay(8.2, 47);
        calculatePay(10, 73);
    }
}

