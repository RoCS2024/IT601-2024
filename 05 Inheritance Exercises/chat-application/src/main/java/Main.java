import com.chat.application.Chat;
import com.chat.application.chat.PrivateChat;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Main class Chat Application
 * */
public class Main {
    /**
     * Main method to run chat application
     *
     * @param args
     * */
    public static void main(String[] args) {
        // Initialize scanner for user input
        Scanner scanner = new Scanner(System.in);
        // List of banned words
        List<String> bannedWords = Arrays.asList("damn", "hate", "sucks");

        // Welcome message
        System.out.println("Welcome to WhatsApp");

        Chat chat = null; // Initialize chat object
        boolean recipientActive = true; // Initial active status of recipient
        // Main menu loop
        int option;
        do {
            // Menu Options
            System.out.println("Choose an Option: ");
            System.out.println("1. Start Conversation: ");
            System.out.println("2. Go to Private Conversation: ");
            System.out.println("3. Chat Status (Active/Inactive): ");
            System.out.println("0. Exit");
            System.out.println("Enter your Choice: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // User Option
            switch (option) {
                case 1:
                    System.out.println("Enter Name of Sender: ");
                    String nameOfSender = scanner.nextLine();

                    System.out.println("Enter Name of Recipient: ");
                    String nameOfRecipient = scanner.nextLine();

                    chat = new Chat(nameOfSender, nameOfRecipient); // Create new chat
                    chat.setActive(true); // Set chat as active
                    recipientActive = true; // Set recipient as active

                    // Conversation Loop
                    String message;
                    boolean exitConversation = false;
                    do {
                        System.out.println(nameOfSender + ": ");
                        message = scanner.nextLine();
                        if (message.equals("exit")) {
                            exitConversation = true; // exit conversation loop
                        } else if (containsBannedWord(message, bannedWords)) {
                            System.out.println("Your message contains a banned word. Please avoid using disrespectful language.");
                            recipientActive = false; // Set recipient as inactive
                            exitConversation = true; // exit conversation loop
                        } else {
                            chat.addMessage(nameOfSender + ": " + message);
                        }
                    } while (!exitConversation);

                    System.out.println("Exiting conversation...");
                    break;

                    // Method to initiate private conversation
                case 2:
                    System.out.println("Enter Name of Sender: ");
                    String senderName = scanner.nextLine();

                    System.out.println("Enter Name of Recipient: ");
                    String recipientName = scanner.nextLine();

                    System.out.println("Enter Alias for Recipient: ");
                    String alias = scanner.nextLine();

                    PrivateChat privateChat = new PrivateChat(senderName, recipientName, alias);
                    System.out.println("Private conversation started between " + senderName +
                            " and " + alias);
                    break;

                    // Method to chat status active or not active
                case 3:
                    if (chat != null && recipientActive) {
                        System.out.println("Active status conversation with " + chat.getNameOfRecipient());
                    } else {
                        System.out.println("No active conversation. Your message contains a banned word.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Option! Please choose again.");
            }
        } while (option != 0);
    }

    /**
     * Check if a message contains any banned words.
     *
     * @param message     Message to be checked
     * @param bannedWords List of banned words
     *
     */
    private static boolean containsBannedWord(String message, List<String> bannedWords) {
        // Check if message contains banned words
        for (String word : bannedWords) {
            if (message.toLowerCase().contains(word.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}