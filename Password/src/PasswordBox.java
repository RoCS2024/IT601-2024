public class PasswordBox {
    private static char maskCharacter = '*';
    private String value = "";
    private boolean shown = false;
    private int length;

    public PasswordBox(int length) {
        this.length = length;
    }

    public String getValue() {
        return value;
    }

    public void toggleShown() {
        shown = !shown;
    }

    public void appendChar(char c) {
        if (value.length() < length) {
            value += c;
        }
    }

    public String getMaskedValue() {
        if (shown) {
            return value;
        } else {
            return "*".repeat(value.length());
        }
    }
}