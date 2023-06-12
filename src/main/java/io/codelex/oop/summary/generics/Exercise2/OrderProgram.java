package io.codelex.oop.summary.generics.Exercise2;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderProgram {
    public static void main(String[] args){
        ElectronicsItem tv = new ElectronicsItem("Sony", BigDecimal.valueOf(999.99), "110W");
        HouseholdItem soap = new HouseholdItem("JustSoap", BigDecimal.valueOf(0.99), "white");
        FoodItem milk = new FoodItem("2% Milk", BigDecimal.valueOf(0.83), 15, 6, 2023);
        FoodItem bread = new FoodItem("Rye bread", BigDecimal.valueOf(1.53), 24, 6, 2023);
        ItemPacking itemPacking = new ItemPacking();

        ArrayList<SellableThing> newList = new ArrayList<>(List.of(tv, soap, milk, bread, itemPacking));
        Order newOrder = new Order(newList);
        Invoice newInvoice = new Invoice("INV123", newOrder);
        newInvoice.send();
        System.out.println(newInvoice.printOrder());

        // testing empty order
        ArrayList<SellableThing> secondList = new ArrayList<>();
        Order secondOrder = new Order(secondList);

        // testing expiration dates
        ArrayList<SellableThing> badFoodList = new ArrayList<>();
        FoodItem badMilk = new FoodItem("2% Milk", BigDecimal.valueOf(0.99), 11, 6, 2023);
        badFoodList.add(badMilk);
        Order badFoodOrder = new Order(badFoodList);

    }
}
