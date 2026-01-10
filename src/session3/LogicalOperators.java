package session3;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean isPresent = true;
        boolean isRegistered = false;
        System.out.println("isPresent = " + isPresent);
        System.out.println("isRegistered = " + isRegistered);
        System.out.println("!isPresent = " + !isPresent);
        System.out.println("!isRegistered = " + !isRegistered);

        int a = 10;
        int b = 20;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a > b);
        System.out.println(a < b);

        if (a < b) {
            System.out.println("a este mai mic decat b");
        }

        if (a <= b) {
            System.out.println("a este mai mic sau egal decat b");
        } else {
            System.out.println("a este mai mare decat b");
        }

        if (a > b) {
            System.out.println("a este mai mare decat b");
        } else if (a == b) {
            System.out.println("a este egal cu b");
        } else {
            System.out.println("a este mai mic decat b");
        }

        int x;
        x = (a < b)? 1 : 2;
        System.out.println("x = " + x);

        int y;
        y = (a == b)? 1 : 2;
        System.out.println("y = " + y);

        boolean w;
        w = (x < y)? true : false;
        System.out.println(w);
    }
}
