public class Binary {
    private String binaryValue;

    public Binary(String binaryValue) {
        this.binaryValue = binaryValue;
    }

    public String toHexadecimal() {
        int decimalValue = Integer.parseInt(binaryValue, 2);
        return Integer.toHexString(decimalValue).toUpperCase();
    }

    public String toOctal() {
        int decimalValue = Integer.parseInt(binaryValue, 2);
        return Integer.toOctalString(decimalValue);
    }

    public int toDecimal() {
        return Integer.parseInt(binaryValue, 2);
    }
}