package io.codelex.loops.practice;
import java.util.Scanner;
import java.util.Random;

public class RollTwoDice {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Desired sum: ");
        int sum = input.nextInt();
        int total;
        int dice1;
        int dice2;

        do {
            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6) + 1;
            total = dice1 + dice2;
            System.out.printf("%d and %d = %d\n", dice1, dice2, total);
        } while (total != sum);
    }
}
