package io.codelex.collections.practice.phonebook;

public class PhoneTest {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.putNumber("Mark", "184 897 347");
        phoneDirectory.putNumber("John", "+387 9948 00");
        System.out.println("Mark: " + phoneDirectory.getNumber("Mark"));
        System.out.println("John: " + phoneDirectory.getNumber("John"));
        System.out.println("Andris: " + phoneDirectory.getNumber("Andris"));
    }
}
