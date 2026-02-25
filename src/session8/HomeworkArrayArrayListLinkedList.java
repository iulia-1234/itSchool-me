package session8;

import java.util.*;

public class HomeworkArrayArrayListLinkedList {
    public static void main(String[] args) {
//Challenge
//1. Create a shopping list with Array and print the values
        System.out.println("Exercise 1: ");
        String[] shoppingList = {"flour", "milk", "butter", "chocolate", "almonds"};
        System.out.println("Shopping List: " + Arrays.toString(shoppingList) + "\n");

//2. Create a wishlist for Christmas with ArrayList and print the values
        System.out.println("Exercise 2: ");
        ArrayList<String> christmasWishlist = new ArrayList<>(List.of("candy", "gingerbread", "cake"));
        System.out.println("Christmas Wishlist: " + Arrays.toString(christmasWishlist.toArray()) + "\n");

//3. Create
//2 empty ArrayLists: studentList and graduateStudentList
//populate studentList with 10 students
//copy values from studentList to graduateStudentList
//iterate through graduateStudentList and print each graduated student
        System.out.println("Exercise 3: ");
        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> graduateStudentList = new ArrayList<>();
        studentList.addAll(List.of("Ana", "Bogdan", "Cristina", "Dan", "Elena", "Florin", "Georgiana", "Horea", "Irina", "Jay"));
        graduateStudentList.addAll(studentList);
        for (String graduateStudent : graduateStudentList) {
            System.out.println("Student Name: " + graduateStudent);
        }
        System.out.println();

//4. Given an array of 10 integers, count how many of them are even numbers and how many are odd. Print out both counts.
        System.out.println("Exercise 4: ");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int evenNumbers = 0;
        int oddNumbers = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
        }
        System.out.println("Array of numbers: " + Arrays.toString(numbers));
        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Odd Numbers: " + oddNumbers + "\n");

//5. Create an ArrayList that stores city names. Add at least five city names initially. Then, prompt the user to add a city name. If the city name is already in the list, display a message saying it's a duplicate; otherwise, add it to the list.
        System.out.println("Exercise 5: ");
        ArrayList<String> cityNames = new ArrayList<>(List.of("Athens", "Bucharest", "Cairo", "Dublin", "Edinburgh"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a city name: ");
        String cityName = scanner.nextLine();
        if (cityNames.contains(cityName)) {
            System.out.println("The city name " + cityName + " is already in use.");
        } else {
            cityNames.add(cityName);
        }
        System.out.println("City Names: " + Arrays.toString(cityNames.toArray()) + "\n");

//6. Given a LinkedList storing student names, write a program that checks if a particular student name exists in the list. If it does, remove that name from the list.
        System.out.println("Exercise 6: ");
        LinkedList<String> students = new LinkedList<>(List.of("Ana", "Bogdan", "Cristina", "Dan", "Elena"));
        System.out.println("Initial Student List: " + Arrays.toString(students.toArray()));
        students.removeIf(student -> Objects.equals(student, "Ana"));
        System.out.println("Updated Student List: " + Arrays.toString(students.toArray()) + "\n");

//7. Create an ArrayList containing names of fruits. Implement a custom sorting mechanism to arrange them in descending order based on their length. If two fruits have the same length, sort them in alphabetical order.
        System.out.println("Exercise 7: ");
        ArrayList<String> fruitNames = new ArrayList<>(List.of("apple", "banana", "orange", "grape", "lemon", "kiwi"));
        System.out.println("Initial order: " + fruitNames);
        fruitNames.sort(Comparator.comparing(String::length));
        System.out.println("Sorted order: " + fruitNames + "\n");

//8. In an array of strings representing movie titles, implement a linear search method to find whether a given movie title exists. If it does, print out its position in the array.
        System.out.println("Exercise 8: ");
        String[] movieTitles = {"Apocalypse Now", "Batman Begins", "Casablanca", "Dune"};
        System.out.println("Enter a movie title: ");
        String movie = scanner.nextLine();
        boolean found = false;
        int index = 0;
        for (int i = 0; i < movieTitles.length; i++) {
            if (movieTitles[i].equals(movie)) {
                found = true;
                index = i;
            }
        }
        if (found) {
            System.out.println("The movie is in the array at index: " + index + "\n");
        } else {
            System.out.println("The movie is not in the array. \n");
        }

//9.Accept a string representation of a binary number, e.g., "1011". Convert this string into an Integer using the Integer wrapper class and the method that parses binary. Print out the decimal representation of this number.
        System.out.println("Exercise 9: ");
        String stringBinaryNumber = "1011";
        int binaryNumber = Integer.parseInt(stringBinaryNumber, 2);
        System.out.println("binary number 1011 is as decimal: " + binaryNumber);

//10. Write a program that manages a personal diary using an ArrayList. Each entry in the diary is a string that contains a date in the format "YYYY-MM-DD" followed by a colon and the diary entry for that day. Your program should allow the user to:
//Add a new entry (but ensure there's no duplicate date).
//Edit an existing entry based on the date.
//Delete an entry by date.
//Display all entries in reverse chronological order (latest first).
//Ensure that all these operations are efficient, especially the addition of new entries, which should keep the list sorted without resorting it every time.

    }
}
