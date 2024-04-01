import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inputString = scanner.nextLine();

        int spaceCount = 0;
        StringBuilder spaceIndices = new StringBuilder("Space indices: ");

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == ' ') {
                spaceCount++;
                spaceIndices.append(i).append(" ");
            }
        }
        System.out.println("Number of spaces: " + spaceCount);
        System.out.println(spaceIndices.toString());
    }
}