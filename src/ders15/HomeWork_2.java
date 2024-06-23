package ders15;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;


public class HomeWork_2 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2024, 6, 13);
        LocalDate date2 = LocalDate.of(2023, 6, 13);

        if (date1.isBefore(date2)) {
            System.out.println(date1 + " comes before " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " comes after " + date2);
        } else {
            System.out.println(date1 + " is equal to " + date2);
        }
        //////////////////////////////////////
        LocalDateTime localDateTime = LocalDateTime.now();
        Date date = (Date) Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("Converted Date: " + date);
        //////////////////////////////////////
        LocalDate currentData = LocalDate.now();
        LocalDate nextSunday = currentData.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println("Next Sunday: " + nextSunday);
        //////////////////////////////////////
        long daysBetween = ChronoUnit.DAYS.between(date2, date1);
        System.out.println("Days between: " + daysBetween);
        //////////////////////////////////////
        Date newDate = new Date();
        LocalDateTime localDateTime2 = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("Converted LocalDateTime: " + localDateTime2);
        /////////////////////////////////////
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = localDateTimeNow.format(formatter);
        System.out.println("Formatted LocalDateTime: " + formattedDateTime);
        /////////////////////////////////////
        String dateTimeString = "2024-06-13 14:30:00";
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime3 = LocalDateTime.parse(dateTimeString, timeFormatter);
        System.out.println("Parsed LocalDateTime: " + localDateTime3);
        /////////////////////////////////////
        LocalTime startTime = LocalTime.of(9, 0);
        LocalTime endTime = LocalTime.of(10, 30);
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Meeting duration: " + duration.toHours() + " hours and " + duration.toMinutesPart() + " minutes");
        ////////////////////////////////////
        int year = 2024;
        LocalDate givenDate = LocalDate.of(year, 1, 1);
        boolean isLeapYear = givenDate.isLeapYear();
        System.out.println("Is " + year + " a leap year? " + isLeapYear);
        ////////////////////////////////////
        java.sql.Date sqlDate = java.sql.Date.valueOf("2024-06-13");
        LocalDate localDate = sqlDate.toLocalDate();
        System.out.println("Converted LocalDate: " + localDate);
    }
}
