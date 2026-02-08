package session5;

public class FlowControl {
    public static void main(String[] args) {
        int valoare = 5;
        printNumbersWhileDo(valoare);
        printNumbersDoWhile(valoare);
        printNumbersFor(valoare);
        int[] array = {1, 2, 3, 4, 5};
        printNumbersForEach(array);
        int[][] biarray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printListOfList(biarray);
        printUntilValue(valoare);
    }
    private static void printNumbersWhileDo(int number) {
        while (number <= 10) {
            System.out.println(number);
            number++;
        }
    }
    private static void printNumbersDoWhile(int number) {
        do {
            System.out.println(number);
            number++;
        } while (number <= 10);
    }
    private static void printNumbersFor(int number) {
        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }
    }
    private static void printNumbersForEach(int[] array) {
        for (int number : array) {
            System.out.println(number);
        }
    }
    private static void printListOfList(int[][] biarray) {
        for (int[] array : biarray) {
            for (int number : array) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
    private static void printUntilValue(int value) {
        for (int i = 0; i <= value; i++) {
            if (i == value) {
                break;
            }
            if (i == 2) {
                continue;
            }
            System.out.println("numar until value" + i);
        }
    }
}
