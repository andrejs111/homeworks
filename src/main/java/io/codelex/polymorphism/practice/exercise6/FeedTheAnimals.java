package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.Scanner;

public class FeedTheAnimals {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Cat", "Gray", 4.5, 0, "Persian"));
        animals.add(new Tiger("Tiger", "Bengal", 450, 0, "Asia"));
        animals.add(new Mouse("Mouse", "Domestic", 0.340, 0, "Europe"));
        animals.add(new Zebra("Zebra", "Ordinary", 300, 0,"Africa"));

        // The program below will loop infinitely until the user chooses to stop feeding the animals

        System.out.println("\nWelcome. Please feed all of the animals. Carnivores eat 'Meat', herbivores and rodents eat 'Vegetable'.\nType 'End' to exit the program when you're done.\n");
        Scanner input = new Scanner(System.in);

        int currentAnimalID = 0;

        while (true) {
            Animal animal = animals.get(currentAnimalID);
            System.out.println("----Feed this animal----");
            System.out.println(animal);
            animal.makeSound();

            while (true) {
                System.out.println();
                String foodInput = input.nextLine();

                if (foodInput.equalsIgnoreCase("End")) {
                    System.out.println("Exiting the program...");
                    return;
                }

                String[] foodData = foodInput.split(" ");

                if (foodData.length != 2) {
                    System.out.println("Invalid food input. Please provide food type and quantity (e.g., Vegetable 4)");
                    continue;
                }

                String foodType = foodData[0];
                int foodQuantity;

                try {
                    foodQuantity = Integer.parseInt(foodData[1]);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid food quantity. Please provide a valid integer value.");
                    continue;
                }

                Food food;

                if (foodType.equals("Vegetable")) {
                    food = new Vegetable(foodQuantity);
                } else if (foodType.equals("Meat")) {
                    food = new Meat(foodQuantity);
                } else {
                    System.out.println("Invalid food type: " + foodType + ". Correct the typo.");
                    continue;
                }

                boolean ateFood = animal.eat(food);

                if (ateFood) {
                    System.out.println(animal);
                    System.out.println("----The animal is fed!----\n");
                    break;
                } else {
                    animal.makeSound();
                }
            }

            currentAnimalID = (currentAnimalID + 1) % animals.size();
        }
    }
}