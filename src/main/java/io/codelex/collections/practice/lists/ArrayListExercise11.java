package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements

        //TODO: Add 10 values to list

        //TODO: Add new value at 5th position

        //TODO: Change value at last position (Calculate last position programmatically)

        //TODO: Sort your list in alphabetical order

        //TODO: Check if your list contains "Foobar" element

        //TODO: Print each element of list using loop

        ArrayList<String> objects = new ArrayList<>();
        objects.add("Chair");
        objects.add("Pencil");
        objects.add("Rug");
        objects.add("Mug");
        objects.add("Keyboard");
        objects.add("PC");
        objects.add("Window");
        objects.add("Car");
        objects.add("Table");
        objects.add("Brush");

        objects.set(4, "Mouse");
        objects.set(objects.size() - 1, "Eraser");
        Collections.sort(objects);
        if (objects.contains("Foobar")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        for (int i = 0; i < objects.size(); i++) {
            System.out.println(objects.get(i));
        }

    }

}
