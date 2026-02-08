package session5;

import java.util.Scanner;
import static java.lang.System.out;

public class SwitchStatement {
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static void main(String[] args) {
        printDayOfWeek();
        printDayOfWeekSimpleEdition();
        printGrade();
    }
    private static void printDayOfWeek() {
        Scanner input = new Scanner(System.in);
        out.println("Introdu ziua");
        String day = input.nextLine();
        switch (day) {
            case "Monday":
                out.println("today is Monday");
                break;
            case "Tuesday":
                out.println("today is Tuesday");
                break;
            case "Wednesday":
                out.println("today is Wednesday");
                break;
            case "Thursday":
                out.println("today is Thursday");
                break;
            case "Friday":
                out.println("today is Friday");
                break;
            default:
                out.println("weekend");
        }
    }
    public static void printDayOfWeekSimpleEdition() {
        Scanner input = new Scanner(System.in);
        out.println("Inserati 1-5 numarul zilei");
        int day = input.nextInt();
        switch (day) {
            case MONDAY -> System.out.println("today is Monday");
            case TUESDAY -> System.out.println("today is Tuesday");
            case WEDNESDAY -> System.out.println("today is Wednesday");
            case THURSDAY -> System.out.println("today is Thursday");
            case FRIDAY -> {
                System.out.println("today is Friday");
                System.out.println("is it?");
            }
            default -> System.out.println("weekend");
        }
    }
    private static void printGrade() {
        Scanner input = new Scanner(System.in);
        out.println("Inserati o nota de la A la D");
        char grade = input.nextLine().toUpperCase().charAt(0);
        switch (grade) {
            case 'A' -> out.println("bravo");
            case 'B' -> out.println("almost");
            case 'C' -> out.println("not good");
            case 'D' -> out.println("bad");
            default -> out.println("eroare la citire");
        }
    }
}
