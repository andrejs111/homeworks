package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal{

    public Mouse(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.print("> Squeek!");
    }

    @Override
    boolean eat(Food food) {
        if (food instanceof Vegetable) {
            foodEaten += food.getQuantity();
            return true;
        } else {
            System.out.println(getAnimalName() + " doesn't eat that food! He wants Vegetable!");
            return false;
        }
    }
    public String toString() {
        return "name: '" + animalName + '\'' +
                ", type: '" + animalType + '\'' +
                ", weight: " + animalWeight +
                ", habitat: " + livingRegion +
                ", food eaten: " + foodEaten;
    }
}