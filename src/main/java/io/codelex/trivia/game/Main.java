package io.codelex.trivia.game;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class Main {

    private static int correctAnswerCount;  // stores the amount of correct answers in the game
    private static final int MAX_ANSWER_COUNT = 20;

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("\nYour objective is to correctly answer 20 questions.\n" +
                            "You will be asked to choose the answer out of three options. Only one option is correct.\n" +
                            "When you have decided on your answer, choose the respective number: 1, 2 or 3.\n");
        while (correctAnswerCount < MAX_ANSWER_COUNT) {
            System.out.println("\n---NEXT QUESTION---\n");
            Question.getQuestion();

            HashMap<String, Boolean> answerMap = new HashMap<>();        // used to check if the chosen answer is correct

            answerMap.put(Question.getCorrectAnswer(), true);
            answerMap.put(Question.wrongAnswer(), false);
            answerMap.put(Question.wrongAnswer(), false);

            List<String> keysList = new ArrayList<>(answerMap.keySet());
            Collections.shuffle(keysList);                              // shuffles the answers so they are printed at random positions

            System.out.println("1. " + keysList.get(0));
            System.out.println("2. " + keysList.get(1));
            System.out.println("3. " + keysList.get(2));

            System.out.println("\n Choose your answer (1,2,3):\n");

            int userChoice = input.nextInt();

            if (userChoice >= 1 && userChoice <= 3) {
                String selectedAnswer = keysList.get(userChoice - 1);
                boolean isCorrect = answerMap.get(selectedAnswer);
                if (isCorrect) {
                    correctAnswerCount++;
                    System.out.println("Correct answer. Moving to the next question.");
                } else {
                    System.out.println("Wrong answer.\nCorrect answer is: " + Question.getCorrectAnswer() + " Moving to the next question.");
                }
            } else {
                System.out.println("Invalid choice. Moving to the next question.");
            }
            System.out.printf("\n---CORRECT ANSWERS: %d---\n", correctAnswerCount);
        }
    }
}