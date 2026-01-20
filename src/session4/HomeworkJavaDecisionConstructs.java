package session4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeworkJavaDecisionConstructs {
    public static void main(String[] args) {
//1. Write a Java program where you create two String objects named stringOne and stringTwo with the same value "OpenAI". Check and print whether they refer to the same object.
        System.out.println("Exercise 1:");
        String stringOne = new  String("OpenAI");
        String stringTwo = new  String("OpenAI");
        System.out.println("stringOne == stringTwo returns " + (stringOne == stringTwo) + " because they are different objects");
        System.out.println("stringOne.equals(stringTwo) returns "  + stringOne.equals(stringTwo)  + " because they have the same content");
        System.out.println();

//2.  Write a Java program to declare two integer variables firstNumber and secondNumber with any values. Use an equality operator to compare these two numbers and print the result. Do the same for two String objects firstString and secondString with the same value, but use the equals() method for comparison. Print the result.
        System.out.println("Exercise 2:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("firstNumber == secondNumber returns " + (firstNumber == secondNumber));
        String firstString = "sameValue";
        String secondString = "sameValue";
        System.out.println(firstString + ".equals(" + secondString + ") returns " + (firstString.equals(secondString)));
        System.out.println();

//3. Write a Java program that declares an integer variable age with a value of 20. Print a statement saying "I am adult" if age is 18 or more, else print "I am not an adult".
        System.out.println("Exercise 3:");
        int age = 20;
        if (age > 18) {
            System.out.println("I am adult");
        } else {
            System.out.println("I am not adult");
        }
        System.out.println();

//4. Write a Java program where you declare two integer variables heightOne and heightTwo with any values. Use a ternary operator to determine the greater height and assign it to a variable maximumHeight. Print the result.
        System.out.println("Exercise 4:");
        System.out.println("Enter a value for height1: ");
        int height1 = scanner.nextInt();
        System.out.println("Enter a value for height2: ");
        int height2 = scanner.nextInt();
        int maximumHeight = (height1 > height2) ? height1 : height2;
        System.out.println("Maximum height is " + maximumHeight);
        System.out.println();

//5. Write a Java program to print the numbers from 1 to 10 using a for loop. As a next step, modify your program to print only the even numbers from 1 to 10.
        System.out.println("Exercise 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();

//6. Write a Java program where you declare an integer variable temperature. Assign a value to it and print "Hot" if the temperature is more than 30, "Warm" if the temperature is between 20 and 30, and "Cold" if it's less than 20.
        System.out.println("Exercise 6:");
        System.out.println("Enter a value for temperature: ");
        int temperature = scanner.nextInt();
        if (temperature > 30) {
            System.out.println("Hot");
        } else if (temperature >= 20) {
            System.out.println("Warm");
        } else {
            System.out.println("Cold");
        }
        System.out.println();

//7. Write a Java program that determines the type of triangle based on its sides. Declare three variables sideOne, sideTwo and sideThree to represent the sides of the triangle. Use the ternary operator to determine and print whether the triangle is "Equilateral", "Isosceles", or "Scalene".
        System.out.println("Exercise 7:");
        System.out.println("Enter the value for sideOne of the triangle");
        int sideOne = scanner.nextInt();
        System.out.println("Enter the value for sideTwo of the triangle");
        int sideTwo = scanner.nextInt();
        System.out.println("Enter the value for sideThree of the triangle");
        int sideThree = scanner.nextInt();
        String triangle = (sideOne == sideTwo && sideOne == sideThree)? "Equilateral"
                : (sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree)? "Isosceles"
                : "Scalene";
        System.out.println("The triangle is " + triangle);
        System.out.println();

//8. Write a Java program to calculate the factorial of a number using a for loop. Declare an integer variable number and assign a value to it. Then calculate and print the factorial of number.
        System.out.println("Exercise 8:");
        System.out.println("Enter a number");
        int numberFactorial = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= numberFactorial; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + numberFactorial + " is " + factorial);
        System.out.println();

//9. Write a Java program to create two String variables, countryOne with the value "USA" and countryTwo with the value "USA". Check if countryOne and countryTwo are equal using the equals() method and print the result. Then change the value of countryTwo to "UK" and check for equality again. Print the result.
        System.out.println("Exercise 9:");
        String countryOne = "USA";
        String countryTwo = "USA";
        System.out.println(countryOne + ".equals(" + countryTwo + ") returns " + countryOne.equals(countryTwo));
        countryTwo = "UK";
        System.out.println(countryOne + ".equals(" + countryTwo + ") returns " + countryOne.equals(countryTwo));
        System.out.println();

//10. Write a Java program that creates two distinct ArrayList objects, listOne and listTwo. Add some elements to listOne and assign listOne to listTwo. Now modify listOne by adding a new element. Print both lists and observe the output.
        System.out.println("Exercise 10");
        ArrayList<String> listOne = new ArrayList<>(List.of("apple", "orange", "banana"));
        ArrayList<String> listTwo = new ArrayList<>(listOne);
        listOne.add("blueberry");
        System.out.println("listOne has: " + listOne);
        System.out.println("listTwo has: " + listTwo);
        System.out.println();

//11. Write a Java program where you declare four integer variables: a, b, c, and d. Assign them values of 10, 20, 30, and 40 respectively. Create two more variables additionResult and multiplicationResult. Set additionResult to the sum of a and b and multiplicationResult to the product of c and d. Print the values of additionResult and multiplicationResult.
        System.out.println("Exercise 11:");
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int additionResult = a + b;
        int multiplicationResult = c * d;
        System.out.println("Addition result: " + additionResult);
        System.out.println("Multiplication result: " + multiplicationResult);
        System.out.println();

//12. Write a Java program where you declare an integer variable number with a value of 25. Use unary minus operator to change the sign of number and assign it to a variable negativeNumber. Print the values of number and negativeNumber.
        System.out.println("Exercise 12:");
        int number = 25;
        int negativeNumber = -number;
        System.out.println("number: " + number);
        System.out.println("negativeNumber: " + negativeNumber);
        System.out.println();

//13. Write a Java program where you declare two boolean variables isRaining and isSunny with values of true and false, respectively. Use the logical complement operator to negate the values of both variables and print the new values.
        System.out.println("Exercise 13:");
        boolean isRaining = true;
        boolean isSunny = false;
        System.out.println("isRaining is " + isRaining + ", !isRaining is " + !isRaining);
        System.out.println("isSunny is " + isSunny +", !isSunny is " + !isSunny);
        System.out.println();

//14. Write a Java program where you declare an integer variable counter with a value of 0. Use the increment operator to increase the value of counter by 1 and then print the value. After that, use the decrement operator to decrease the value of counter by 1 and then print the value.
        System.out.println("Exercise 14:");
        int counter = 0;
        System.out.println("counter is " + counter);
        System.out.println("counter++ is " +  ++counter);
        System.out.println("counter-- is " +  --counter);
        System.out.println();

//15. Write a Java program where you declare an integer variable total with a value of 100. Use the compound assignment operator to decrease the total by 20 and then print the value. Next, use another compound assignment operator to multiply the total by 2 and then print the value.
        System.out.println("Exercise 15:");
        int total = 100;
        System.out.println("total = " + total);
        total -= 20;
        System.out.println("total -= 20 is " +  total);
        total *= 2;
        System.out.println("total *= 2 is " +  total);
        System.out.println();

//16. Write a Java program where you use unary operators to perform a series of transformations on an integer variable number initialized to 50. First, negate number, then take the absolute value, and finally increment it by 1. Print the result at each step.
        System.out.println("Exercise 16:");
        int numberForUnaryOperations = 50;
        System.out.println("numberForUnaryOperations: "  + numberForUnaryOperations);
        int negativeNumberForUnaryOperations = -numberForUnaryOperations;
        System.out.println("-numberForUnaryOperations: "  + negativeNumberForUnaryOperations);
        int absoluteValue = -negativeNumberForUnaryOperations;
        System.out.println("absolute value for numberForUnaryOperations: "  + absoluteValue);
        System.out.println("increment absolute value for numberForUnaryOperations: "  + ++absoluteValue);
        System.out.println();

//17. Write a Java program that simulates a simple authentication system. Declare a boolean variable hasUsername and hasPassword. Set up a series of logical conditions using these two variables that will check the following conditions:
//If both hasUsername and hasPassword are true, print "Authentication successful".
//If either hasUsername or hasPassword is false, print "Authentication failed".
//If hasUsername is true but hasPassword is false, print "Password is incorrect".
        System.out.println("Exercise 17:");
        System.out.println("Enter a boolean value for hasUsername: ");
        boolean hasUsername = scanner.nextBoolean();
        System.out.println("Enter a boolean value for hasPassword: ");
        boolean hasPassword = scanner.nextBoolean();
        if (hasUsername && hasPassword) {
            System.out.println("Authentication successful");
        } else if (hasUsername && !hasPassword) {
            System.out.println("Password is incorrect");
        } else {
            System.out.println("Authentication failed");
        }
        System.out.println();

//18. Write a Java program where you declare an integer array with 5 elements. Use a for loop to initialize the array such that each element is equal to its index incremented by 1. Then use another for loop to decrement each element by 1. Print the array before and after the decrement operation using a for-each loop.
        System.out.println("Exercise 18:");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int i: array) {
            System.out.println("before decrement " + i);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] - 1;
        }
        for (int i: array) {
            System.out.println("after decrement " + i);
        }
        System.out.println();

//19. Write a Java program that takes an integer variable age as input. Use a ternary operator to classify the person into one of the following categories: "Child" (age < 12), "Teenager" (age between 12 and 17), "Adult" (age between 18 and 64), and "Senior" (age 65 and above). Print the resulting classification.
        System.out.println("Exercise 19:");
        System.out.println("Enter a value for the age of a person: ");
        int ageExercise = scanner.nextInt();
        if (ageExercise < 0) {
            System.out.println("Invalid age");
        } else {
            String person = (age < 12) ? "Child"
                    : (age <= 17) ? "Teenager"
                    : (age <= 64) ? "Adult"
                    : "Senior";
            System.out.println(person);
        }
        System.out.println();

//20. Write a Java program that takes three integer variables a, b, and c as input. Use nested ternary operators to find and print the largest number among the three.
        System.out.println("Exercise 20:");
        System.out.println("Enter a value for variable a: ");
        int aIntVar = scanner.nextInt();
        System.out.println("Enter a value for variable b: ");
        int bIntVar = scanner.nextInt();
        System.out.println("Enter a value for variable c: ");
        int cIntVar = scanner.nextInt();
        int maxNumber = (aIntVar >= bIntVar)
                ? ((aIntVar >= cIntVar) ? aIntVar : cIntVar)
                : ((bIntVar >= cIntVar ) ? bIntVar : cIntVar);
        System.out.println("max number: " + maxNumber);
        System.out.println();

//21. Write a Java program that takes a double variable score representing a student’s score on a test. Use a ternary operator to classify the score into letter grades A, B, C, D, or F according to the following scale:
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59
//Print the resulting letter grade.
        System.out.println("Exercise 21:");
        System.out.println("Enter the value for a student's score(0-100): ");
        double score = scanner.nextDouble();
        if (score > 100 || score < 0) {
            System.out.println("Invalid score");
        } else {
            char grade = (score >= 90) ? 'A'
                    : (score >= 80) ? 'B'
                    : (score >= 70) ? 'C'
                    : (score >= 60) ? 'D'
                    : 'F';
            System.out.println("Student grade is " + grade);
        }
    }
}
