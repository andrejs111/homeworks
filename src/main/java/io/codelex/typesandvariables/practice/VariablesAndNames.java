package io.codelex.typesandvariables.practice;

import java.text.DecimalFormat;

public class VariablesAndNames {
    public static void main(String[] args) {
        int cars, drivers, passengers, carsNotDriven, carsDriven, seatsInCar, carpoolCapacity;
        double  avgPassengers;

        cars = 100;
        seatsInCar = 4;
        drivers = 30;
        passengers = 90;
        carsNotDriven = cars - drivers;
        carsDriven = drivers;
        carpoolCapacity = carsDriven * seatsInCar;
        avgPassengers = passengers / carsDriven;
        DecimalFormat avgP = new DecimalFormat("#.00"); // creating a pattern for two digits
        String formatted = avgP.format(avgPassengers);

        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + carsNotDriven + " empty cars today.");
        System.out.println("We can transport " + carpoolCapacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.println("We need to put about " + formatted + " in each car.");
    }
}