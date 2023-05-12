package io.codelex.typesandvariables.practice;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome!\n");
        System.out.println("Please enter the distance in meters: ");
        double distanceMeters = 0;
        if (input.hasNextInt()) {
            distanceMeters = input.nextInt();
        } else if(input.hasNextDouble()) {
            distanceMeters = input.nextDouble();
        }
        input.nextLine();
        System.out.printf("Enter the total time taken (hh:mm:ss): ");
        String timeTaken = input.nextLine();
        String[] timeArr = timeTaken.split(":");
        int hours = Integer.parseInt(timeArr[0]);
        int minutes = Integer.parseInt(timeArr[1]);
        int seconds = Integer.parseInt(timeArr[2]);

        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
        double speedMS = distanceMeters / totalSeconds;
        double speedKmpH = (distanceMeters / 1000) / ((double) totalSeconds / 3600);
        double speedMpH = (distanceMeters / 1609) / ((double) totalSeconds / 3600);
        System.out.printf("Your speed in meters per second was: %.2f\n", speedMS);
        System.out.printf("Your speed in kilometers per hour was: %.2f\n", speedKmpH);
        System.out.printf("Your speed in miles per hour was: %.2f\n", speedMpH);
    }
}
