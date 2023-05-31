package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> nameSet = new HashSet<>();

        while (true) {
            System.out.print("Enter name: ");
            String name = sc.nextLine().trim();
            if (name.isEmpty()) {
                break;
            }
            nameSet.add(name);
        }
        System.out.println("Unique name list contains: " + nameSet);
    }
}
