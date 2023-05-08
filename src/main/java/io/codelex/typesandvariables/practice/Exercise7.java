package io.codelex.typesandvariables.practice;
import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome!\nPlease enter your text: ");
        String userInput = input.nextLine();
        int count = 0;
        for (int i = 0; i < userInput.length(); i++) {
            char charN = userInput.charAt(i); // specify the char we are checking
            if (Character.isUpperCase(charN)) {      // using Character.isUpperCase method to check if our char is uppercase
                count++;
            }
        }
        System.out.printf("Your text has %d uppercase characters.", count);
    }
}
