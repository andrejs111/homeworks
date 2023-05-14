package io.codelex.arrays.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    static final ArrayList<String> words = new ArrayList<>(Arrays.asList(
            "machine", "apple", "library", "computer", "world", "chariot", "war", "infinity"
    ));
    static final int allowedGuesses = 15;

    public static void main(String[] args) {
        System.out.println("Welcome to Hangman!");

        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));         // takes out a random word with .get() method

        char[] hidden = new char[word.length()];                       // creates a new char[] array that will "hide" our word with underscores
        for (int i = 0; i < hidden.length; i++) {                      // using the loop for that, simply hides all of the letters
            hidden[i] = '_';
        }
        int numberOfGuesses = 0;                                       // variables we will use later
        String wrongGuesses = "";
        int remainingGuesses;

        Scanner input = new Scanner(System.in);
        while (numberOfGuesses < allowedGuesses && new String(hidden).contains("_")) {         //new String() converts the char array hidden into a string
            System.out.println("Word: " + new String(hidden));                                 // only initializes if it still contains underscores
            System.out.println("Misses: " + wrongGuesses);
            System.out.print("Guess: ");
            String guess = input.nextLine().toLowerCase();                                     // asks for input and assigns it to string 'guess'
            if (guess.length() != 1) {
                System.out.println("Please enter a single letter.");
                continue;                                                          // keyword continue skips the current iteration and jumps back to start
            }
            char x = guess.charAt(0);                                            // simply checks for numbers etc.
            if (!Character.isLetter(x)) {
                System.out.println("Only letters are allowed.");
                continue;
            }
            if (word.indexOf(x) == -1) {                                       // indexOf() method searches for guessed character in a string and returns -1 if it doesn't find it
                numberOfGuesses++;
                wrongGuesses += x;
                remainingGuesses = allowedGuesses - numberOfGuesses;
                System.out.printf("Incorrect. You have %d guesses remaining.%n", remainingGuesses);
            } else {
                for (int i = 0; i < word.length(); i++) {                           // if the letter is found, changes it immediately in char[] hidden
                    if (word.charAt(i) == x) {
                        hidden[i] = x;
                    }
                }
                numberOfGuesses++;
                remainingGuesses = allowedGuesses - numberOfGuesses;
                System.out.printf("Correct! You have %d guesses remaining.%n", remainingGuesses);
            }
        }
        if (new String(hidden).contains("_")) {
            System.out.printf("Sorry, you lose. The word was '%s.'", word);
        } else {
            System.out.printf("Congratulations, you win! The word was '%s.'", word);
        }
        input.close();
    }
}

