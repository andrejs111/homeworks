package io.codelex.exceptions.practice;

import java.lang.reflect.Array;

public class Exercise4 {
    public static void main(String[] args) {
        String test = "4";
        String test2 = "-10";
        String test3 = "abc";
        try {
            double d = getInput(test2);
            if (d < 0) {
                throw new NonPositiveNumberException();
            }
            double root = Math.sqrt(d);
            System.out.println("The square root of " + d + " is " + root);
        } catch (NumberFormatException e) {
            System.out.println("Be sure to enter a number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter number as first parameter.");
        } catch (NonPositiveNumberException e) {
        System.out.println("Result will be imaginary number.");
        }
    }
    static double getInput(String s) {
        double d = Double.parseDouble(s);
        return d;
    }
}
class NonPositiveNumberException extends Exception {            // subclass of Exception
    public NonPositiveNumberException() {
        super("Non-positive number encountered.");
    }
}
