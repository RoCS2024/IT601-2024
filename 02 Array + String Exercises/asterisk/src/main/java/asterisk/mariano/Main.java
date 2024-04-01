package main.java.asterisk.mariano;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a string: ");
            String word = sc.nextLine();

            System.out.println("Enter a character: ");
            char character = sc.nextLine().charAt(0);
            String newString = word.replace(character, '*');

            System.out.println("New String: " + newString);
        }
}
