package com.textbox;

import java.util.regex.Pattern;

public class EmailTextBox extends TextBox {
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private static final Pattern pattern = Pattern.compile(EMAIL_REGEX);

    public EmailTextBox(String value, boolean enabled, int length) {
        super(value, enabled, length);
    }

    public boolean isValidEmail() {
        return pattern.matcher(getValue()).matches();
    }
}
