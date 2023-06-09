package io.codelex.polymorphism.practice.exercise6;

public class Mammal extends Animal {
    protected String livingRegion;
    public Mammal(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }

    @Override
    void makeSound() {
        System.out.println("> ");
    }
    @Override
    boolean eat(Food food) {
        return false;
    }
}
