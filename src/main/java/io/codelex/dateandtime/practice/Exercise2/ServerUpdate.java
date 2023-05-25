package io.codelex.dateandtime.practice.Exercise2;
import static io.codelex.dateandtime.practice.Exercise2.FindUpdateDate.findUpdateDates;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;


public class ServerUpdate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the launch date (dd.MM.yyyy): ");
        String launchDateString = input.nextLine();
        LocalDate launchDate = LocalDate.parse(launchDateString, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        System.out.println("Enter the month when to update (MM.yyyy): ");
        String desiredMonthString = input.nextLine();
        YearMonth desiredMonth = YearMonth.parse(desiredMonthString, DateTimeFormatter.ofPattern("MM.yyyy"));

        List<LocalDate> updateDates = findUpdateDates(launchDate, desiredMonth);

        System.out.println("Update dates for " + desiredMonth.getMonth().toString() + " " + desiredMonth.getYear() + ":");
        for (LocalDate updateDate : updateDates) {
            System.out.println(updateDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        }
    }
}