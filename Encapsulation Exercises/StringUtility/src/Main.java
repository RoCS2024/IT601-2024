import java.util.Scanner;

public class Main {
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
    public static boolean isValidString(String input) {
        return input.matches("[a-zA-Z\\s]+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string:");
        String input = scanner.nextLine();

        while (!isValidString(input)) {
            System.out.print("Invalid input. Please enter a string without numbers:");
            input = scanner.nextLine();
        }

        String reversedString = reverseString(input);
        System.out.println("Reversed String: " + reversedString);

        int wordCount = countWords(input);
        System.out.println("Word Count: " + wordCount);

        scanner.close();
    }
}
