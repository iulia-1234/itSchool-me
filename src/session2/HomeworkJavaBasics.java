package session2;

import java.util.Scanner;

public class HomeworkJavaBasics {
    public static void main(String[] args) {
//  1. Simple Output Program: Write a program that prints your name, age, and favorite color on three separate lines.
        System.out.println("1. Simple Output Program: ");
        System.out.println("My name is Iulia.");
        System.out.println("My age is 35.");
        System.out.println("My favorite color is blue.");
        System.out.println();

//  2. Using Variables: Write a program that defines four different variables (an integer, a double, a character, and a string), assigns them values, and then prints them out.
        System.out.println("2. Using Variables: ");
        int numberInteger = 5;
        double numberDouble = 0.5;
        char character = 'A';
        String string = "text";
        System.out.println("integer: " + numberInteger);
        System.out.println("double: " + numberDouble);
        System.out.println("character: " + character);
        System.out.println("string: " + string);
        System.out.println();

//  3. Operations: Write a program that performs various operations (addition, subtraction, multiplication, division, and modulus) on two numbers. The numbers can be hard-coded into the program. Print the result of each operation.
        System.out.println("3. Operations: ");
        int x = 10;
        int y = 5;
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + x * y);
        System.out.println("x / y = " + x / y);
        System.out.println("x % y = " + x % y);
        System.out.println();

//  Go the extra mile
//  4. Simple Input/Output: Write a program that asks the user to enter two numbers, performs addition on those numbers, and prints out the result.
        System.out.println("4. Simple Input/Output:");
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        b = scanner.nextInt();
        System.out.println("Sum = " + (a + b));
    }
}