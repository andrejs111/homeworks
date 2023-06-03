package io.codelex.classesandobjects.practice.Exercise2;

import java.util.Scanner;

class LitersPerKilometer {
    public static void litersPerKilometer()  {
        Scanner scan = new Scanner(System.in);

        double startKilometers, endKilometers, liters;

        System.out.print("Enter first reading: " );
        startKilometers = scan.nextDouble();

        System.out.print("Enter second reading: " );
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: " );
        liters  = scan.nextDouble();

        Car car = new Car(startKilometers, endKilometers, liters);

        System.out.println( "Kilometers per liter are "  + car.calculateConsumption() );
    }
}