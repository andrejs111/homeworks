package io.codelex.oop.Exercise910Shapes;

import java.util.Arrays;
import java.util.Objects;

public class Rectangle extends Shape {
    protected double sideA;
    protected double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double calculatePerimeter() {
        double sum = sideA*2 + sideB*2;
        System.out.println("Rectangle perimeter is: " + sum);
        return sum;
    }

    @Override
    double calculateArea() {
        double area = sideA * sideB;
        System.out.println("Rectangle area is: " + area);
        return area;
    }
    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle rectangle)) return false;

        double[] sides = {sideA, sideB};
        double[] otherSides = {rectangle.sideA, rectangle.sideB};

        Arrays.sort(sides);
        Arrays.sort(otherSides);

        return Arrays.equals(sides, otherSides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
