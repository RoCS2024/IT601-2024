import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first number
        System.out.print("Enter the Number 1: ");
        int num1 = scanner.nextInt();

        // Input for the second number
        System.out.print("Enter the Number 2: ");
        int num2 = scanner.nextInt();

        // Calculate and display the LCM
        int lcm = calculateLCM(num1, num2);
        System.out.println("Lowest Common Multiple is: " + lcm);
    }

    // Function to find the LCM of two numbers
    private static int calculateLCM(int a, int b) {
        int max = Math.max(a, b);
        int lcm = max;

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                break;
            }
            lcm += max;
        }

        return lcm;
    }
}
