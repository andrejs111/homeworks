package io.codelex.arrays.practice;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise4 {

    //TODO: Write a Java program to test if an array contains a specific value.
    public static void main(String[] args) {
        int[] myArray = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456
        };
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number you want to find: ");
        int number = input.nextInt();
        System.out.println(findNumber(number, myArray));
    }

    public static String findNumber(int number, int[] array) {
        boolean found = Arrays.stream(array).anyMatch(n -> n == number);
        if (found) {
            return "Contains!";
        } else {
            return "There is no such number in this array.";
        }
    }
}
