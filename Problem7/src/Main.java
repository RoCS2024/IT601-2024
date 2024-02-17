import java.util.Scanner;

public class Main {

    public static boolean isPrime(int num) {
        if (num < 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void findPrimesUpToN(int n) {
        System.out.print("Prime numbers up to " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (num < 1) {
                throw new IllegalArgumentException("Enter a positive integer.");
            }

            findPrimesUpToN(num);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

