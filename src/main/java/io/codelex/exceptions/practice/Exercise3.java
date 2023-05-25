package io.codelex.exceptions.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Exercise3 {
    public static void main(String[] args) {
        try {
            File file = new File("C:/Users/User/Folder/document.txt");
            cat(file);
        } catch (RuntimeException e) {
            System.out.println("Some sort of RuntimeException error occured.");
        }
    }
    public static void cat(File file) {
        // TODO - fix this method so it compiles
        RandomAccessFile input = null;
        String line;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Some sort of IOException error occured.");
            throw new RuntimeException(e);
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException e) {
                System.out.println("Some sort of IOException error occured.");
                throw new RuntimeException(e);
            }
        }
    }
}
