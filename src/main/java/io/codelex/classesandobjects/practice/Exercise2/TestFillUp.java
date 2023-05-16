package io.codelex.classesandobjects.practice.Exercise2;

public class TestFillUp {
    public static void main(String[] args) {
        Car testCar = new Car(100);
        testCar.fillUp(200,10);
        testCar.calculateConsumption();
        testCar.fillUp(300,10);
        testCar.calculateConsumption();
    }
}
