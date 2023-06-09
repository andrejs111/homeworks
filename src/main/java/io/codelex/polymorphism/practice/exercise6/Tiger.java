package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Feline{
    public Tiger(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.print("> Roar!");
    }
    @Override
    boolean eat(Food food) {
        if (food instanceof Meat) {
            foodEaten += food.getQuantity();
            return true;
        } else {
            System.out.println(getAnimalName() + " doesn't eat that food! He wants Meat!");
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
