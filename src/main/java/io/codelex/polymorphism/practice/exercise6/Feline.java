package io.codelex.polymorphism.practice.exercise6;

public class Feline extends Mammal{

    public Feline(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    void makeSound() {
        super.makeSound();
    }
}
