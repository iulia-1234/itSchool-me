package session7;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class HomeworkUtilityClasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        displayTodayDate();
        displayDateComponents(LocalDate.parse("2026-02-22"));
        createSpecificDate();
        areDatesEqual(scanner);
        isTodaySpecificDate();
        displayCurrentTime();
        addWeeksToToday(4);
        findDayOfWeek(scanner);
        daysBetween(scanner);
        isValidDate(scanner);
        elapsedTimeSince(scanner);
        convertToTimeZone(scanner);
    }
//    Challenge
//1. Displaying Today's Date
//Description: Write a method named displayTodayDate that, when called, prints the current date to the console.
//Expected Output: Today's date in the format YYYY-MM-DD.
    public static void displayTodayDate() {
        System.out.println("1. Displaying Today's Date:");
        System.out.println("Today's date: " + LocalDate.now() + "\n");
    }

//2. Date Decomposition
//Description: Write a method named displayDateComponents that accepts a date as an argument and prints its year, month, and day components separately.
//Input: A date in the format YYYY-MM-DD.
//Expected Output:
//makefile
//Copy code
//Year: YYYY
//Month: MM
//Day: DD
    public static void displayDateComponents(LocalDate date) {
        System.out.println("2. Date Decomposition");
        System.out.println("Year: " + date.getYear());
        System.out.println("Month: " + date.getMonthValue());
        System.out.println("Day: " + date.getDayOfMonth() + "\n");
    }

//3. Create a Specific Date
//Description: Write a method named createSpecificDate that returns a date object representing 19th August 2025.
//Expected Output: A date object for 2025-8-19.
    public static void createSpecificDate() {
        System.out.println("3. Create a Specific Date");
        LocalDate date = LocalDate.of(2025, 8, 19);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        System.out.println("Specific date: " + date.format(formatter) + "\n");
    }

//4. Comparing User-Entered Dates
//Description: Write a method named areDatesEqual that reads two dates from the console and returns true if they are equal, and false otherwise.
//Input: Two dates entered by the user in the format YYYY-MM-DD.
//Expected Output:
//true if both dates are equal.
//false if they are different.
    public static void areDatesEqual(Scanner scanner) {
        System.out.println("4. Comparing User-Entered Dates");
        System.out.println("Enter first date in format YYYY-MM-DD: ");
        String firstDate = scanner.nextLine();
        LocalDate firstLocalDate = LocalDate.parse(firstDate);
        System.out.println("Enter second date in format YYYY-MM-DD: ");
        String secondDate = scanner.nextLine();
        LocalDate secondLocalDate = LocalDate.parse(secondDate);
        System.out.println("Are dates equal: " + firstLocalDate.equals(secondLocalDate) + "\n");
    }

//5. Is Today a Specific Date?
//Description: Write a method named isTodaySpecificDate that checks if today's date is 10th December 2019.
//Expected Output:
//true if today's date is 2019-12-10.
//false otherwise.
    public static void isTodaySpecificDate() {
        System.out.println("5. Is Today a Specific Date?");
        LocalDate today = LocalDate.now();
        LocalDate specificDate = LocalDate.of(2019, 12, 10);
        System.out.println("Is today " + today + " the specific date " + specificDate + "? \n" + today.isEqual(specificDate) + "\n");
    }

//6. Getting Current Time
//Description: Write a method named displayCurrentTime that prints the current time to the console.
//Expected Output: The current time in the format HH:MM:SS.
    public static void displayCurrentTime() {
        System.out.println("6. Getting Current Time");
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Current Time - " + currentTime.format(formatter) + "\n");
    }

//7. Date Arithmetic
//Description: Write a method named addWeeksToToday that accepts an integer as its argument. This integer denotes the number of weeks. The method should add this number of weeks to today's date and return the resultant date.
//Input: An integer n (e.g., 4).
//Expected Output: A date object that is n weeks from today.
    public static void addWeeksToToday(int weeks) {
        System.out.println("7. Date Arithmetic");
        System.out.println("Today " + LocalDate.now() + " plus " + weeks + " weeks: " + LocalDate.now().plusWeeks(weeks) + "\n");
    }

//8. Weekday Identifier
//Description: Construct a method named findDayOfWeek that takes in a date and returns the specific day of the week (e.g., Monday, Tuesday, etc.) for that date.
//Input: A date in the format YYYY-MM-DD.
//Expected Output: The day of the week in string format (e.g., "Wednesday").
    public static void findDayOfWeek(Scanner scanner) {
        System.out.println("8. Weekday Identifier");
        System.out.println("Enter a date(YYYY-MM-DD): ");
        String date = scanner.nextLine();
        LocalDate localDate = LocalDate.parse(date);
        System.out.println("The day of the week: " + localDate.getDayOfWeek() + "\n");
    }

//9. Interval Between Dates
//Description: Design a method titled daysBetween that reads two dates from the console and computes the total number of days between them.
//Input: Two dates given by the user in the format YYYY-MM-DD.
//Expected Output: An integer showcasing the difference in days between the two dates.
    public static void daysBetween(Scanner scanner) {
        System.out.println("9. Interval Between Dates");
        System.out.println("Enter first date(YYYY-MM-DD): ");
        String firstDate  = scanner.nextLine();
        LocalDate firstLocalDate = LocalDate.parse(firstDate);
        System.out.println("Enter second date(year, month, day): ");
        String secondDate = scanner.nextLine();
        LocalDate secondLocalDate = LocalDate.parse(secondDate);
        System.out.println("The number of days between are: " + Math.abs(ChronoUnit.DAYS.between(firstLocalDate, secondLocalDate)) + "\n");
    }

//10. Date Authenticator
//Description: Engineer a method named isValidDate that captures a date string from the console and assesses if it conforms to a valid date format (YYYY-MM-DD). The method should also consider leap years when validating February dates.
//Input: A string of a date from the console.
//Expected Output:
//true if the input adheres to the date format and denotes a genuine date.
//false if otherwise.
    public static void isValidDate(Scanner scanner) {
        System.out.println("10. Date Authenticator");
        System.out.println("Enter a date(YYYY-MM-DD): ");
        String date = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            LocalDate.parse(date, formatter);
            System.out.println("Date is valid: " + true + "\n");
        } catch (DateTimeParseException e) {
            System.out.println("Date is valid: " + false + "\n");
        }
    }

//11. Duration Since
//Description: Construct a method dubbed elapsedTimeSince that ingests a prior time (in the HH:MM:SS format) as its input and displays the time duration from that moment to the present.
//Input: A time given in the format HH:MM:SS.
//Expected Output: The time span given as X hours, Y minutes, Z seconds.
    public static void elapsedTimeSince(Scanner scanner) {
        System.out.println("11. Duration Since");
        System.out.println("Enter a prior time(HH:MM:SS): ");
        String time = scanner.nextLine();
        LocalTime pastTime = LocalTime.parse(time);
        LocalTime now = LocalTime.now();
        Duration duration = Duration.between(pastTime, now);
        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;
        long seconds = duration.toSeconds() % 60;
        System.out.println("Elapsed time: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds \n");
    }

//12. Time Conversion Across Zones
//Description: Develop a method named convertToTimeZone that collects a date and time from the console in the pattern YYYY-MM-DD HH:MM:SS and a timezone (like "EST", "PST"). The objective is to transmute the specified date and time to align with the provided timezone and then showcase the result.
//Input:
//Date and time structured as YYYY-MM-DD HH:MM:SS.
//A string indicating the timezone (e.g., "EST").
//Expected Output: The recalibrated date and time synchronized with the inputted timezone.
    public static void convertToTimeZone(Scanner scanner) {
        System.out.println("12. Time Conversion Across Zones");
        System.out.println("Enter a target timezone (e.g., America/New_York): ");
        String timezone = scanner.nextLine();
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime sourceZoned = localDateTime.atZone(ZoneId.systemDefault());
        ZonedDateTime targetZoned = sourceZoned.withZoneSameInstant(ZoneId.of(timezone));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Date and time in the new timezone: " + targetZoned.format(formatter) + "\n");
    }

//Event Scheduler and Reminder
//Description:
//The Event Planner Corporation has hired you to create a Java application that manages event schedules and reminders. Clients of the Event Planner have busy schedules and need an automated system to help them organize their events and notify them of upcoming events.
//
//For this task, you're required to:
//Design classes that will help model and manage events.
//Use LocalDate and LocalDateTime for scheduling and timing purposes.
//
//Specifications:
//
//Event Class
//Attributes:
//eventName: A string containing the name of the event.
//eventDescription: A brief description of the event.
//eventDateTime: A LocalDateTime object that represents when the event will take place.
//reminderDateTime: A LocalDateTime object that indicates when the user should be reminded of the event.
//Methods:
//Constructors, getters, setters, etc.
//timeUntilEvent(): Returns the time remaining until the event.
//timeUntilReminder(): Returns the time left until the reminder should notify the user.
//    Challenge
//Event Scheduler and Reminder
//Scheduler Class
//Attributes:
//events: A list containing multiple events.
//Methods:
//addEvent(Event e): Adds an event to the list.
//removeEvent(String eventName): Removes an event by its name.
//getUpcomingEvents(int n): Returns the next n upcoming events.
//getEventsOn(LocalDate date): Returns all events scheduled for a specific date.
//getPendingReminders(): Returns all reminders that are due to notify the user soon (e.g., in the next 24 hours).
//
//Example:
//
//Input:
//
//
//
//
//Output (when querying for next reminders):
//    Challenge
//Event Scheduler and Reminder
//
//Hints:
//You will need to make use of LocalDate and LocalDateTime functionalities to compare times, determine the current time, and calculate durations.
//Think about how to structure your classes in an OOP manner to ensure clean code and clear relationships between classes.
//For extra complexity, consider adding a feature to handle recurring events (e.g., weekly or monthly).
}