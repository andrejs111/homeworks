package io.codelex.oop.Exercise1;

public class Triangle extends Shapes {
    public Triangle(int numSides, int base, int height) {
        super(numSides, base, height);
    }
    public void getArea() {
        System.out.println("Triangle area: " + base * height / 2);
    }

    public void getPerimeter() {
        double sideA = Math.sqrt((Math.pow((double) base / 2, 2) + Math.pow(height, 2)));
        double perimeter = sideA + sideA + base;
        System.out.printf("Triangle perimeter: %.2f", perimeter);
    }
}
