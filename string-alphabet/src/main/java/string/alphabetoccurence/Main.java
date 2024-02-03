package main.java.string.alphabetoccurence;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a String of Alphabets: ");
        String inputString = sc.nextLine();

        inputString = inputString.toLowerCase();

        char[] alphabetArray = inputString.toCharArray();

        int[] alphabetCount = new int[26];

        for (char ch : alphabetArray) {
            if (Character.isLetter(ch)) {
                alphabetCount[ch - 'a']++;
            }
        }

        char maxAlphabet = 'a';
        int maxCount = alphabetCount[0];

        for (int i = 1; i < alphabetCount.length; i++) {
            if (alphabetCount[i] > maxCount) {
                maxCount = alphabetCount[i];
                maxAlphabet = (char) ('a' + i);
            }
        }

        System.out.println("Number of occurrence of each alphabet:");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch + ": " + alphabetCount[ch - 'a']);
        }

        System.out.println("Alphabet with maximum occurrence: " + maxAlphabet + " (" + maxCount + " times)");

        sc.close();
    }
}
