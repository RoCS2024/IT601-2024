package com.kyla.binarytodecimal;

import java.util.Scanner;

class BinaryToDecimalConverter {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Input a binary number: ");
        String binaryNumber = scanner.nextLine();

        scanner.close();

       
        int decimalNumber = convertToDecimal(binaryNumber);

       
        System.out.println("In decimal number system: " + decimalNumber);
    }

   
    private static int convertToDecimal(String binaryNumber) {
        int decimalNumber = 0;
        int power = 0;

    
        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            char digit = binaryNumber.charAt(i);

           
            if (digit == '1') {
                decimalNumber += Math.pow(2, power);
            }

            power++;
        }

        return decimalNumber;
    }
}