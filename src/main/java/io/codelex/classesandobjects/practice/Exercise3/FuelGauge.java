package io.codelex.classesandobjects.practice.Exercise3;

import java.util.Scanner;

public class FuelGauge {
    double fuel;

    public FuelGauge(double liters) {
        this.fuel = liters;
    }

    public void reportGauge() {
        System.out.println("Current fuel gauge: " + fuel);
    }

    public void fillCar() {
        Scanner input = new Scanner(System.in);
        String userInput;
        while (true) {
            System.out.println("How much fuel would you like to add? (type 'quit' to exit)");
            userInput = input.nextLine();
            if (userInput.equals("quit")) {
                break;
            } else {
                double litersToAdd = Double.parseDouble(userInput);                            // need this because the user types in a string
                if (fuel + litersToAdd > 70) {
                    System.out.println("Can't hold more than 70 liters, reduce the volume.");
                    continue;
                } else {
                    System.out.println("Current fuel volume is: " + (fuel + litersToAdd));
                }
                this.fuel += litersToAdd;
            }
        }
    }
    public void decrementFuel() {
        if (fuel > 0) {
            fuel--;
        }
    }

    @Override
    public String toString() {
        return "FuelGauge{" +
                "fuel=" + fuel +
                '}';
    }
}
