package io.codelex.trivia.game;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class Question {
        private static final Set<Long> usedQuestions = new HashSet<>(); // Set that contains question numbers that were already played out
        private static URL url;
        private static String correctAnswer;    // String that contains the correct answer of the current question

        // Method that establishes connection and calls the returnQuestion() method
        public static void getQuestion() {
            try {
                URL url = new URL("http://numbersapi.com/random/trivia");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.connect();
                int responseCode = conn.getResponseCode();
                if (responseCode == 200) {
                    Question.url = url;
                    returnQuestion();
                } else {
                    throw new RuntimeException("HttpResponseCode: " + responseCode);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Method that reads the trivia question from the URL and calls the formatQuestion() method next
        public static void returnQuestion() {
            StringBuilder question = new StringBuilder();
            try (Scanner scanner = new Scanner(url.openStream())) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine().trim();
                    if (!line.isEmpty()) {
                        question.append(line);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(formatQuestion(question.toString()));
        }

        // Method that splits the trivia question into two parts, checks if the number is not abnormally big (I chose 100 000),
        // checks if the question haven't been played out already, calls getQuestion() to call for a new question
        // if the conditions weren't met
        public static String formatQuestion(String string) {
            Pattern pattern = Pattern.compile("(.+?) is (.+)");
            Matcher matcher = pattern.matcher(string);
            String result = "";
            Long number;
            if (matcher.matches()) {
                Pattern numberPattern = Pattern.compile("([1-9]\\d{0,4}|100000)");
                Matcher numberMatcher = numberPattern.matcher(matcher.group(1));
                if (numberMatcher.matches()) {
                    number = Long.parseLong(numberMatcher.group(0));
                    if (usedQuestions.contains(number)) {
                        getQuestion();
                    } else {
                        correctAnswer = matcher.group(2);
                        result = number + " is...\n";
                        usedQuestions.add(number);
                    }
                } else {
                    getQuestion();
                }
            }
            return result;
        }


        // Has the same function as formatQuestion(), but for wrong answers and therefore isn't as strict with conditions
        // Just splits the string in two leaving out the number
        public static String wrongAnswer() throws IOException {
            StringBuilder question = new StringBuilder();
            try (Scanner scanner = new Scanner(url.openStream())) {
                while (scanner.hasNextLine()) {
                    question.append(scanner.nextLine());
                }
            }
            Pattern pattern = Pattern.compile("(.+?) is (.+)");
            Matcher matcher = pattern.matcher(question);
            String result = "";
            if (matcher.find()) {
                result = matcher.group(2);
            }
            return result;
        }

        public static String getCorrectAnswer() {
            return correctAnswer;
        }
    }
