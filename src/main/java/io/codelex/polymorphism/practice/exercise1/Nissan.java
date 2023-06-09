package io.codelex.polymorphism.practice.exercise1;

public class Nissan implements Car, NitrousOxide {
    private Integer currentSpeed = 0;
    public void speedUp() {
        currentSpeed += 13;
    }

    public void slowDown() {
        currentSpeed -= 13;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 40;
    }

    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    @Override
    public String toString() {
        return "Nissan: " +
                "currentSpeed=" + currentSpeed;
    }
}
