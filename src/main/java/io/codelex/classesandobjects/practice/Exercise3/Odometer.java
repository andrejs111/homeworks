package io.codelex.classesandobjects.practice.Exercise3;

import java.util.Scanner;

public class Odometer {
    double mileage;

    public Odometer(double mileage) {
        this.mileage = mileage;
    }
    public void reportOdometer() {
        System.out.println("Current mileage: " + mileage);
    }
    public void runCar(FuelGauge fuelGauge) {
        Scanner input = new Scanner(System.in);
        System.out.println("How far do you want to drive (km)?");
        double distance = input.nextDouble();
        for (int i = 0; i < distance; i++) {
            if (i % 10 == 0) {                                              // 10km/1l
                fuelGauge.decrementFuel();
                System.out.println("Fuel: " + fuelGauge);
                System.out.println("Mileage: " + (mileage + 10));
            }
            mileage++;
            if (mileage > 999999) {
                mileage = 0;
            }
        }
    }
}
