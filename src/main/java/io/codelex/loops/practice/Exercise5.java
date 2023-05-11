package io.codelex.loops.practice;
import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first word: ");
        String firstWord = input.next();
        System.out.println("Enter the second word: ");
        String secondWord = input.next();

        int dots = 30 - (firstWord.length() + secondWord.length());
        System.out.print(firstWord);
        for (int i = 0; i < dots; i++) {
            System.out.print(".");
        }
        System.out.print(secondWord);
    }
}
