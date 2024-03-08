/**
 * The PrivateChat class is a private conversation between two users in a chat application.
 */
package com.chat.application.chat;

import com.chat.application.Chat;

public class PrivateChat extends Chat {

    // Fields
    private String alias;

    /**
     * Constructs a new PrivateChat object with the given sender, recipient, and alias.
     *
     * @param nameOfSender    The name of the sender
     * @param nameOfRecipient The name of the recipient
     * @param alias           The alias chosen by the sender for the recipient
     */
    public PrivateChat(String nameOfSender, String nameOfRecipient, String alias) {
        super(nameOfSender, nameOfRecipient);
        this.alias = alias;
    }

    /**
     * Overrides the method to retrieve the name of the recipient.
     * Returns the alias chosen by the sender.
     */
    @Override
    public String getNameOfRecipient() {
        return alias;
    }
}

