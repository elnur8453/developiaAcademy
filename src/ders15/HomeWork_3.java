package ders15;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class HomeWork_3 {
    public static void main(String[] args) {
        // Task_2
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy HH:mm:ss a");
        String formattedDate = now.format(formatter);
        System.out.println(formattedDate);
        // Task_3
        LocalDate birthDate = LocalDate.of(2003, 6, 15);
        LocalDate currentDate = LocalDate.now();
        int age = calculateAge(birthDate, currentDate);
        System.out.println("Age: " + age);
        // Task_4
        LocalDate startDate = LocalDate.of(2023, 6, 1);
        LocalDate endDate = LocalDate.of(2023, 6, 30);
        long weekdays = countWeekdays(startDate, endDate);
        System.out.println("Number of weekdays: " + weekdays);
        // Task_5
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime convertedTime = convertTimeZone(localDateTime, "America/New_York", "Europe/London");
        System.out.println("Converted time: " + convertedTime);
        // Task_7
        LocalDate date = LocalDate.of(2023, 6, 15);
        LocalDate start = LocalDate.of(2023, 6, 1);
        LocalDate end = LocalDate.of(2023, 6, 30);
        boolean withinRange = isWithinRange(date, startDate, endDate);
        System.out.println("Is within range: " + withinRange);
        // Task_8
        LocalDateTime pastTime = LocalDateTime.now().minusHours(5);
        String timeAgo = formatTimeAgo(pastTime);
        System.out.println("Time ago: " + timeAgo);
        // Task_10
        LocalTime countdownTime = LocalTime.of(0, 0, 5);
        startCountdown(countdownTime);
    }
    // Task_3
    public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if (birthDate != null && currentDate != null) {
            return Period.between(birthDate, currentDate).getYears();
        }
        return 0;
    }
    // Task_4
    public static int countWeekdays(LocalDate start, LocalDate end) {
        int weekdays = 0;
        for (LocalDate date = start; !date.isAfter(end); date = date.plusDays(1)) {
            DayOfWeek day = date.getDayOfWeek();
            if (day != DayOfWeek.SATURDAY && day != DayOfWeek.SUNDAY) {
                weekdays++;
            }
        }
        return weekdays;
    }
    // Task_5
    public static ZonedDateTime convertTimeZone(LocalDateTime localDateTime, String fromZone, String toZone) {
        ZoneId fromZoneId = ZoneId.of(fromZone);
        ZoneId toZoneId = ZoneId.of(toZone);
        ZonedDateTime fromZonedDateTime = ZonedDateTime.of(localDateTime, fromZoneId);
        return fromZonedDateTime.withZoneSameInstant(toZoneId);
    }
    // Task_7
    public static boolean isWithinRange(LocalDate date, LocalDate startDate, LocalDate endDate) {
        return (date.isEqual(startDate) || date.isAfter(startDate)) && (date.isEqual(endDate) || date.isBefore(endDate));
    }
    // Task_8
    public static String formatTimeAgo(LocalDateTime pastTime) {
        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(pastTime, now);

        if (duration.toMinutes() < 1) {
            return "just now";
        } else if (duration.toHours() < 1) {
            long minutes = duration.toMinutes();
            return minutes + " minute" + (minutes > 1 ? "s" : "") + " ago";
        } else if (duration.toDays() < 1) {
            long hours = duration.toHours();
            return hours + " hour" + (hours > 1 ? "s" : "") + " ago";
        } else {
            long days = duration.toDays();
            return days + " day" + (days > 1 ? "s" : "") + " ago";
        }
    }
    // Task_10
    public static void startCountdown(LocalTime countdownTime) {
        Duration duration = Duration.between(LocalTime.MIN, countdownTime);

        while (!duration.isZero()) {
            System.out.println("Time left: " + duration);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            duration = duration.minusSeconds(1);
        }
        System.out.println("Countdown finished!");
    }
}
