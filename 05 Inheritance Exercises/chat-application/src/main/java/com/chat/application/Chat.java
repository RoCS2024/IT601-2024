/**
 * The Chat class is a conversation between two users in a chat application.
 */
package com.chat.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chat {

    // Fields
    private String nameOfSender; // The name of the sender

    private  String nameOfRecipient;  // The name of the recipient

    private List<String> listOfMessages; // List of messages exchanged in the conversation

    private boolean active; // Indicates the conversation is active or not

    private List<String>bannedWords;  // List of banned words in the conversation


    /**
     * Constructs a new Chat object with the given sender and recipient names.
     * Initializes the list of messages
     * Set the conversation as active by default.
     *
     */
    public Chat(String nameOfSender, String nameOfRecipient) {
        this.nameOfSender = nameOfSender;
        this.nameOfRecipient = nameOfRecipient;
        this.listOfMessages = new ArrayList<>();
        this.active = true;
        this.bannedWords = new ArrayList<>();
    }

    /**
     * Retrieves the name of the sender.
     *
     * @return The name of the sender
     */
    public String getNameOfSender() {
        return nameOfSender;
    }

    /**
     * Sets the name of the sender.
     *
     * @param nameOfSender The name of the sender
     */
    public void setNameOfSender(String nameOfSender) {
        this.nameOfSender = nameOfSender;
    }

    /**
     * Retrieves the name of the recipient.
     *
     * @return The name of the recipient
     */
    public String getNameOfRecipient() {
        return nameOfRecipient;
    }

    /**
     * Sets the name of the recipient.
     *
     * @param nameOfRecipient The name of the recipient
     */
    public void setNameOfRecipient(String nameOfRecipient) {
        this.nameOfRecipient = nameOfRecipient;
    }

    /**
     * Retrieves the list of messages exchanged in the conversation.
     *
     */
    public String getListOfMessages() {return listOfMessages.toString();}

    public void setListOfMessages(String listOfMessages) {
        this.listOfMessages = Collections.singletonList(listOfMessages);
    }

    /**
     * Checks if the conversation is active.
     *
     * @return True if the conversation is active, false otherwise
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Adds a message to the list of messages exchanged in the conversation.
     *
     * @param message The message to be added
     */
    public void addMessage(String message) {
        listOfMessages.add(message);
    }
    /**
     * Sets the active status of the conversation.
     *
     * @param active The active status
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * Retrieves the list of banned words in the conversation.
     *
     */
    public String getBannedWords() {return bannedWords.toString();}

    /**
     * Sets the list of banned words in the conversation.
     *
     */
    public void setBannedWords(String bannedWords) {
        this.bannedWords = Collections.singletonList(bannedWords);
    }
}
