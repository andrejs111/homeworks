package io.codelex.classesandobjects.practice.Exercise7;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Max", "male");
        Dog dog2 = new Dog("Rocky", "male");
        Dog dog3 = new Dog("Sparky", "male");
        Dog dog4 = new Dog("Buster", "male");
        Dog dog5 = new Dog("Sam", "male");
        Dog dog6 = new Dog("Lady", "female");
        Dog dog7 = new Dog("Molly", "female");
        Dog dog8 = new Dog("Coco", "female");

        dog1.setParent(dog6, dog2);
        dog8.setParent(dog7, dog4);
        dog2.setParent(dog7, dog5);
        dog4.setParent(dog3, dog6);

        // System.out.println(dog3);
        dog8.fathersName();
        dog3.fathersName();
        dog8.hasSameMotherAs(dog2);
        dog8.hasSameMotherAs(dog1);
    }
}
