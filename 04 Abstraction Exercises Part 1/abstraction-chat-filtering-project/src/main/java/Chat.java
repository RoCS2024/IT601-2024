 /**
 * This class is the Chat class
 * */

import java.util.ArrayList;
        import java.util.List;

public class Chat {
    private String senderName;
    private String recipientName;
    private List<String> messages;
    private boolean recipientOnline;
    private List<String> bannedWords;


    public Chat(String senderName, String recipientName) {
        this.senderName = senderName;
        this.recipientName = recipientName;
        this.messages = new ArrayList<>();
        this.recipientOnline = false;
        this.bannedWords = new ArrayList<>();
    }

    public boolean isRecipientOnline() {
        return recipientOnline;
    }

    public void turnRecipientOnline() {
        recipientOnline = true;
    }

    public void addMessage(String message) {
        if (!containsBannedWords(message)) {
            messages.add(message);
        } else {
        }
    }

    private boolean containsBannedWords(String message) {
        for (String word : bannedWords) {
            if (message.toLowerCase().contains(word)) {
                return true;
            }
        }
        return false;
    }
}