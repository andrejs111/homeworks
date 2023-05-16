package io.codelex.classesandobjects.practice.Exercise2;

public class Car {
    double startOdo;
    double endOdo;
    double liters;

    public Car(double startKilometers) {
        this.startOdo = startKilometers;
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
