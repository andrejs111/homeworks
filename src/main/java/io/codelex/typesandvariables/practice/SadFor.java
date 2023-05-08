package io.codelex.typesandvariables.practice;

import io.codelex.NoCodeWrittenException;

public class SadFor {
    public static void main(String[] args) {
        test1();                                       // calls the method test1
    }

    public static void test1() {
        for (int i = 0; i < 10; i++) {
            if (Math.sqrt(i) > 2.5) {
                System.out.println(i);
                break;                     // if the sqrt of the number is > 2.5, the loop stops
            } else {
                System.out.println(i);     // continues the loop if sqrt of i is < 2.5
            }
        }
    }
}
