package io.codelex.dateandtime.practice.Exercise2;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class FindUpdateDate {
    public static List<LocalDate> findUpdateDates(LocalDate launchDate, YearMonth desiredMonth) {
        List<LocalDate> updateDates = new ArrayList<>();                                                  // list to store update dates

        LocalDate currentDate = launchDate.plusDays(14);
        while (currentDate.getMonth() != desiredMonth.getMonth() || currentDate.getYear() != desiredMonth.getYear()) {       // keeps adding days until needed month is reached
            currentDate = currentDate.plusDays(14);
        }
        while (currentDate.getMonth() == desiredMonth.getMonth()) {
            updateDates.add(currentDate);
            currentDate = currentDate.plusDays(14);
        }
        return updateDates;
    }
}
