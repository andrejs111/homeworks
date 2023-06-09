package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Feline {
    protected String breed;

    public Cat(String animalName, String animalType, double animalWeight, int foodEaten, String breed) {
        super(animalName, animalType, animalWeight, foodEaten, breed);
    }

    @Override
    void makeSound() {
        System.out.println("> Meow!");
    }

    @Override
    boolean eat(Food food) {
        if (food instanceof Meat) {
            foodEaten += food.getQuantity();
            return true;
        } else {
            System.out.println(getAnimalName() + " doesn't eat that food!");
            return false;
        }
    }

    public String toString() {
        return "name: '" + animalName + '\'' +
                ", type: '" + animalType + '\'' +
                ", weight: " + animalWeight +
                ", breed: " + breed +
                ", food eaten: " + foodEaten;
    }
}
