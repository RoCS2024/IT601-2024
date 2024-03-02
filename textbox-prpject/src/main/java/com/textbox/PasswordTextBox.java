package com.textbox;

public class PasswordTextBox extends TextBox {
    private boolean shown;
    private static char maskCharacter = '*';

    public PasswordTextBox(String value, boolean enabled, int length, boolean shown) {
        super(value, enabled, length);
        this.shown = shown;
    }

    public String getMaskedValue() {
        String value = getValue();
        if (shown) {
            return value;
        } else {
            return "*".repeat(value.length());
        }
    }
}
