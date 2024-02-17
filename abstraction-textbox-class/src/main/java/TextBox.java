package main.java;

public class TextBox {
    private String value;
    private boolean enabled;
    private static int maxLength = 15;
    public TextBox(String value, boolean enabled) {
        this.value = value;
        this.enabled = enabled;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public static int getMaxLength() {
        return maxLength;
    }

    public static void setMaxLength(int maxLength) {
        TextBox.maxLength = maxLength;
    }
}
