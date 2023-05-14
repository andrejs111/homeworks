package io.codelex.classesandobjects.practice.Exercise2;

public class Car {
    double startOdo;
    double endOdo;
    double liters;

    public Car(double startKilometers, double endKilometers, double liters) {
        this.startOdo = startKilometers;
        this.endOdo = endKilometers;
        this.liters = liters;
    }

    double calculateConsumption() {
        double consumption = (endOdo - startOdo) / liters;
        System.out.println("Consumption: " + consumption);
        return consumption;
    }

    boolean gasHog() {

    }
}
