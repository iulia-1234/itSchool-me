package session4;

public class JavaStatements {
    public static void main(String[] args) {
        int currentYear = 2025;
        int birthYear = 1995;
        int diffYears = currentYear - birthYear;
        if (diffYears < 18) {
            System.out.println("sunt minor");
        } else {
            System.out.println("nu sunt minor");
        }
        if (diffYears < 18) {
            System.out.println("sunt minor");
        } else if (diffYears > 70) {
            System.out.println(" oh no,.... winter is comming");
        } else {
            System.out.println(" sunt doar un adult");
        }
    }
}
