package session3;

public class CastingExamples {
    public static void main(String[] args) {

        float floatVal = 1.0F;
        double doubleVal = 4.0;
        byte byteVal = 7;
        short shortVal = 7;
        int intVal = 7;
        long longVal = 10;
        long longVal2 = 1234567891234567891L;

        short rez1 = byteVal;
        System.out.println(rez1);
        short rez2 = (short) longVal;
        System.out.println(rez2);
        short rez3 = (short) longVal2;
        System.out.println(rez3);
        int rez4 = (int) floatVal;
        System.out.println(rez4);
        float rez5 = longVal - floatVal;
        System.out.println(rez5);

        intVal = Integer.MAX_VALUE;
        System.out.println(intVal);
        intVal = Integer.MIN_VALUE;
        System.out.println(intVal);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        System.out.println(10 % 3);
        System.out.println(16 % 5);
    }
}
