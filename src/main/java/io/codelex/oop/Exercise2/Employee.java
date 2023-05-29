package io.codelex.oop.Exercise2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee extends Person {
    private String position;
    private LocalDate startedWorking;
    private final String dateFormat = "dd.MM.yyyy";
    public Employee(String firstName, String lastName, String id, int age, String position, String hasBeenWorkingSince) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = LocalDate.parse(hasBeenWorkingSince, DateTimeFormatter.ofPattern(dateFormat));
    }
    public int getWorkExperience() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear() - startedWorking.getYear();
    }
    public String getInfo() {
        int hasBeenWorking = this.getWorkExperience();
        System.out.printf("%s %s %s (%d years)", firstName, lastName, position, hasBeenWorking);
        System.out.println();
        return firstName + lastName + position + hasBeenWorking;
    }
}
