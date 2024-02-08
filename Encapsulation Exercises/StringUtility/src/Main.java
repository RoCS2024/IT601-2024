import java.util.Scanner;

public class Main {
    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    // Method to count the number of words in a string/phrase
    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    // Method to validate if input contains only strings and not integers
    public static boolean isValidString(String input) {
        return input.matches("[a-zA-Z\\s]+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string:");
        String input = scanner.nextLine();

        // Validate input
        while (!isValidString(input)) {
            System.out.print("Invalid input. Please enter a string without numbers:");
            input = scanner.nextLine();
        }

        // Reversing the string
        String reversedString = reverseString(input);
        System.out.println("Reversed String: " + reversedString);

        // Counting the number of words
        int wordCount = countWords(input);
        System.out.println("Word Count: " + wordCount);

        // Close the scanner
        scanner.close();
    }
}
