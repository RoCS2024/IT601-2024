import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Chat {
    private static Set<String> bannedWords;

    static {
        bannedWords = new HashSet<>();
        bannedWords.add("fuck");
        bannedWords.add("bitch");
        bannedWords.add("shit");
        bannedWords.add("asshole");
        bannedWords.add("cunt");
        bannedWords.add("bastard");
        bannedWords.add("whore");
        bannedWords.add("slot");
        bannedWords.add("motherfucker");
    }

    private String senderName;
    private String recipientName;
    private List<String> messages;

    private boolean senderOnline;

    public Chat(String senderName, String recipientName) {
        this.senderName = senderName;
        this.recipientName = recipientName;
        this.messages = new ArrayList<>();
        this.senderOnline = false;
    }


    public boolean isSenderOnline() {
        return senderOnline;
    }


    public void toggleSenderOnline() {
        senderOnline = !senderOnline;
    }

    public void addMessage(String message) {
        if (!containsBannedWords(message)) {
            messages.add(message);
            System.out.println("Message sent successfully..");
        } else {
            System.out.println("Message contains banned words and cannot be sent..");
        }
    }

    public boolean containsBannedWords(String message) {
        for (String word : bannedWords) {
            if (message.toLowerCase().contains(word)) {
                return true;
            }
        }
        return false;
    }
}
