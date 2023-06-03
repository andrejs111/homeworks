package io.codelex.classesandobjects.practice.Exercise2;
import java.util.Scanner;
import static io.codelex.classesandobjects.practice.Exercise2.LitersPerKilometer.litersPerKilometer;

public class Main {
    public static void main(String[] args) {

        Car bmw = new Car(500);
        Car mercedes = new Car(750);
        bmw.calculateConsumption();
        mercedes.calculateConsumption();
        userCar();
    }
    public static void userCar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the startKilometers: ");
        double inputStart = input.nextDouble();
        System.out.println("Enter the endKilometers: ");
        double inputMileage = input.nextDouble();
        System.out.println("Enter the liters: ");
        double inputLiters = input.nextDouble();

        Car userCar = new Car(inputStart);
        userCar.fillUp(inputMileage, inputLiters);
        userCar.calculateConsumption();

        if (userCar.gasHog()) {
            System.out.println("Your car is a gas hog.");
        } else {
            System.out.println("Your car is an economy car.");
        }
    }
}