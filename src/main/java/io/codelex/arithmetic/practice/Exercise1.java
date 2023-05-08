package io.codelex.arithmetic.practice;
import java.util.Scanner;
// Write a Java program to accept two integers and return true if the either one is 15 or if their sum or difference is 15.
public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        if (num1 == 15 || num2 == 15) {
            System.out.println("True");
        }
        if (num1 + num2 == 15 || num1 - num2 == 15 || num2 - num1 == 15) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
