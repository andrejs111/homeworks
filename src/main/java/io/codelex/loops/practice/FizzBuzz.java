package io.codelex.loops.practice;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome. Enter the max value: ");
        int maxValue = input.nextInt();

        for(int i = 1; i <= maxValue; i++) {
            if (i % 20 == 0) {
                System.out.print(i);
                System.out.println();
            }
            else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            }
            else if (i % 3 == 0) {
                System.out.print("Fizz ");
            }
            else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
