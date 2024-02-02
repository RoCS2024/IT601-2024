package com.aiah.binary.to.hexadecimal;

import java.util.Scanner;

public class BinaryToHexadecimal {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();
        
        String hexadecimal = binaryToHexadecimal(binary);
        
        System.out.println("Hexadecimal equivalent: " + hexadecimal);
        
        sc.close();
    }
    
	public static String binaryToHexadecimal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        String hexadecimal = Integer.toHexString(decimal);
        
        return hexadecimal;
    }
}