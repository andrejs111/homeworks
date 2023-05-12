package io.codelex.arithmetic.practice;
// Write a program called SumAverageRunningInt to produce the sum of 1, 2, 3, ..., to 100. Store 1 and
// 100 in variables lowerbound and upperbound, so that we can change their values easily. Also compute and display the average.
// The output shall look like:
//The sum of 1 to 100 is 5050
//The average is 50.5
public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        int lowerBound = 1;
        int upperBound = 100;

        for (int number = lowerBound; number <= upperBound; ++number) {
            sum += number;
        }
        average = (double) sum / (upperBound - lowerBound + 1); //turning sum into double data type so the result is as specified
        System.out.printf("The sum of %d to %d is %d\n", lowerBound, upperBound, sum);
        System.out.println("The average is " + average);
    }
}
