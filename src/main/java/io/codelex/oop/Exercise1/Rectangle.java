package io.codelex.oop.Exercise1;

public class Rectangle extends Shapes {
    public Rectangle(int numSides, int base, int height) {
        super(numSides, base, height);
    }

    public void getArea() {
        System.out.println("Rectangle area: " + base * height);
    }

    public void getPerimeter() {
        System.out.println("Rectangle perimeter: " + base * 2 + height * 2);
    }
}
