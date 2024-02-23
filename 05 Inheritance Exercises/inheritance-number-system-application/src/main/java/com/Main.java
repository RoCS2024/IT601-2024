package main.java.com;

import com.inheritance.numbersys.binary.BinaryNumberSystem;
import com.inheritance.numbersys.octal.OctalNumberSystem;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        BinaryNumberSystem binNumber = new BinaryNumberSystem(number);
        OctalNumberSystem octNumber = new OctalNumberSystem(number);

        System.out.println("The Decimal value: " + number);
        System.out.println("The Binary value: " + binNumber.convert("binary"));
        System.out.println("The Octal value: " + octNumber.convert("octal"));
    }
}
