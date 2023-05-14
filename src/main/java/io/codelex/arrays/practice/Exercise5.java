package io.codelex.arrays.practice;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {

    //TODO: Write a Java program to find the index of an array element.
    public static void main(String[] args) {
        int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        Scanner input = new Scanner(System.in);
        System.out.println("What number would you like to find? \n" + Arrays.toString(myArray));
        int number = input.nextInt();
        System.out.println(findIndex(number, myArray));
    }
    public static String findIndex(int num, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return "Index position of " + num + " is: " + i;
            }
        }
        return "There is no such number in this array.";
    }
}

        /*
        fixme
        for (?) {
            
        }
        */

        //Expected output:
        //Index position of 36 is: 4
        //Index position of 29 is: 8
        
        /*
        fixme
        System.out.println("Index position of 36 is: " + indexOfElement36);
        System.out.println("Index position of 29 is: " + indexOfElement29);
        */