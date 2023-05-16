package io.codelex.classesandobjects.practice;

import io.codelex.NoCodeWrittenException;

import java.sql.SQLOutput;

public class EnergyDrinks {
    static final int NUMBER_SURVEYED = 12467;
    static final double PURCHASED_ENERGY_DRINKS = 0.14;
    static final double PREFER_CITRUS_DRINKS = 0.64;

    public static double calculateEnergyDrinkers() {
        return NUMBER_SURVEYED * PURCHASED_ENERGY_DRINKS;
    }

    public static double calculatePreferCitrus() {
        return calculateEnergyDrinkers() * PREFER_CITRUS_DRINKS;
    }

    public static void main (String[] args) {
        System.out.println("Approximate amount of people who drink one or more energy drinks weekly: " + calculateEnergyDrinkers());
        System.out.println("Approximate amount of people who prefer citrus: " + calculatePreferCitrus());
    }
}
