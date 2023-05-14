package io.codelex.flowcontrol.practice;
import  java.util.Scanner;

public class PrintDayInWord {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome! Please enter a number of the corresponding week day: ");
        if (input.hasNextInt()) {
        int number = input.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
            }
    } else {
            System.out.println("Not a valid day. Please enter a number from 1 to 7.");
        }
    }

}
