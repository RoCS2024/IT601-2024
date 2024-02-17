import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the Second Number: ");
        int num2 = scanner.nextInt();

        int hcf = calculateHCF(num1, num2);

        System.out.println("The Highest Common Factor (HCF) of " + num1 + " and " + num2 + " is: " + hcf);
    }
    private static int calculateHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
