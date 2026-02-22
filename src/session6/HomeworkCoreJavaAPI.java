package session6;

import java.util.Scanner;

public class HomeworkCoreJavaAPI {
    public static void main(String[] args) {
//Beginner Level
//Reverse a String
//Description: Write a program to reverse an input string using StringBuilder.
        System.out.println("Reverse a String \n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        StringBuilder stringToReverse = new StringBuilder(input.nextLine());
        System.out.println("Reversed string: " + stringToReverse.reverse() + "\n");

//Palindrome Checker
//Description: Check if a string is a palindrome using StringBuilder.
        System.out.println("Palindrome Checker \n");
        System.out.println("Enter a String: ");
        StringBuilder palindromeChecker = new StringBuilder(input.nextLine());
        if (palindromeChecker.toString().contentEquals(palindromeChecker.reverse())) {
            System.out.println("The string is a palindrome. \n");
        } else {
            System.out.println("The string is not a palindrome. \n");
        }

//Concatenate Multiple Strings
//Description: Efficiently concatenate multiple strings into one using StringBuilder.
        System.out.println("Concatenate Multiple Strings \n");
        System.out.println("Enter three strings to concatenate: ");
        StringBuilder stringToConcatenate = new StringBuilder(input.nextLine());
        stringToConcatenate.append(input.nextLine());
        stringToConcatenate.append(input.nextLine());
        System.out.println("Concatenated string is: " + stringToConcatenate + "\n");

//Removing Vowels
//Description: Remove all vowels from a string using StringBuilder.
        System.out.println("Removing Vowels \n");
        System.out.println("Enter a string");
        StringBuilder removeVowels = new StringBuilder(input.nextLine());
        for(int i = removeVowels.length() - 1; i >= 0; i--) {
            if(removeVowels.charAt(i) == 'a'
                    || removeVowels.charAt(i) == 'e'
                    || removeVowels.charAt(i) == 'i'
                    || removeVowels.charAt(i) == 'o'
                    || removeVowels.charAt(i) == 'u') {
                removeVowels.deleteCharAt(i);
            }
        }
        if(!removeVowels.isEmpty()) {
            System.out.println("word without vowels: " +  removeVowels + "\n");
        } else {
            System.out.println("word only with vowels \n");
        }

//Word Capitalizer
//Description: Capitalize the first letter of every word in a sentence using StringBuilder.
        System.out.println("Word Capitalizer \n");
        System.out.println("Enter a sentence: ");
        StringBuilder stringToCapitalize = new StringBuilder(input.nextLine());
        char firstLetter = stringToCapitalize.charAt(0);
        char lastLetter = stringToCapitalize.charAt(stringToCapitalize.length() - 1);
        for (int i = 0; i < stringToCapitalize.length(); i++) {
            if (Character.isLowerCase(firstLetter)) {
                firstLetter = Character.toUpperCase(firstLetter);
                stringToCapitalize.setCharAt(0, firstLetter);
            } else if (Character.isSpaceChar(stringToCapitalize.charAt(stringToCapitalize.length() - 1)) && Character.isLowerCase(lastLetter)) {
                lastLetter = Character.toUpperCase(lastLetter);
                stringToCapitalize.setCharAt(stringToCapitalize.length() - 1, lastLetter);
            } else if (Character.isSpaceChar(stringToCapitalize.charAt(i)) && Character.isLowerCase(stringToCapitalize.charAt(i + 1))) {
                stringToCapitalize.setCharAt(i + 1, Character.toUpperCase(stringToCapitalize.charAt(i + 1)));
            }
        }
        System.out.println("sentence with all words with first capital letter: " + stringToCapitalize + "\n");

//Medium Level
//String Replacement
//Description: Replace all occurrences of a substring in a string using StringBuilder.
        System.out.println("String Replacement \n");
        System.out.println("Enter a string: ");
        StringBuilder stringReplacement = new StringBuilder(input.nextLine());
        System.out.println("Choose a substring to be replaced with smiley face: ");
        String substringToBeReplaced = input.nextLine();
        for (int i = 0; i < stringReplacement.length() - substringToBeReplaced.length(); i++) {
            if (stringReplacement.substring(i, i + substringToBeReplaced.length()).equals(substringToBeReplaced)) {
                stringReplacement.replace(i, i + substringToBeReplaced.length(), ":)");
                i += 1;
            }
        }
        System.out.println("Replaced string: " + stringReplacement + "\n");

//Duplicate Character Remover
//Description: Remove duplicate characters from a string using StringBuilder.
        System.out.println("Duplicate Character Remover \n");
        System.out.println("Enter a string: ");
        StringBuilder stringToRemoveDuplicates = new StringBuilder(input.nextLine());
        for (int i = 0; i < stringToRemoveDuplicates.length(); i++) {
            for (int j = i + 1; j < stringToRemoveDuplicates.length(); j++) {
                if (stringToRemoveDuplicates.charAt(i) == stringToRemoveDuplicates.charAt(j)) {
                    stringToRemoveDuplicates.deleteCharAt(j);
                    j--;
                }
            }
        }
        System.out.println("string without duplicate characters: " + stringToRemoveDuplicates + "\n");

//Inserting at Index
//Description: Insert a string at a specified index in another string using StringBuilder.
        System.out.println("Inserting at Index \n");
        System.out.println("Enter a string: ");
        StringBuilder stringToInsertAtIndex = new StringBuilder(input.nextLine());
        System.out.println("Enter the string to be inserted: ");
        String stringToBeInserted = input.nextLine();
        System.out.println("Enter the starting index: ");
        int startingIndex = input.nextInt();
        if (startingIndex < 0 || startingIndex > stringToInsertAtIndex.length()) {
            System.out.println("The string to be inserted is invalid");
        } else {
            stringToInsertAtIndex.insert(startingIndex, stringToBeInserted);
        }
        System.out.println("new string with insertion: " + stringToInsertAtIndex + "\n");

//Frequency Counter
//Description: Count the frequency of each character in a string using StringBuilder.
        System.out.println("Frequency Counter \n");
        System.out.println("Enter a string: ");
        StringBuilder stringToCountFrequency = new StringBuilder(input.nextLine());
        for (int i = 0; i < stringToCountFrequency.length(); i++) {
            char letter = stringToCountFrequency.charAt(i);
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (stringToCountFrequency.charAt(k)  == letter) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < stringToCountFrequency.length(); j++) {
                if (stringToCountFrequency.charAt(i) == stringToCountFrequency.charAt(j)) {
                    count++;
                }
            }
            System.out.println("Character " + stringToCountFrequency.charAt(i) + " has count: " + count);
        }
        System.out.println();

//Morse Code Converter
//Description: Convert a string to Morse code using StringBuilder.
        System.out.println("Morse Code Converter");
        System.out.println("Enter a string: ");
        String stringToMorseCode = input.nextLine().toUpperCase();
        StringBuilder morseCode = new StringBuilder();
        for (int i = 0; i < stringToMorseCode.length(); i++) {
            char c = stringToMorseCode.charAt(i);
            switch (c) {
                case 'A': morseCode.append(".- "); break;
                case 'B': morseCode.append("-... "); break;
                case 'C': morseCode.append("-.-. "); break;
                case 'D': morseCode.append("-.. "); break;
                case 'E': morseCode.append(". "); break;
                case 'F': morseCode.append("..-. "); break;
                case 'G': morseCode.append("--. "); break;
                case 'H': morseCode.append(".... "); break;
                case 'I': morseCode.append(".. "); break;
                case 'J': morseCode.append(".--- "); break;
                case 'K': morseCode.append("-.- "); break;
                case 'L': morseCode.append(".-.. "); break;
                case 'M': morseCode.append("-- "); break;
                case 'N': morseCode.append("-. "); break;
                case 'O': morseCode.append("--- "); break;
                case 'P': morseCode.append(".--. "); break;
                case 'Q': morseCode.append("--.- "); break;
                case 'R': morseCode.append(".-. "); break;
                case 'S': morseCode.append("... "); break;
                case 'T': morseCode.append("- "); break;
                case 'U': morseCode.append("..- "); break;
                case 'V': morseCode.append("...- "); break;
                case 'W': morseCode.append(".-- "); break;
                case 'X': morseCode.append("-..- "); break;
                case 'Y': morseCode.append("-.-- "); break;
                case 'Z': morseCode.append("--.. "); break;
                case '1': morseCode.append(".---- "); break;
                case '2': morseCode.append("..--- "); break;
                case '3': morseCode.append("...-- "); break;
                case '4': morseCode.append("....- "); break;
                case '5': morseCode.append("..... "); break;
                case '6': morseCode.append("-.... "); break;
                case '7': morseCode.append("--... "); break;
                case '8': morseCode.append("---.. "); break;
                case '9': morseCode.append("----. "); break;
                case '0': morseCode.append("----- "); break;
                case ' ': morseCode.append("/ "); break;
                default:
                    break;
            }
        }
        System.out.println("Text in morse code: " + morseCode + "\n");

//Expert Level
//Encode and Decode using Caesar Cipher
//Description: Implement a Caesar Cipher encoder and decoder using StringBuilder.
        System.out.println("Encode and Decode using Caesar Cipher \n");
        System.out.println("Enter a text to encode: ");
        String textToEncode = input.nextLine();
        StringBuilder encodedText = new StringBuilder();
        System.out.println("Choose the shift number: ");
        int shift = input.nextInt();
        for (int i = 0; i < textToEncode.length(); i++) {
            char c = textToEncode.charAt(i);
            if (Character.isLetter(c) && Character.isUpperCase(c)) {
                int letterDigitValue = (c - 'A' + shift) % 26;
                char encrypted = (char) (letterDigitValue + 'A');
                encodedText.append(encrypted);
            } else if (Character.isLetter(c) && Character.isLowerCase(c)) {
                int letterDigitValue = (c - 'a' + shift) % 26;
                char encrypted = (char) (letterDigitValue + 'a');
                encodedText.append(encrypted);
            } else {
                encodedText.append(c);
            }
        }
        System.out.println("Encoded text is: " + encodedText);
        StringBuilder decodedText = new StringBuilder();
        for (int i = 0; i < encodedText.length(); i++) {
            char c = encodedText.charAt(i);
            if (Character.isLetter(c) && Character.isUpperCase(c)) {
                int letterDigitValue = (c - 'A' - shift) % 26;
                char encrypted = (char) (letterDigitValue + 'A');
                decodedText.append(encrypted);
            } else if (Character.isLetter(c) && Character.isLowerCase(c)) {
                int letterDigitValue = (c - 'a' - shift) % 26;
                char encrypted = (char) (letterDigitValue + 'a');
                decodedText.append(encrypted);
            } else {
                decodedText.append(c);
            }
        }
        System.out.println("Decoded text is: " + decodedText + "\n");

//CamelCase to Snake_case Converter
//Description: Convert a CamelCase string to snake_case using StringBuilder.
        System.out.println("CamelCase to Snake_case Converter \n");
        input.nextLine();
        System.out.println("Enter a camelCase text: ");
        StringBuilder textToSnakeCase = new StringBuilder(input.nextLine());
        for (int i = 0; i < textToSnakeCase.length(); i++) {
            char c = textToSnakeCase.charAt(i);
            if (Character.isUpperCase(c)) {
                textToSnakeCase.replace(i, i + 1, String.valueOf(Character.toLowerCase(c)));
                textToSnakeCase.insert(i, "_");
            }
        }
        System.out.println("Text to snake_case: " + textToSnakeCase + "\n");

//Expand Compressed Strings
//Description: Expand a compressed string (e.g., "a3b2c4" -> "aaabbcccc") using StringBuilder.
        System.out.println("Expand Compressed Strings \n");
        System.out.println("Enter compressed string: ");
        StringBuilder compressedString = new StringBuilder(input.nextLine());
        for (int i = 0; i < compressedString.length(); i++) {
            char c = compressedString.charAt(i);
            if (Character.isDigit(c)) {
                compressedString.deleteCharAt(i);
                for (int j = 1; j < Character.getNumericValue(c); j++) {
                    compressedString.insert(i, compressedString.charAt(i - 1));
                }
            }
        }
        System.out.println("Expanded string: " + compressedString + "\n");

//Remove Comments from Code
//Description: Remove single line (//) and multi-line (/* */) comments from code using StringBuilder.
        System.out.println("Remove Comments from Code \n");
        System.out.println("Enter block of code with comments: ");
        StringBuilder removeCommentsFromCode = new StringBuilder();
        while (true) {
            String line = input.nextLine();
            if (line.contains("END")) {
                break;
            }
            removeCommentsFromCode.append(line).append("\n");
        }
        for (int i = 0; i < removeCommentsFromCode.length(); i++) {
            if (removeCommentsFromCode.charAt(i) == '/' && removeCommentsFromCode.charAt(i + 1) == '/') {
                int end = removeCommentsFromCode.indexOf("\n", i);
                if (end == -1) {
                    end = removeCommentsFromCode.length();
                }
                removeCommentsFromCode.delete(i, end + 1);
                i--;
            } else if (removeCommentsFromCode.charAt(i) == '/' && removeCommentsFromCode.charAt(i + 1) == '*') {
                int end = removeCommentsFromCode.indexOf("*/", i);
                if (end == -1) {
                    end = removeCommentsFromCode.length();
                }
                removeCommentsFromCode.delete(i, end + 2);
                i--;
            }
        }
        System.out.println("block of code with removed comments: \n" + removeCommentsFromCode + "\n");

//Anagram Checker
//Description: Check if two strings are anagrams using StringBuilder.
        System.out.println("Anagram Checker \n");
        System.out.println("Enter the first string: ");
        StringBuilder firstAnagramString = new StringBuilder(input.nextLine().toLowerCase().trim());
        System.out.println("Enter the second string: ");
        StringBuilder secondAnagramString = new StringBuilder(input.nextLine().toLowerCase().trim());
        if (firstAnagramString.length() != secondAnagramString.length()) {
            System.out.println("The strings have different lengths! \n");
        } else {
            char[] count = new char[26];
            for (int i = 0; i < firstAnagramString.length(); i++) {
                count[firstAnagramString.charAt(i) - 'a']++;
                count[secondAnagramString.charAt(i) - 'a']--;
            }
            boolean isAnagram = true;
            for (char ch : count) {
                if (ch != 0) {
                    isAnagram = false;
                    break;
                }
            }
            System.out.println("The strings are anagrams: " + isAnagram + "\n");
        }

//Toggling Case
//Description: Toggle the case of every character in a string using StringBuilder.
        System.out.println("Toggling Case \n");
        System.out.println("Enter a string: ");
        StringBuilder stringToToggleCase = new StringBuilder(input.nextLine());
        for (int i = 0; i < stringToToggleCase.length(); i++) {
            char character = stringToToggleCase.charAt(i);
            if  (Character.isUpperCase(character)) {
                character = Character.toLowerCase(character);
                stringToToggleCase.setCharAt(i, character);
            } else if (Character.isLowerCase(character)) {
                character = Character.toUpperCase(character);
                stringToToggleCase.setCharAt(i, character);
            }
        }
        System.out.println("String with toggled cases: " + stringToToggleCase);

//    Challenge bonus
//Leetcode problem, Integer To Roman: https://leetcode.com/problems/integer-to-roman/
    }
}
