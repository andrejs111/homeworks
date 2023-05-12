package io.codelex.typesandvariables.practice;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome!\nPlease enter a number of minutes: ");
        int minutes = input.nextInt();
        int years = minutes / 525600;
        double days = (float) (minutes - (years * 525600)) / 1440;
        System.out.printf("%d minutes equals to %d years and %.2f days.", minutes, years, days); //%.2f specifies the number of digits after the decimal point
    }
}