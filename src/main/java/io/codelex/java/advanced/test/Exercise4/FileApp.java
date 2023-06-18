package io.codelex.java.advanced.test.Exercise4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileApp {
    private static final String PATH = "C:\\Users\\Andrey\\Desktop\\CODELEX\\Projects\\homeworks\\src\\main\\java\\io\\codelex\\java\\advanced\\test\\Exercise4\\";

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH + "myFile.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter(PATH + "eliFym.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                StringBuilder reversedLine = new StringBuilder();
                for (int i = line.length() - 1; i >= 0; i--) {
                    reversedLine.append(line.charAt(i));
                }
                System.out.println(reversedLine);
                writer.write(reversedLine.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}