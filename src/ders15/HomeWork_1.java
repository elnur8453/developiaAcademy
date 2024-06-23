package ders15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class HomeWork_1 {
    public static <DataTimeFormatter> void main(String[] args) {
        Date currentDate = new Date();
        System.out.println("Current Date: " + currentDate);
        ////////////////////////////
        java.sql.Date sqlDate = new java.sql.Date(currentDate.getTime());
        System.out.println("SQL Date: " + sqlDate);
        ////////////////////////////
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        ////////////////////////////
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);
        ////////////////////////////
        String formattedTime = currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("Formatted time: " + formattedTime);
        ////////////////////////////
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local DateTime: " + localDateTime);
        ////////////////////////////
        String dateString = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Date String: " + dateString);
        ////////////////////////////
        String timeString = currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("Time String: " + timeString);
        ////////////////////////////
        LocalDate newDate = localDate.plusDays(5);
        System.out.println("New Date: " + newDate);
        ////////////////////////////
        LocalTime newTime = currentTime.minusHours(5);
        System.out.println("New Time: " + newTime);
    }
}
