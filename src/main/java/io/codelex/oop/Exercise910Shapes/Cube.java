package io.codelex.oop.Exercise910Shapes;

import java.util.Objects;

public class Cube extends _3DShape{

    protected double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    double calculatePerimeter() {
        System.out.println("Refer to .calculateArea() if you want to calculate surface area.");
        return 0;
    }
    @Override
    double calculateArea() {
        double area = side * 6;
        System.out.println("Surface area of the cube is: " + area);
        return area;
    }

    @Override
    double calculateVolume() {
        double volume = Math.pow(side, 3);
        System.out.println("Volume of the cube is: " + volume);
        return volume;
    }
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cube cube)) return false;
        return Double.compare(cube.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }

    @Override
    public String toString() {
        return "Cube{" +
                "side=" + side +
                '}';
    }
}
