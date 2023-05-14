package io.codelex.loops.practice;
import java.util.Scanner;
import java.util.Random;

public class Piglet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Piglet! Press 'y' to roll.");
        String start = input.nextLine().toLowerCase();
        if (!start.equals("y")) {
            System.out.println("Invalid input. Goodbye!");
            return;
        }

        int score = 0;
        boolean keepPlaying = true;

        while (keepPlaying) {
            int roll = random.nextInt(6) + 1;
            System.out.printf("You rolled a %d!\n", roll);

            if (roll == 1) {
                System.out.println("Game over.");
                score = 0;
                break;
            } else {
                score += roll;
                System.out.printf("Your score is %d.\n", score);
                System.out.println("Roll again? (y/n)");
                String answer = input.nextLine();
                if (answer.equalsIgnoreCase("n")) {
                    keepPlaying = false;
                }
            }
        }

        System.out.printf("You got %d points.\n", score);
    }
}







