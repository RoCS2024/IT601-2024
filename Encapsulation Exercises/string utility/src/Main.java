import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringUtility reversed = new StringUtility();
        Scanner scanner = new Scanner(System.in);
        StringUtility stringUtility = new StringUtility();

        System.out.print("Enter a string:");
        String input = scanner.nextLine();

        while (!stringUtility.isValidString(input)) {
            System.out.print("Invalid input. Please enter a string without numbers:");
            input = scanner.nextLine();
        }

        String reversedString = stringUtility.reverseString(input);
        System.out.println("Reversed String: " + reversedString);

        int wordCount = stringUtility.countWords(input);
        System.out.println("Word Count: " + wordCount);

        scanner.close();
    }
}