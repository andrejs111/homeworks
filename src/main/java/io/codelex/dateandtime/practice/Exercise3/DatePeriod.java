package io.codelex.dateandtime.practice.Exercise3;

import java.time.LocalDate;
import java.time.Period;

public class DatePeriod {
    private LocalDate start;
    private LocalDate end;
    private boolean valid;

    public DatePeriod(LocalDate start, LocalDate end) {
            this.start = start;
            this.end = end;
    }
    public static void checkPeriod(DatePeriod datePeriod) {
        if (datePeriod.getStart().isBefore(datePeriod.getEnd())) {
            datePeriod.setValid(true);
        } else {
            datePeriod.setValid(false);
        }
    }
    public DatePeriod intersection(DatePeriod other) {
        checkPeriod(this);
        checkPeriod(other);
        if (this.valid && other.valid) {
            LocalDate intersectionStart = start.isAfter(other.start) ? start : other.start;
            LocalDate intersectionEnd = end.isBefore(other.end) ? end : other.end;
            return new DatePeriod(intersectionStart, intersectionEnd);
        } else {
            System.out.println("One or both periods are not valid.");
        }
        return null;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public boolean isValid() {
        return valid;
    }

    @Override
    public String toString() {
        return "DatePeriod{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}