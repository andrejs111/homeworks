package io.codelex.dateandtime.practice.Exercise3;

import java.time.LocalDate;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        LocalDate firstStart = LocalDate.of(2022, 1, 1);
        LocalDate firstEnd = LocalDate.of(2022, 1, 15);
        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);
        DatePeriod.checkPeriod(firstPeriod);

        LocalDate secondStart = LocalDate.of(2022, 1, 10);
        LocalDate secondEnd = LocalDate.of(2022, 1, 25);
        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

        System.out.println(firstPeriod.intersection(secondPeriod));
    }
}
