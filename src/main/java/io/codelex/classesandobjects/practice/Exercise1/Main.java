package io.codelex.classesandobjects.practice.Exercise1;

public class Main {
    public static void main(String[] args) {
        Product mouse = new Product("Logitech mouse", 70.00, 14);
        Product phone = new Product("iPhone 5s", 999.99, 3);
        Product camera = new Product("Epson EB-U05", 440.46, 1);

        phone.setAmount(30);
        camera.setPrice(500);

        camera.printProduct();
        mouse.printProduct();
        phone.printProduct();

    }
}
