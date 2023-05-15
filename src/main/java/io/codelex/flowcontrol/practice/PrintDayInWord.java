package io.codelex.flowcontrol.practice;
import  java.util.Scanner;

public class PrintDayInWord {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome! Please enter a number of the corresponding week day: ");
        if (input.hasNextInt()) {
        int number = input.nextInt();
            switch (number) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                }
                    } else {
                        System.out.println("Not a valid day. Please enter a number from 1 to 7.");
        }
    }
}
