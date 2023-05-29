package io.codelex.oop.Exercise78Computers;

public class ComputerTest {
    public static void main(String[] args) {
        Laptop dell = new Laptop("i5-5300", "Intel integrated", "8GB", "CODELEX", "v1", "B-199");
        Laptop dell2 = new Laptop("i7-7700", "Intel integrated", "8GB", "CODELEX", "v1", "B-199");
        System.out.println("Testing toString: ");
        System.out.println(dell);
        System.out.println("Testing getters: ");
        dell.getCPU();
        dell.getBattery();
        dell.getCompany();
        System.out.println("Testing setters:");
        dell.setCPU("i7-7700");
        dell.getCPU();
        System.out.println("Testing equals: ");
        System.out.println(dell.equals(dell2));
    }
}
