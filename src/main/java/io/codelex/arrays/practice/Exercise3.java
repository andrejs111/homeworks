package io.codelex.arrays.practice;

public class Exercise3 {

    //TODO: Write a Java program to calculate the average value of array elements.
    public static void main(String[] args) {
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};
        System.out.println(calculateSum(numbers));
        System.out.println(calculateAverage(numbers));
    }
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
    public static double calculateAverage(int[] numbers) {
        double average;
        average = (double) calculateSum(numbers) / numbers.length;
        return average;
    }
}
