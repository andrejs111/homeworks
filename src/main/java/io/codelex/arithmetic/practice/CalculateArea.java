package io.codelex.arithmetic.practice;

import java.math.BigDecimal;
import java.util.Scanner;

import static java.math.BigDecimal.ZERO;

public class CalculateArea {
    public static void main(String[] args) {
        int choice; // The user's menu choice

        do {
            // Get the user's menu choice.
            choice = getMenu();

            if (choice == 1) {
                calculateCircleArea();
            } else if (choice == 2) {
                calculateRectangleArea();
            } else if (choice == 3) {
                calculateTriangleArea();
            } else if (choice == 4) {
                System.out.println("Thanks for calculating!");
            }

        } while (choice != 4);
    }

    public static int getMenu() {

        int userChoice;

        // keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Display the menu.
        System.out.println("Geometry Calculator\n");
        System.out.println("1. Calculate the Area of a Circle");
        System.out.println("2. Calculate the Area of a Rectangle");
        System.out.println("3. Calculate the Area of a Triangle");
        System.out.println("4. Quit\n");
        System.out.print("Enter your choice (1-4) : ");

        // get input from user
        userChoice = keyboard.nextInt();

        // validate input
        while (userChoice < 1 || userChoice > 4) {
            System.out.print("Error. Please enter a valid range: 1, 2, 3, or 4: ");
            userChoice = keyboard.nextInt();
        }

        return userChoice;
    }

    public static void calculateCircleArea() {

        BigDecimal radius = ZERO;

        // Get input from user
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the circle's radius? ");
        double r = keyboard.nextDouble();
        double area = Math.PI * r * r;
        //todo
        //radius = keyboard.nextDouble();

        // Display output
        System.out.println("The circle's area is " + area);
    }

    public static void calculateRectangleArea() {

        // Get input from user
        Scanner keyboard = new Scanner(System.in);

        // Get length
        System.out.print("Enter length? ");// read users input as a string first
        double length = keyboard.nextDouble();
        //todo
        //length = keyboard.nextDouble();

        // Get width
        System.out.print("Enter width? "); // read users input as a string first
        double width = keyboard.nextDouble();;
        //todo
        //width = keyboard.nextDouble();
        double area = width * length;

        // Display output
        System.out.println("The rectangle's area is " + area + ".");
    }

    public static void calculateTriangleArea() {

        // Get input from user
        Scanner keyboard = new Scanner(System.in);

        // Get the base
        System.out.print("Enter length of the triangle's base? ");
        double base = keyboard.nextDouble();
        //todo
        //base = keyboard.nextDouble();

        // Get the height
        System.out.print("Enter triangle's height? ");
        double height = keyboard.nextDouble();
        //todo
        //height = keyboard.nextDouble();
        double area = 0.5 * base * height;

        // Display the triangle's area.
        System.out.println("The triangle's area is " + area + ".");
    }
}
