package io.codelex.oop.Exercise910Shapes;

import java.util.Arrays;
import java.util.Objects;

public class Triangle extends Shape {
    protected double sideA;
    protected double sideB;
    protected double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalArgumentException("Triangle sides must be greater than 0.");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    @Override
    double calculatePerimeter() {
        double sum = sideA + sideB + sideC;
        System.out.println("Triangle perimeter is: " + sum);
        return sum;
    }

    @Override
    double calculateArea() {
        double base = calculatePerimeter() / 2;
        double area = Math.sqrt(base * (base - sideA) * (base - sideB) * (base - sideC));
        System.out.println("Triangle area is: " + area);
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

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle triangle)) return false;

        double[] sides = {sideA, sideB, sideC};
        double[] otherSides = {triangle.sideA, triangle.sideB, triangle.sideC};

        Arrays.sort(sides);
        Arrays.sort(otherSides);

        return Arrays.equals(sides, otherSides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB, sideC);
    }
}
