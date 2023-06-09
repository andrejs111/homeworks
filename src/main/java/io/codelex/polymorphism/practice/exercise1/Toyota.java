package io.codelex.polymorphism.practice.exercise1;

public class Toyota implements Car {

    private Integer currentSpeed = 0;

    public void speedUp() {
        currentSpeed += 5;
    }

    public void slowDown() {
        currentSpeed -= 5;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void startEngine() {
            System.out.println("Rrrrrrr.....");
        }

    @Override
    public String toString() {
        return "Toyota: " +
                "currentSpeed=" + currentSpeed;
    }
}
