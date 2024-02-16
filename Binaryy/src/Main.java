import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary value: ");
        String binaryInput = scanner.nextLine();

        Binary binaryConverter = new Binary(binaryInput);

        System.out.println("Choose an option:");
        System.out.println("1. Convert to Hexadecimal");
        System.out.println("2. Convert to Octal");
        System.out.println("3. Convert to Decimal");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Hexadecimal: " + binaryConverter.toHexadecimal());
                break;
            case 2:
                System.out.println("Octal: " + binaryConverter.toOctal());
                break;
            case 3:
                System.out.println("Decimal: " + binaryConverter.toDecimal());
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid option.");
        }
    }
}