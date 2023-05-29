package io.codelex.oop.Exercise910Shapes;

import java.util.Objects;

public class Cone extends _3DShape {
    protected double radius;
    protected double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double calculatePerimeter() {
        double perimeter = Math.PI * radius * radius;
        System.out.printf("Base perimeter of the cone is: %.2f\nIf you want to find the surface area, refer to .calculateArea().", perimeter);
        return perimeter;
    }

    @Override
    double calculateArea() {
        double surfaceArea = Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
        System.out.printf("\nSurface area of the cone is: %.2f", surfaceArea);
        return surfaceArea;
    }

    @Override
    double calculateVolume() {
        double volume = (Math.PI * radius * radius * height) / 3;
        System.out.printf("\nVolume of the cone is: %.2f", volume);
        return volume;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cone cone)) return false;
        return Double.compare(cone.radius, radius) == 0 && Double.compare(cone.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, height);
    }

    @Override
    public String toString() {
        return "Cone{" +
                "radius=" + radius +
                ", height=" + height +
                '}';
    }
}
