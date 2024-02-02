package main.java.GCD;

import java.util.Scanner;

    public class GCD {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num1 ;
            int num2 ;

            System.out.print("Enter Number: ");
            num1 = sc.nextInt();
            System.out.print("Enter Number: ");
            num2 = sc.nextInt();



            int gcd = findGCD(num1, num2);
            System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        }

        public static int findGCD(int num1, int num2) {
            while (num2 != 0) {
                int temp = num2;
                num2 = num1 % num2;
                num1 = temp;
            }
            return num1;
        }
    }
