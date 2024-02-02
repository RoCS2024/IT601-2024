package com.roselle;

import java.util.Scanner;

class testing{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	String word;
	char character;
	
	System.out.println("Enter a string: ");
        word = sc.nextLine();
        System.out.println("Enter a character: ");
        character = sc.nextLine().charAt(0); 

        switch (Character.toLowerCase(character)) {
            case 't':
                System.out.println("New String: " + word.replace('t', '*'));
                break;
            default:
                System.out.println("New String: " + word);
   		 }	
	}
}