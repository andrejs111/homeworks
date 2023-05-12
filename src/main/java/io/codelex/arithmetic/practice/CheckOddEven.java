package io.codelex.arithmetic.practice;
import java.util.InputMismatchException;
import java.util.Scanner;
// Write a program called CheckOddEven which prints "Odd Number" if the int variable “number” is odd, or “Even Number”
// otherwise. The program shall always print “bye!” before exiting.
public class CheckOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        try {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        } catch (InputMismatchException a) {
            System.out.println("This is not a number.");
        }
        System.out.println("Bye!");
    }
}