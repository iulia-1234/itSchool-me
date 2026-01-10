package session2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello to Java!");

        int age = 29;
        short age2 = 30;
        long number = 22200000000L;
        double weight = 115.0d;
        float weightFloat = 115.5f;
        boolean alive = true;
        char litera = 'A';
        byte something = 0;

        System.out.println("Varsta mea este: " + age);
        System.out.println("Alta varsta (short): " + age2);
        System.out.println("Un numar foarte mare (long): " + number);
        System.out.println("Greutate (double): " + weight);
        System.out.println("Greutate mai exacta (float): " + weightFloat);
        System.out.println("Sunt in viata? " + alive);
        System.out.println("Prima litera din alfabet: " + litera);
        System.out.println("Valoare byte: " + something);

        String name = "Rolland";
        System.out.println("Ma numesc: " + name);

        int numar1 = 10;
        int numar2 = 5;

        int sum = numar1 + numar2;
        int dif = numar1 - numar2;
        int mul = numar1 * numar2;
        int div = numar1 / numar2;

        System.out.println("Adunare: " + sum);
        System.out.println("Adunare directa: " + (numar1 + numar2));
        System.out.println("Scadere: " + dif);
        System.out.println("Inmultire: " + mul);
        System.out.println("Impartire: " + div);

    }
}