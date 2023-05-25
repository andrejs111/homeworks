package io.codelex.exceptions.practice;

public class Exercise2 {
    private static int a = 10;
    private static int b = 0;

    public static void main(String[] args) {
        methodA(a, b);
    }

    public static void methodA(int a, int b) throws ArithmeticException {
        try {
            methodB(a, b);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void methodB(int a, int b) throws ArithmeticException {
        try {
            methodC(a, b);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void methodC(int a, int b) throws ArithmeticException {
        try {
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
