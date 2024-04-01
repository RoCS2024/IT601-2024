import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        int digit;
        while(num !=0){
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num/=10;
        }
        System.out.println("reverse: " + reverse);
    }
}