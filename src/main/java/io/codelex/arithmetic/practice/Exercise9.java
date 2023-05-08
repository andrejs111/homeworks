package io.codelex.arithmetic.practice;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to use metric or imperial measurement system?\n Press 'm' for metric or 'i' for imerial:");
        String measurementChoice = sc.nextLine().toLowerCase();
        double height = 0;
        double weight = 0;

        if (measurementChoice.equals("m")) {
            System.out.println("Enter your weight in kilograms: ");
            weight = sc.nextDouble();
            System.out.println("Enter your height in meters (e.g. 170 cm is 1,7): ");
            height = sc.nextDouble();

        } else if (measurementChoice.equals("i")) {
            System.out.println("Enter your weight in pounds: ");
            weight = sc.nextDouble() * 0.45359;
            System.out.println("Enter your height in inches: ");
            height = sc.nextDouble() * 2.54 / 100;

        } else {
            System.out.println("Invalid input.");
        }

        double BMI = weight  / (height * height);
        System.out.println("Your BMI is " + BMI);
        if (BMI < 18.5) {
            System.out.println("You are underweight.");
        } else if (BMI <= 25) {
            System.out.println("Your weight is optimal.");
        } else {
            System.out.println("You are overweight.");
        }
    }
}
