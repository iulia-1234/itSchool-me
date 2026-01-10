package session3;

import java.util.Scanner;

public class HomeworkJavaOperators {
    public static void main(String[] args) {
//Binary Arithmetic Operators:
//Write a Java program to take two numbers as input and display the result of addition, subtraction, multiplication, division, and modulus.
        System.out.println("Binary Arithmetic Operators - First Exercise:");
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        b = scanner.nextInt();
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        System.out.println();

//Write a program that calculates the area of a rectangle. Take the length and breadth as inputs.
        System.out.println("Binary Arithmetic Operators - Second Exercise:");
        int length;
        int breadth;
        System.out.println("Enter the length of the rectangle: ");
        length = scanner.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        breadth = scanner.nextInt();
        System.out.println("Area of the rectangle: " + (length * breadth));
        System.out.println();

//Unary Operators:
//Create a Java program where you increment and decrement the same variable. Display the value of the variable after each operation.
        System.out.println("Unary Operators - First Exercise:");
        int x = scanner.nextInt();
        System.out.println("x: " + x);
        x++;
        System.out.println("x++: " + x);
        x--;
        System.out.println("x--: " + x);
        System.out.println();

//Write a program that reverses the sign of an entered integer using unary minus operator.
        System.out.println("Unary Operators - Second Exercise:");
        int y = scanner.nextInt();
        System.out.println("y: " + y);
        y = -y;
        System.out.println("reversed sign of y: " + y);
        System.out.println();

//Logical Complement and Negation Operators:
//Write a program to check if a number is positive or negative using logical complement operator.
        System.out.println("Logical Complement and Negation Operators - First Exercise:");
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (!(number < 0)) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
        System.out.println();

//Write a Java program that takes two boolean inputs from a user. Apply the logical negation operator (!) to each and print the result.
        System.out.println("Logical Complement and Negation Operators - Second Exercise:");
        System.out.println("Enter the first boolean value: ");
        boolean firstBooleanValue = scanner.nextBoolean();
        System.out.println("Enter the second boolean value: ");
        boolean secondBooleanValue = scanner.nextBoolean();
        System.out.println("Logical negation for the first boolean value: " + !firstBooleanValue);
        System.out.println("Logical negation for the second boolean value: " + !secondBooleanValue);
        System.out.println();

//Increment and Decrement Operators:
//Write a Java program that uses both the increment (++) and decrement (--) operators in a loop to count up to 10 and then back down to 1.
        System.out.println("Increment and Decrement Operators - First Exercise:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();

//Create a program that takes an integer as input and then increments and decrements it by 1, displaying the output at each stage.
        System.out.println("Increment and Decrement Operators - Second Exercise:");
        System.out.println("Enter a number: ");
        int numberToIncrementAndDecrement = scanner.nextInt();
        System.out.println("Number: " + numberToIncrementAndDecrement);
        System.out.println("Number incremented by 1: " + ++numberToIncrementAndDecrement);
        System.out.println("Number decremented by 1: " + --numberToIncrementAndDecrement);
        System.out.println();

//Assignment and Compound Assignment Operators:
//Create a Java program that demonstrates the use of each compound assignment operator with integers.
        System.out.println("Assignment and Compound Assignment Operators - First Exercise:");
        System.out.println("Enter a number: ");
        int numberForCompoundAssignment = scanner.nextInt();
        numberForCompoundAssignment += 5;
        System.out.println("number += 5 returns: " + numberForCompoundAssignment);
        numberForCompoundAssignment -= 4;
        System.out.println("number -= 4 returns: " + numberForCompoundAssignment);
        numberForCompoundAssignment *= 3;
        System.out.println("number *= 3 returns: " + numberForCompoundAssignment);
        numberForCompoundAssignment /= 2;
        System.out.println("number /= 2 returns: " + numberForCompoundAssignment);
        numberForCompoundAssignment %= 2;
        System.out.println("number %= 2 returns: " + numberForCompoundAssignment);
        System.out.println();

//Write a program to calculate the price after discount. Take the original price and discount percentage as input. Use compound assignment operator to perform the calculation.
        System.out.println("Assignment and Compound Assignment Operators - Second Exercise:");
        System.out.println("Enter original price: ");
        double price = scanner.nextInt();
        System.out.println("Enter discount: ");
        double discount = scanner.nextInt();
        price -= price * discount / 100;
        System.out.println("Price after discount: " + price);
        System.out.println();

//Relational Operators:
//Write a Java program that takes two numbers from the user and uses relational operators to display whether the first number is greater than, less than, or equal to the second number.
        System.out.println("Relational Operators - First Exercise");
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        if (firstNumber > secondNumber) {
            System.out.println("The first number is greater than the second number");
        } else if (firstNumber < secondNumber) {
            System.out.println("The first number is smaller than the second number");
        } else {
            System.out.println("The first number is equal to the second number");
        }
        System.out.println();

//Create a program that checks if a user entered number is within a specific range (e.g., 1-100). Use relational operators for the checks.
        System.out.println("Relational Operators - Second Exercise");
        System.out.println("Enter a number: ");
        int numberWithinSpecificRange = scanner.nextInt();
        if (numberWithinSpecificRange >=1 && numberWithinSpecificRange <= 100) {
            System.out.println("Number is within the range 1-100");
        } else {
            System.out.println("Number is not within the range 1-100");
        }
        System.out.println();

//Numeric Promotion:
//Write a program where you perform operations between an integer and a double. Display the result and discuss why it is in that format (due to Numeric Promotion).
        System.out.println("Numeric Promotion - First Exercise:");
        System.out.println("Enter an integer number: ");
        int integerNumber = scanner.nextInt();
        System.out.println("Enter a double number: ");
        double doubleNumber = scanner.nextDouble();
        System.out.println("The sum is a double due to numeric promotion: " + (integerNumber + doubleNumber));
        System.out.println();

//Create a program that takes two byte values, adds them together, and stores the result in a byte variable. Explain why the result is or is not what you'd expect, based on the rules of numeric promotion.
        System.out.println("Numeric Promotion - Second Exercise:");
        System.out.println("Enter the first byte value: ");
        byte byte1 = scanner.nextByte();
        System.out.println("Enter the second byte value: ");
        byte byte2 = scanner.nextByte();
        byte byteSum = (byte) (byte1 + byte2);
        System.out.println("Sum stored in byte " + byteSum);
        System.out.println();
    }
}
