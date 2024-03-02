package com.email.textbox;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailTextBox {
    private String value;
    private boolean enabled;
    private int length;

    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";


    public EmailTextBox(String value, boolean enabled, int length) {
        this.value = value;
        this.enabled = enabled;
        this.length = length;
    }

    public boolean validateEmail() {
        // Custom email validation logic without exposing the specific pattern
        return isNotEmpty(value) && hasAtSymbol(value) && hasValidDomain(value);
    }

    private boolean isNotEmpty(String str) {
        return str != null && !str.isEmpty();
    }

    private boolean hasAtSymbol(String email) {
        return email.contains("@");
    }

    private boolean hasValidDomain(String email) {
        String[] parts = email.split("@");
        if (parts.length == 2) {
            String domain = parts[1];
            return isNotEmpty(domain) && domain.contains(".") && !domain.endsWith(".");
        }
        return false;
    }
}

