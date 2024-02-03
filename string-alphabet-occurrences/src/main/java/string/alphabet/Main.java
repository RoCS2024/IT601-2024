package main.java.string.alphabet;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Input a String of Alphabets: ");
            String inputString = sc.nextLine();

            if (inputString.isEmpty() || !inputString.matches(".*[a-zA-Z].*")) {
                System.out.println("Invalid input. Please enter a valid string with alphabets.");
                return;
            }

            inputString = inputString.toLowerCase();
            char[] alphabetArray = inputString.toCharArray();
            int[] alphabetCount = new int[26];

            for (char ch : alphabetArray) {
                if (Character.isLetter(ch)) {
                    alphabetCount[ch - 'a']++;
                }
            }

            System.out.println("Alphabets with non-zero occurrence and their frequencies:");
            char maxAlphabet = 'a';
            int maxCount = alphabetCount[0];

            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (alphabetCount[ch - 'a'] > 0) {
                    System.out.printf("%c: %d%n", ch, alphabetCount[ch - 'a']);
                }

                if (alphabetCount[ch - 'a'] > maxCount) {
                    maxCount = alphabetCount[ch - 'a'];
                    maxAlphabet = ch;
                }
            }

            System.out.println("Alphabet with maximum occurrence: " + maxAlphabet + " (" + maxCount + " times)");
        }
    }
}
