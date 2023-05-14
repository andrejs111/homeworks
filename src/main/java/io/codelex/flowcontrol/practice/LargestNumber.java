package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class LargestNumber {

    //TODO: Write a Java program to to find the largest of three numbers.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();

        int largestNumber;

        if (num1 > num2) {
            largestNumber = num1;
        } else {
            largestNumber = num2;
        }
        if (num3 > largestNumber) {
            largestNumber = num3;
        }

        System.out.printf("The largest number is: %d", largestNumber);
    }

}
