import java.util.Scanner;

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
            System.out.println("1. Your Status");
            System.out.println("2. Type message");
            System.out.println("0. Back");
            option = readOption(scanner);

            switch (option) {
                case 1:
                    chat.toggleSenderOnline(); // Toggle sender's online status
                    if (chat.isSenderOnline()) {
                        System.out.println("You are now online.");
                    } else {
                        System.out.println("You are now offline.");
                    }
                    break;
                case 2:
                    if (!chat.isSenderOnline()) {
                        System.out.println("You are currently offline. Message cannot be sent.");
                    } else {
                        String message = selectMessage(scanner);

                        if (message != null) {
                            boolean containsBannedWords = chat.containsBannedWords(message);

                            if (containsBannedWords) {
                                System.out.println("Message contains banned words and cannot be sent ");
                            } else {
                                chat.addMessage(message);
                            }
                        }
                    }
                    break;
            }
        } while (option != 0);

        scanner.close();
    }

    public static int readOption(Scanner scanner) {
        int option;
        do {
            System.out.print("Enter your choice: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            option = scanner.nextInt();
        } while (option < 0 || option > 2);
        scanner.nextLine();
        return option;
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
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            choice = scanner.nextInt();
        } while (choice < 1 || choice > 5);
        scanner.nextLine();

        switch (choice) {
            case 1:
                return "Good morning!";
            case 2:
                return "Hello!";
            case 3:
                return "Take care always.";
            case 4:
                return "Congrats";
            case 5:
                System.out.print("Type your message: ");
                return scanner.nextLine().trim();
            default:
                return null;
        }
    }
}
