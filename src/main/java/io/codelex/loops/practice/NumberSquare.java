package io.codelex.loops.practice;
import java.sql.SQLOutput;
import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Min? ");
        int min = input.nextInt();

        System.out.println("Max? ");
        int max = input.nextInt();
        /*
        int min = 1;
        int max = 5;
        */

        for (int i = min; i <= max; i++) {
            for (int j = i; j <= max; j++) {
                System.out.print(j + " ");
            }
            for (int k = min; k < i; k++) {     // always starts on 2nd iteration because k < i
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
