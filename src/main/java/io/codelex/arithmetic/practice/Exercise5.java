package io.codelex.arithmetic.practice;
import java.util.Scanner;
// Write a program that picks a random number from 1-100. Give the user a chance to guess it. If they get it right, tell them so.
// If their guess is higher than the number, say "Too high." If their guess is lower than the number, say "Too low."
// Then quit. (They don't get any more guesses for now.)
public class Exercise5 {
    public static void main (String[] args) {
        int random = (int) (Math.random() * 100) + 1;  // casting (int) always rounds down, so +1 prevents 0
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number between 1-100: ");
        int guess = sc.nextInt();
        if (guess == random) {
            System.out.println("You guessed correctly!");
        } else if (guess < random) {
            System.out.println("Too low.");
        } else {
            System.out.println("Too high.");
        }
    }
}
