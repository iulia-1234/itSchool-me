package session5;

import java.util.Scanner;

public class HomeworkAdvancedFlowControl {
    public static void main(String[] args) {
//1. Even or Odd Checker
//Write a Java program that takes an integer as input. If the number is even, print "Even". If it's odd, print "Odd".
        System.out.println("1. Even or Odd Checker");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int evenOrOdd = input.nextInt();
        if (evenOrOdd % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        System.out.println();

//2. Month Name Finder
//Write a program that asks the user to enter a number between 1 and 12. Print the name of the corresponding month or "Invalid Month" if out of range.
        System.out.println("2. Month Name Finder");
        System.out.println("Enter a number between 1 and 12");
        int month = input.nextInt();
        switch (month) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default ->  System.out.println("Invalid Month");
        }
        System.out.println();

//3. Counting Negative Numbers
//Given an array of integers, write a program to count and print the number of negative integers in the array.
        System.out.println("3. Counting Negative Numbers");
        int[] negativeNumbersArray = {1, 3, -2, -4, -6};
        int negativeNumbersCounter = 0;
        for (int number : negativeNumbersArray) {
            if (number < 0) {
                negativeNumbersCounter++;
            }
        }
        System.out.println("The number of negative numbers in the array is: " + negativeNumbersCounter);
        System.out.println();

//4. String Reverser
//Ask the user to enter a string. Print the reversed version of this string.
        System.out.println("4. String Reverser");
        input.nextLine();
        System.out.println("Enter a string value: ");
        String originalString = input.nextLine();
        StringBuilder reversedString = new StringBuilder();
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString.append(originalString.charAt(i));
        }
        System.out.println("reversed string: " + reversedString);
        System.out.println();

//5. Fibonacci Series Generator
//Write a program that generates and prints the first n numbers of the Fibonacci series, where n is provided by the user.
        System.out.println("5. Fibonacci Series Generator");
        System.out.println("Enter a value for n to print the n number of the Fibonacci series");
        int numberOfFibonacciSeries = input.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;
        for (int i = 1; i <= numberOfFibonacciSeries; i++) {
            System.out.println(firstNumber + " ");
            int sumForFibonacci = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sumForFibonacci;
        }
        System.out.println();

//6. While Loop
//Write a program that asks the user to enter numbers. The program should continue prompting the user until they enter -1. After they enter -1, print the sum of all numbers entered (excluding -1).
        System.out.println("6. While Loop");
        int numberToAdd = 0;
        int sum = 0;
        while (numberToAdd != -1) {
            System.out.println("Enter a number: ");
            numberToAdd = input.nextInt();
            if (numberToAdd == -1) {
                break;
            } else {
                sum += numberToAdd;
            }
        }
        System.out.println("The sum is " + sum);
        System.out.println();

//7. Do-While Loop
//Create a program where the user is prompted to guess a predefined number. After each guess, the program should inform the user if the guess is too high or too low. The program should keep prompting the user until they guess correctly. Using a do-while loop, ensure the user is always asked at least once.
        System.out.println("7. Do-While Loop");
        int numberToGuess = 5;
        int guess;
        do {
            System.out.println("Guess the predefined number between 1-10:");
            guess = input.nextInt();
            if (guess > 10 || guess < 1) {
                System.out.println("Invalid guess!");
            }
        } while (guess != numberToGuess);
        System.out.println("Correct guess!");
        System.out.println();

//8. For Loop
//Write a program that prints the first 10 numbers in the Fibonacci series. Use a for loop to accomplish this.
        System.out.println("8. For Loop");
        int firstFibonacciNumber = 0;
        int secondFibonacciNumber = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number " + i + " of Fibonacci series: " + firstFibonacciNumber + " ");
            int next = firstFibonacciNumber + secondFibonacciNumber;
            firstFibonacciNumber = secondFibonacciNumber;
            secondFibonacciNumber = next;
        }
        System.out.println();

//9. For-Each Loop
//Given an array of integers, write a program that prints each number in the array followed by "Even" if the number is even, or "Odd" if the number is odd. Utilize a for-each loop for this task.
        System.out.println("9. For-Each Loop");
        int[] allNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int number : allNumbers) {
            if (number % 2 == 0) {
                System.out.println(number + " - even");
            } else {
                System.out.println(number + " - odd");
            }
        }
        System.out.println();

//10. Jump Statements
//Create a menu-driven program where the user is presented with options:
//Print "Hello World"
//Print the user's name.
//Exit.
//Based on the user's input, perform the necessary action. Once an action is completed, show the menu again, unless the user chooses the Exit option. Use jump statements to control the flow of the program.
        System.out.println("10. Jump Statements");
        input.nextLine();
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println();
        String action;
        do {
            System.out.println("You have the following options: ");
            System.out.println("Print Hello World");
            System.out.println("Print name");
            System.out.println("Exit \n");
            System.out.println("What action do you choose?");
            action = input.nextLine();
            if (action.equals("Print Hello World")) {
                System.out.println("Hello World \n");
            } else if (action.equals("Print name")) {
                System.out.println("Your Name: " + name + "\n");
            } else if (action.equals("Exit")) {
                break;
            } else {
                System.out.println("Invalid action \n");
            }
        } while (!action.equals("Exit"));
        System.out.println();

//11. Break Statement
//Write a program that prompts the user to enter numbers. Calculate the average of these numbers. If the user enters 0, break out of the input loop and then print the average of the numbers entered so far.
        System.out.println("11. Break Statement");
        int numberForAverage;
        double sumForAverage = 0;
        double average = 0;
        int count = 1;
        do {
            System.out.println("Enter a number: ");
            numberForAverage = input.nextInt();
            sumForAverage += numberForAverage;
            if (numberForAverage == 0) {
                break;
            } else {
                average = sumForAverage / count;
                count++;
            }
        } while (numberForAverage != 0);
        System.out.println("The average is " + average);
        System.out.println();

//12. Continue Statement
//Create a program that asks the user for 10 numbers. Print the sum of all numbers that are greater than 5. If the user enters a number less than or equal to 5, use the continue statement to skip the addition for that number.
        System.out.println("12. Continue Statement");
        int sumOfNumbersGreaterThanFive = 0;
        int numberForContinueStatement;
        System.out.println("Enter 10 numbers: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number " + i + ": ");
            numberForContinueStatement = input.nextInt();
            if (numberForContinueStatement <= 5) {
                continue;
            } else {
                sumOfNumbersGreaterThanFive += numberForContinueStatement;
            }
        }
        System.out.println("The sum of numbers greater than 5 is: " + sumOfNumbersGreaterThanFive);
        System.out.println();

//13. Pathfinding in a Maze
//Consider a simple maze represented by a 2D grid. The maze consists of open cells, walls, a start, and an end. You have to find a path from the start to the end, moving only up, down, left, or right. You can't move diagonally. If a path exists, print it; otherwise, inform the user that there's no solution.
//The maze will be represented by a 2D array where:
//0 represents an open cell.
//1 represents a wall.
//S represents the start.
//E represents the end.

//Example:
//S 1 0 1
//0 1 0 1
//0 1 0 1
//1 0 0 E

//Problem Tasks:
//Read the maze layout from a file or hard-code it into your program.
//Implement a pathfinding algorithm to navigate from the start to the end.
//If a path is found, print the maze with the path. You can represent the path with a *.
//If no path exists, print "No solution found."

//Hints:
//Consider using a Depth-First Search (DFS) or Breadth-First Search (BFS) algorithm for pathfinding.
//You might want to represent the maze using a class with methods to detect neighbors, check for walls, etc.

    }
}