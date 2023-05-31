package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "C:\\collections\\lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(file);
        Files.readAllLines(path, charset);
        countLinesAndChars(path);
        countWords(path);
    }

    private static void countLinesAndChars(Path path) throws IOException {
        int lineCount = 0;
        int charCount = 0;
        for (String line : Files.readAllLines(path, charset)) {
            lineCount++;
            charCount += line.length();
        }
        System.out.println("Lines = " + lineCount);
        System.out.println("Chars = " + charCount);
    }

    public static void countWords(Path path) throws IOException {
        List<String> words = new ArrayList<>();
        for (String line : Files.readAllLines(path, charset)) {
            String[] lineWords = line.split("\\s+");
            for (String word : lineWords) {
                if (!word.isEmpty()) {
                    words.add(word);
                }
            }
        }
        int wordCount = words.size();
        System.out.println("Words = " + wordCount);
    }
}

