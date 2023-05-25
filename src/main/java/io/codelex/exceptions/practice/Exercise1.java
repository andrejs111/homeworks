package io.codelex.exceptions.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the numerator (or 'q' to quit):");
            String numeratorInput = input.next();

            if (numeratorInput.toLowerCase().charAt(0) == 'q') {
                break;
            }
            try {
                int numerator = Integer.parseInt(numeratorInput);
                System.out.println("Enter the divisor:");
                int divisor = input.nextInt();
                int result = numerator / divisor;
                System.out.println(numerator + " / " + divisor + " is " + result);
            } catch (InputMismatchException e) {
                System.out.println("You have to choose an integer.");
                input.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Can't divide by 0.");
            }
        }
    }
}
