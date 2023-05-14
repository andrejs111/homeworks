package io.codelex.flowcontrol.practice;
import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine().toLowerCase();

        System.out.println("Your sentence in numbers will be: ");
        for (int i = 0; i < sentence.length(); i++) {
            char letter = sentence.charAt(i);
            switch (letter) {
                case 'a': case 'b': case 'c':
                    System.out.print(2);
                    break;
                case 'd': case 'e': case 'f':
                    System.out.print(3);
                    break;
                case 'g': case 'h': case 'i':
                    System.out.print(4);
                    break;
                case 'j': case 'k': case 'l':
                    System.out.print(5);
                    break;
                case 'm': case 'n': case 'o':
                    System.out.print(6);
                    break;
                case 'p': case 'q': case 'r': case 's':
                    System.out.print(7);
                    break;
                case 't': case 'u':case 'v':
                    System.out.print(8);
                    break;
                case 'w': case 'x': case 'y': case 'z':
                    System.out.print(9);
                    break;
                case ' ':
                    System.out.print('-');
                    break;
                default:
                    System.out.println("These letters can't be added" + letter);
            }
        }


    }
}
