package session8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayExamples {
    public static void main(String[] args) {

//        arrayExample1();
//        arrayExample2();
//        arrayListExample1();
        linkedListExample1();

    }

    public static void arrayExample1() {

        String[] friends = {"Marcel", "Marcela", "Maria", "Marius"};
        System.out.println(friends[2]);
        System.out.println(friends.length);
        friends[2] = "Andrei";
        System.out.println(friends[2]);
        System.out.println(Arrays.toString(friends));

    }

    public static void arrayExample2() {

        int[] numbers = {12, 3, 5, 1231, 2503};
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 12));
        System.out.println(numbers[2]);
        int[] numbers2 = Arrays.copyOfRange(numbers, 2, 3);
        System.out.println(Arrays.toString(numbers2));

    }

    public static void arrayListExample1() {

        List<String> friends = new ArrayList<>(Arrays.asList("Marcel", "Marcela", "Ronaldo"));
        ArrayList<String> friends2 = new ArrayList<>();

//        friends = List.of("Marcel", "Marcela", "Ronaldo");
        System.out.println(friends.get(2));
        System.out.println(friends.size());
        friends.add(3, "Messi the goat");
        System.out.println(friends.get(3));
        friends.add("Maria");
        System.out.println(friends.get(4));
        friends.addFirst("Marius");
        System.out.println(friends);
        friends.set(4, "Messi");
        System.out.println(friends);

    }

    public static void linkedListExample1() {

        List<String> linked = new LinkedList<>();
        linked.add("Marcel");
        linked.add("Marcela");
        linked.add("Marius");

        System.out.println(linked.get(2));

        linked.add(1, "Maria");
        System.out.println(linked);

        linked.remove(0);
        System.out.println(linked);

    }

    public static void comparatii() {

        int size = 5000;
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            String value = String.valueOf(i);
            arrayList.add(value);
            linkedList.add(value);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arrayList.get(size / 2);
        }

        long stop = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {

        }
    }
}
