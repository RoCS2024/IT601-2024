package com.textbox;

public class TextBox {
    private String value;
    private boolean enabled;
    private int length;

    public TextBox(String value, boolean enabled, int length) {
        this.value = value;
        this.enabled = enabled;
        this.length = length;
    }

    public String getValue() {
        return value;

    }
}


