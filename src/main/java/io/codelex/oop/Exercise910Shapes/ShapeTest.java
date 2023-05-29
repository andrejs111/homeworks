package io.codelex.oop.Exercise910Shapes;

public class ShapeTest {
    public static void main(String[] args) {
        System.out.println("Testing hexagon methods:\n");
        Hexagon hex1 = new Hexagon(10,10,10,5,5,5);
        Hexagon hex2 = new Hexagon(5,3,10,5,5,5);
        hex1.calculatePerimeter();
        hex1.calculateArea();
        System.out.println();
        System.out.println(hex1.equals(hex2));

        System.out.println("\nTesting triangle methods:\n");
        Triangle tri1 = new Triangle(3, 4, 5);
        Triangle tri2 = new Triangle(4, 5, 3);
        tri1.calculateArea();
        tri2.calculatePerimeter();
        System.out.println(tri1.equals(tri2));

        System.out.println("\nTesting rectangle methods:\n");
        Rectangle rec1 = new Rectangle(6, 8);
        Rectangle rec2 = new Rectangle(8, 6);
        rec1.calculateArea();
        rec2.calculatePerimeter();
        System.out.println(rec2.equals(rec1));

        System.out.println("\nTesting cone methods:\n");
        Cone cone1 = new Cone(6,15);
        cone1.calculatePerimeter();
        cone1.calculateArea();
        cone1.calculateVolume();

        System.out.println("\n\nTesting cube methods:\n");
        Cube cube1 = new Cube(3);
        cube1.calculateArea();
        cube1.calculatePerimeter();
        cube1.calculateVolume();

    }
}
