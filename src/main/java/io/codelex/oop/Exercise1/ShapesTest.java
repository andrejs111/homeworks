package io.codelex.oop.Exercise1;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 4, 2);
        rectangle.getArea();
        rectangle.getPerimeter();
        Triangle triangle = new Triangle(3, 4, 2);
        triangle.getArea();
        triangle.getPerimeter();
        System.out.println();
        System.out.println(rectangle);
        System.out.println();
        System.out.println(triangle);
    }
}
