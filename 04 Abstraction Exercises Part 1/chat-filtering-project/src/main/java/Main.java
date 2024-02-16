import java.util.Scanner;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sender's name: ");
        String senderName = scanner.nextLine();

        System.out.print("Enter recipient's name: ");
        String recipientName = scanner.nextLine();
        Chat chat = new Chat(senderName, recipientName);
        int option;

        do {
            System.out.println("Choose from the options: ");
            System.out.println("1. Status");
            System.out.println("2. Type message");
            System.out.println("0. Back");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    if (!chat.isRecipientOnline()) {
                        System.out.println("Online");
                        chat.turnRecipientOnline();
                    } else {
                        System.out.println("Offline");
                    }
                    break;
                case 2:
                    scanner.nextLine();
                    String message = selectMessage(scanner);

                    boolean containsOffensiveWord = containsOffensiveWord(message);

                    if (containsOffensiveWord) {
                        System.out.println("Message is irrelevant. ");
                    } else {
                        chat.addMessage(message);
                        System.out.println("Message sent successfully.");
                    }
                    break;
            }
        } while (option != 0);

        scanner.close();
    }

    public static String selectMessage(Scanner scanner) {
        System.out.println("Choose a message to send:");
        System.out.println("1. \"Good morning!\"");
        System.out.println("2. \"Hello!\"");
        System.out.println("3. \"Take care always\"");
        System.out.println("4. \"Congrats\"");
        System.out.println("5. \"Type your message:\"");

        int choice;
        do {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
        } while (choice < 1 || choice > 5);

        if (choice == 5) {
            String message;
            do {
                System.out.print("Type your message: ");
                message = scanner.nextLine().trim();
            } while (message.isEmpty());
            return message;
        } else {
            switch (choice) {
                case 1:
                    return "Good morning!";
                case 2:
                    return "Hello! ";
                case 3:
                    return "Take care always.";
                case 4:
                    return "Congrats";
                default:
            }
        }
        return null;
    }

    public static boolean containsOffensiveWord(String message) {
        Pattern pattern = Pattern.compile("\\b(fuck|shit|asshole|bitch|bullshit)\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(message);
        return matcher.find();
    }
}
