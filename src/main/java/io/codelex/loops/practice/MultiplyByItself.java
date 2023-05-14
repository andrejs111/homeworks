package io.codelex.loops.practice;
import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the number you want to multiply: ");
        int a = in.nextInt();
        System.out.print("Input the number of terms : ");
        int n = in.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= a;
        }
        System.out.println("Result: " + result);
        /*
        todo - complete loop to multiply i with itself n times, it is NOT allowed to use Math.pow()
        for (.......) {
          System.out.println(........);
        }
        */
    }

}
