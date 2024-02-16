public class Binary {
    private String binaryValue;

    public Binary(String binaryValue) {
        this.binaryValue = binaryValue;
    }

    public String toHexadecimal() {
        int decimalValue = binaryToDecimal(binaryValue);
        return decimalToHexadecimal(decimalValue);
    }

    public String toOctal() {
        int decimalValue = binaryToDecimal(binaryValue);
        return decimalToOctal(decimalValue);
    }

    public int toDecimal() {
        return binaryToDecimal(binaryValue);
    }

    private int binaryToDecimal(String binaryValue) {
        int decimalValue = 0;
        int binaryLength = binaryValue.length();

        for (int i = 0; i < binaryLength; i++) {
            int digit = binaryValue.charAt(i) - '0';
            decimalValue += digit * Math.pow(2, binaryLength - 1 - i);
        }

        return decimalValue;
    }

    private String decimalToHexadecimal(int decimalValue) {
        StringBuilder hexadecimal = new StringBuilder();

        while (decimalValue > 0) {
            int remainder = decimalValue % 16;
            char hexDigit = (char) (remainder < 10 ? remainder + '0' : remainder - 10 + 'A');
            hexadecimal.insert(0, hexDigit);
            decimalValue /= 16;
        }

        return hexadecimal.toString();
    }

    private String decimalToOctal(int decimalValue) {
        StringBuilder octal = new StringBuilder();

        while (decimalValue > 0) {
            int remainder = decimalValue % 8;
            octal.insert(0, remainder);
            decimalValue /= 8;
        }

        return octal.toString();
    }
}
