package com.kyla.binarytodeci;

import java.util.Scanner;

class Binarytodecimal {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int binary, mod, decimalNum=0, num=1;
		
		System.out.print("Input a Binary Number: ");
		binary = sc.nextInt();
		

		while (binary > 0) 
		{
			mod = binary % 10;	
			if (mod != 0) {
				decimalNum = decimalNum + num;
			}
			binary = binary / 10;
			num = num*2;
		}

		System.out.print("In Decimal Number System " + decimalNum);
		
	}
}