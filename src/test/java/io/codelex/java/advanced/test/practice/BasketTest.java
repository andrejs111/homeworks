package io.codelex.java.advanced.test.practice;

import io.codelex.java.advanced.test.Exercise2.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class BasketTest {
    @Test
    public void testBasketWithOneApple() {
        Basket<Apple> appleBasket = new Basket<>();
        Assertions.assertEquals(0, appleBasket.getAmount());
        Apple apple1 = new Apple();
        appleBasket.addSomething(apple1);
        Assertions.assertEquals(1, appleBasket.getAmount());
        Assertions.assertEquals(apple1, appleBasket.getItem());
    }
    @Test
    public void testBasketFullException() {
        Basket<Apple> appleBasket = new Basket<>();
        Assertions.assertEquals(0, appleBasket.getAmount());

        for (int i = 0; i < 10; i++) {
            Apple apple = new Apple();
            appleBasket.addSomething(apple);
        }
        Assertions.assertEquals(10, appleBasket.getAmount());
        Apple newApple = new Apple();
        assertThrows(BasketFullException.class, () -> appleBasket.addSomething(newApple));
    }

    @Test
    public void testBasketEmptyException() {
        Basket<Apple> appleBasket = new Basket<>();
        Assertions.assertEquals(0, appleBasket.getAmount());
        assertThrows(BasketEmptyException.class, appleBasket::removeSomething);
    }
    @Test
    public void testBasketWithApplesAndMushrooms() {
        Basket<Item> appleBasket = new Basket<>();
        Apple newApple = new Apple();
        appleBasket.addSomething(newApple);
        assertEquals(1, appleBasket.getAmount());
        Mushroom sneakyMushroom = new Mushroom();
        assertThrows(RuntimeException.class, () -> appleBasket.addSomething(sneakyMushroom));
    }
}

