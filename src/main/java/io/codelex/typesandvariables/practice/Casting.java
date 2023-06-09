package io.codelex.typesandvariables.practice;

public class Casting {
    public static void main(String[] args) {
        first();
        second();
    }

    private static void first() {
        String a = "1";
        Integer b = 2;
        int c = 3;
        double d = 4;
        float e = 5;

        //fixme - should be 15 :| 
        int sum = Integer.parseInt(a) + b + c + (int) d + (int) e; // We use Integer.parseInt to extract numeric value from the string, then cast (int) to double and float values
        System.out.println(sum);
    }

    private static void second() {
        String a = "1";
        Integer b = 2;
        int c = 3;
        double d = 4.2;
        float e = 5.3f;

        //fixme - should be 15.5 :| 
        float sum = Float.parseFloat(a) + (float) b + (float) c + (float) d + e;
        System.out.println(sum);
    }
}
