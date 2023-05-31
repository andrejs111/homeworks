package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        List<String> arrayAsList = Arrays.asList(array);
        System.out.println(arrayAsList);

        Set<String> arrayAsSet = new HashSet<>(arrayAsList);
        System.out.println(arrayAsSet);

        HashMap<String, String> cars = new HashMap<String, String>();
        cars.put("Audi", "Germany");
        cars.put("BMW", "Germany");
        cars.put("Honda", "Japan");
        cars.put("Mercedes", "Germany");
        cars.put("Volkswagen", "Germany");
        cars.put("Tesla", "USA");

        System.out.println(cars);

        //todo - replace array with an ArrayList and print out the results

        //todo - replace array with a HashSet and print out the results

        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
    }
}
