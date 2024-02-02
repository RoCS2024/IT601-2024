import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner factor = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = factor.nextInt();

        System.out.print("The factors of " + num + " are: ");

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " , ");
            }
        }
        factor.close();
    }
}