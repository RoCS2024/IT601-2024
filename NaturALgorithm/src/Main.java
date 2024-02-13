//ITP64 PROBLEM #12

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        double naturalLogarithm = computeNaturalLogarithm(n);

        System.out.println("Natural logarithm is " + naturalLogarithm);

        scanner.close();
    }

    public static double computeNaturalLogarithm(int n) {
        double result = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                result -= 1.0 / i;
            } else {
                result += 1.0 / i;
            }
        }

        return result;
    }
}