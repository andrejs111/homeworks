package io.codelex.enums.practice.Exercise2;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String instruction = "Enter s for scissors, p for paper, r for rock, q to quit: ";

        int totalPlayed = 0;
        int computerVictories = 0;
        int playerVictories = 0;

        System.out.println("Let us begin...\nScissor-Paper-Stone");

        while (true) {
            System.out.println("Your turn. " + instruction);
            String turn = input.nextLine().toLowerCase();
            if (turn.equals("q"))
                break;

            RockPaperScissor.Moves playerMove;
            if (turn.equals("r"))
                playerMove = RockPaperScissor.Moves.ROCK;
            else if (turn.equals("p"))
                playerMove = RockPaperScissor.Moves.PAPER;
            else if (turn.equals("s"))
                playerMove = RockPaperScissor.Moves.SCISSORS;
            else {
                System.out.println("Invalid input.");
                continue;
            }

            RockPaperScissor.Moves computerMove = RockPaperScissor.getRandomMove(random);
            System.out.println("   Your turn: " + playerMove.getFullName());
            System.out.println("   My turn: " + computerMove.getFullName());

            if (playerMove == computerMove) {
                System.out.println("   Tie!");
            } else if (playerMove.beats(computerMove)) {
                System.out.println("   " + playerMove.getFullName() + " beats " + computerMove.getFullName() + ". You won!");
                playerVictories++;
            } else {
                System.out.println("   " + computerMove.getFullName() + " beats " + playerMove.getFullName() + ". I won!");
                computerVictories++;
            }
            totalPlayed++;
            System.out.println();
        }
        Double cpuWinPercentage = RockPaperScissor.calculateWinPercentage(computerVictories, totalPlayed);
        Double plrWinPercentage = RockPaperScissor.calculateWinPercentage(playerVictories, totalPlayed);

        System.out.println("Number of trials: " + totalPlayed);
        System.out.printf("I won %d (%.2f%%). You won %d (%.2f%%).\n", computerVictories, cpuWinPercentage, playerVictories, plrWinPercentage, totalPlayed);
        System.out.println("Bye!");
    }
}