package io.codelex.classesandobjects.practice.Exercise3;

public class Main {
    public static void main(String[] args) {
        FuelGauge gauge = new FuelGauge(10);
        Odometer odometer = new Odometer(100);
        gauge.reportGauge();
        odometer.reportOdometer();
        gauge.fillCar();
        gauge.reportGauge();
        odometer.runCar(gauge);
    }
}
