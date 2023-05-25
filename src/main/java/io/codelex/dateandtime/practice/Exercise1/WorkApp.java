package io.codelex.dateandtime.practice.Exercise1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class WorkApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the start date (dd.mm.yyyy): ");
        String startDateString = input.nextLine();
        LocalDate startDate = LocalDate.parse(startDateString, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        System.out.println("Enter the end date (dd.mm.yyyy): ");
        String endDateString = input.nextLine();
        LocalDate endDate = LocalDate.parse(endDateString, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        int workDays = 0;
        LocalDate date = startDate;
        while (!date.isAfter(endDate)) {
            if (date.getDayOfWeek() != DayOfWeek.SATURDAY && date.getDayOfWeek() != DayOfWeek.SUNDAY) {
                workDays++;
            }
            date = date.plusDays(1);
        }
        int workHours = workDays * 8;

        System.out.printf("Total working hours between %s and %s: %d.", startDate, endDate, workHours);
    }
}

