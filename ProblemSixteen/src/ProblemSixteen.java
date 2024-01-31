import java.util.Scanner;

public class ProblemSixteen {
    public static void main(String[] args) {
        System.out.println("1s complement");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String biNum = decimalToBinary(num);
        String onesCompBi = findOnesComplement(biNum);
        int onesCompDec = binaryToDecimal(onesCompBi);
        System.out.println("1s complement: " + onesCompDec);
    }
    public static String decimalToBinary(int num) {
        return Integer.toBinaryString(num);
    }
    public static String findOnesComplement(String biNum) {
        StringBuilder onesComplement = new StringBuilder();
        for (int i = 0; i < biNum.length(); i++) {
            char bit = biNum.charAt(i);
            if (bit == '0') {
                onesComplement.append('1');
            } else if (bit == '1') {
                onesComplement.append('0');
            } else {
                // If the input is not a binary number, return an error message
                return "Invalid input. Please enter a binary number.";
            }
        }
        return onesComplement.toString();
    }
    public static int binaryToDecimal(String biNum) {
        return Integer.parseInt(biNum, 2);
    }
}