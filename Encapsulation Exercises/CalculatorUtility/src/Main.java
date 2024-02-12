import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] getNumbers = new double[5];

        System.out.println("\nEnter 5 numbers: \n");

        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            while (!sc.hasNextDouble()) {
                System.out.println("Please enter a valid number.");
                System.out.print("Number " + (i + 1) + ": ");
                sc.next();
            }
            getNumbers[i] = sc.nextDouble();
        }

        CalculatorUtility checker = new CalculatorUtility(getNumbers);

        System.out.println("\nAverage: " + checker.getAverage());
        System.out.println("Smallest: " + checker.getSmallest());
        System.out.println("Largest: " + checker.getLargest());
    }
}