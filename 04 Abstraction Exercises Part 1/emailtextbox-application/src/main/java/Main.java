import java.util.Scanner;
import com.email.textbox.EmailTextBox;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample usage
        System.out.println("Enter email address:");
        String emailInput = scanner.nextLine();

        EmailTextBox emailTextBox = new EmailTextBox(emailInput, true, emailInput.length());

        // Validate email
        if (emailTextBox.validateEmail()) {
            System.out.println("Email is valid.");
        } else {
            System.out.println("Email is not valid.");
        }
    }
}
