package io.codelex.classesandobjects.practice.Exercise2;

public class Car {
    private double startOdo;
    private double endOdo;
    private double liters;

    public Car(double startKilometers) {
        this.startOdo = startKilometers;
    }

    public Car (double startKilometers, double endKilometers, double liters) {
        this.startOdo = startKilometers;
        this.endOdo = endKilometers;
        this.liters = liters;
    }

    double calculateConsumption() {
        double consumption = (endOdo - startOdo) / liters;
        System.out.println("Consumption: " + consumption + " km/l.");
        return consumption;
    }

    boolean gasHog() {
        if (calculateConsumption() < 6.666) {
            return true;                                  // 100km / 15l = ~6.666 km/l;
        }
        return false;
    }

    boolean economyCar() {
        if (calculateConsumption() < 20) {
            return false;                                  // 100 km / 5l = 20 km/l;
        }
        return false;
    }
    void fillUp(double mileage, double liters) {
        this.endOdo = mileage;
        this.liters = liters;
    }
}
