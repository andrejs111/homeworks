package io.codelex.arrays.practice;
import io.codelex.collections.practice.lists.ArrayListExercise1;

import java.util.Arrays;
import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] Array1 = new int[10];
        int[] Array2 = new int[10];
        for (int i = 0; i < Array1.length; i++) {
            Array1[i] = random.nextInt(100);
        }
            for (int j = 0; j < Array1.length; j++) {
                Array2[j] = Array1[j];
            }
            Array2[9] = -7;
        System.out.println("Array 1: " + Arrays.toString(Array1));
        System.out.println("Array 2: " + Arrays.toString(Array2));
        }
    }
