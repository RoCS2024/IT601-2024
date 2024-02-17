import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the password length:");
        int passwordLength = scanner.nextInt();

        PasswordBox passwordBox = new PasswordBox(passwordLength);

        System.out.println("Enter the password:");

        String passwordInput = scanner.next();
        for (char c : passwordInput.toCharArray()) {
            passwordBox.appendChar(c);
        }

        System.out.println("Masked Value: " + passwordBox.getMaskedValue());
    }
}
public static void appendChar(char c) {
    if (value.length() < length) {
        value += c;
    }
}

public static boolean isPasswordValid() {
    return value.length() >= 8;
}
if (passwordBox.isPasswordValid()) {
        System.out.println("Password is valid. Masked Value: " + passwordBox.getMaskedValue());
        } else {
        System.out.println("Password is invalid. Please enter a valid password.");
}
