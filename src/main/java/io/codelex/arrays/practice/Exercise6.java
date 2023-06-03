package io.codelex.arrays.practice;
import io.codelex.collections.practice.lists.ArrayListExercise1;

import java.util.Arrays;
import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(100);
        }
        for (int j = 0; j < array1.length; j++) {
            array2[j] = array1[j];
        }
        array2[9] = -7;
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
    }
}
