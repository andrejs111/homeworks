package io.codelex.arithmetic.practice;
// Write a program called Product1ToN to compute the product of integers from 1 to 10 (i.e., 1×2×3×...×10), as an int.
// Take a note that it is the same as factorial of N.
public class Product1ToN {
    public static void main (String[] args) {
        int num1 = 1;
        int num2 = 10;
        int result = 1;
        for (int i = num1; i < num2; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
