package io.codelex.typesandvariables.practice;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!\nPlease enter a single digit number:");
        int num1 = input.nextInt();
        System.out.println("Please enter another single digit number: ");
        int num2 = input.nextInt();
        System.out.println("Please enter a final single digit number: ");
        int num3 = input.nextInt();
        int sum = num1 + num2 + num3;
        System.out.printf("Your number is %d.", sum);
        System.out.println("\nGoodbye!");


    }
}
