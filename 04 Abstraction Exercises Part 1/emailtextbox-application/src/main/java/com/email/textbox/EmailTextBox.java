package com.email.textbox;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailTextBox {
    private String value;
    private boolean enabled;
    private int length;

    private static final String EMAIL_REGEX = "zandersarmiento@gmail.com";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public EmailTextBox(String value, boolean enabled, int length) {
        this.value = value;
        this.enabled = enabled;
        this.length = length;
    }

    public boolean validateEmail() {
        Matcher matcher = EMAIL_PATTERN.matcher(value);
        return matcher.matches();
    }
}
