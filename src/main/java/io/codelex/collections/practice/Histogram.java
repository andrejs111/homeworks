package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "collections\\midtermscores.txt";

    private Map<String, String> histogram;

    public static void main(String[] args) throws IOException {
        Histogram histogram = new Histogram();
        histogram.generateHistogram();
        System.out.println(histogram);
    }
    private String fileContent() throws IOException {
        final Path path = Paths.get(file);
        return Files.readAllLines(path, charset)
                .stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }

    private void generateHistogram() throws IOException {
        final String scores = fileContent();
        String[] scoreArray = scores.split(" ");
        int[] count = new int[11]; // will store the total amount of scores in the corresponding interval
        String asterisk = "*";

        for (String score : scoreArray) {
            int value = Integer.parseInt(score);
            if (value == 100) {
                count[10]++;
            } else {
                int index = value / 10;
                count[index]++;
            }
        }

        histogram = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            String key = String.format("%02d-%02d", i * 10, i * 10 + 9);
            histogram.put(key, asterisk.repeat(count[i]));
        }
        histogram.put("100", asterisk.repeat(count[10]));
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            String key = String.format("%02d-%02d", i * 10, i * 10 + 9);
            sb.append(key).append(": ").append(histogram.getOrDefault(key, "")).append("\n");
        }
        sb.append("  100: ").append(histogram.getOrDefault("100", ""));
        return sb.toString();
    }
}
