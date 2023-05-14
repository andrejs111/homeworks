package io.codelex.classesandobjects.practice.Exercise1;

public class Product {

    private String name;
    private double price;
    private int amount;
    public Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.price = priceAtStart;
        this.amount = amountAtStart;
    }

    public void printProduct() {
        System.out.printf("%s, price %.2f, amount %d\n", name, price, amount);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

