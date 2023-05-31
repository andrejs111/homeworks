package io.codelex.collections.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        String number = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            int numberToMultiply = Integer.parseInt(String.valueOf(number.charAt(i)));
            sum += Math.pow(numberToMultiply, 2);
        }
        String numberToCheck = Integer.toString(sum);
        if (numberToCheck.charAt(numberToCheck.length() - 1) == '1') {
            System.out.println(sum);
            System.out.println("Happy number!");
        } else {
            System.out.println(sum);
            System.out.println("Unhappy number!");
        }
    }
}
