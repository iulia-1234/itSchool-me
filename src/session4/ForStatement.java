package session4;

public class ForStatement {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++ ) {
            System.out.println(i);
        }

        for (int i = 0; i <= 10; i = i + 2 ) {
            System.out.println(i);
        }

        int[] sir = {1, 2, 3, 4, 5, 10, 2};
        for (int i = 0; i < sir.length; i++ ) {
            System.out.println(sir[i]);
        }

        System.out.println(sir[5]);

        for (int number : sir) {
            System.out.println(number);
        }
    }
}
