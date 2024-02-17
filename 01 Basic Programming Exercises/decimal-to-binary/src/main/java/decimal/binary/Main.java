package main.java.decimal.binary;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal, mod, binaryNum2;
        double num=0.1, binaryNum=0;

        System.out.print("Input a Decimal Number: ");
        decimal = sc.nextInt();


        while (decimal > 0)
        {
            num = num*10;
            mod = decimal % 2;
            if (mod != 0) {
                binaryNum = binaryNum + num;
            }
            decimal = decimal / 2;
        }

        binaryNum2 = (int)Math.floor(binaryNum);
        System.out.print("In Binary System " + binaryNum2);
    }
}
