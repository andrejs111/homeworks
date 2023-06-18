package io.codelex.java.advanced.test.Exercise2;

public class BasketMain {
    public static void main(String[] args) {
        Basket<Apple> basket = new Basket<>();
        basket.addSomething(new Apple());
        basket.addSomething(new Apple());
        System.out.println(basket.getAmount());
    }
}
