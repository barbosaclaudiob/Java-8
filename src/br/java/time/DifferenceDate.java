package br.java.time;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import javax.sound.midi.Soundbank;

public class DifferenceDate {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate anyDate = LocalDate.of(1988, Month.OCTOBER, 19);

        long differenceDays = ChronoUnit.DAYS.between(today, anyDate);
        long differenceWeeks = ChronoUnit.WEEKS.between(today, anyDate);
        long differenceYears = ChronoUnit.YEARS.between(today, anyDate);
       
        System.out.println("THE DIFFERENCE BETWEEN DAYS............" + differenceDays);
        System.out.println("THE DIFFERENCE BETWEEN WEEKS............" + differenceWeeks);
        System.out.println("THE DIFFERENCE BETWEEN YEARS............" + differenceYears);
        
    }
}
