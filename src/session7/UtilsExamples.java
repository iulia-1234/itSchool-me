package session7;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class UtilsExamples {

    public static void main(String[] args) {

//        localDateExamples();
//        localDateTimeExamples();
//        randomExamples();
//        mathExamples();
        durationExamples();
    }

    public static void localDateExamples() {

        LocalDate today = LocalDate.now();
        System.out.println("today is: " + today);

        LocalDate tenDays = today.plusDays(10);
        System.out.println("ten days from now: " + tenDays);

        System.out.println("2 months before: " + today.minusMonths(2));
        System.out.println("2 years before: " + today.minusYears(2));

//        String format = "2025-12-09";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yyyy");
//        LocalDate data = LocalDate.parse(format, formatter);
//        System.out.println(data);

    }

    public static void localDateTimeExamples() {

        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);
        System.out.println(today.plusHours(21));

//        String dateTimeString = "2025-12-09 19:57";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm");
//        LocalDateTime parsedDateTime = LocalDateTime.parse(today.toString(), formatter);
//        System.out.println(parsedDateTime);
        System.out.println(today.format(formatter));
        System.out.println(today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm")));

        LocalDateTime future = LocalDateTime.of(2025, 12, 9, 20, 5);
        String result = future.isBefore(today)? "before": "after";
        System.out.println("before or after: " + result);

        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

        System.out.println("utilDate: " + utilDate);
        System.out.println("sqlDate: " + sqlDate);

        Timestamp timestamp = new Timestamp(sqlDate.getTime());
        System.out.println("timestamp: " + timestamp);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH-mm-ss");
        String formatted = simpleDateFormat.format(utilDate);
        System.out.println(formatted);

    }

    public static void randomExamples() {

        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);

        double randomDouble = random.nextDouble();
        System.out.println(randomDouble);

        String[] names = {"Marcela", "Marcel", "Ion"};
        System.out.println(names[random.nextInt(names.length)]);

        System.out.println(random.nextBoolean());

    }

    public static void mathExamples() {

        int nr1 = 11;
        int nr2 = 13;

        System.out.println(Math.min(nr1, nr2));
        System.out.println(Math.max(nr1, nr2));
        System.out.println(Math.PI);

    }

    public static void durationExamples() {

        LocalDateTime time1 = LocalDateTime.now();
        LocalDateTime time2 = time1.plusDays(1).plusHours(5).plusMinutes(78612);
        Duration duration = Duration.between(time1,time2);
        System.out.println(duration);
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());

    }

}
