package main.java.exponent.mariano;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int base,exponent;
        System.out.print("Enter base: ");
        base = sc.nextInt();
        System.out.print("Enter exponent: ");
        exponent = sc.nextInt();

        int result = 1;
        for(int i = 0; i<exponent; i++){
            result = result *base;
        }
        System.out.print(base + " raised to " + exponent + " is " + result);
    }
}
