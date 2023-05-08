package io.codelex.typesandvariables.practice;

import java.text.DecimalFormat;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String name, eyes, teeth, hair;
        int age;
        double  height, weight;
        name = "Zed A. Shaw";
        age = 35;
        height = 74 * 2.54;  // inches
        weight = 180 * 0.453592; // lbs
        eyes = "Blue";
        teeth = "White";
        hair = "Brown";
        DecimalFormat decNum = new DecimalFormat("#.00"); // creating a pattern for two digits
        String decWeight = decNum.format(weight).replace(',', '.');
        String decHeight = decNum.format(height).replace(',', '.');

        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + decHeight + " centimeters tall.");
        System.out.println("He's " + decWeight + " kilograms heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " + age + ", " + decHeight + ", and " + decWeight
                + " I get " + (age + decHeight + decWeight) + ".");
    }
}