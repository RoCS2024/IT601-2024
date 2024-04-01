import java.util.Arrays;
import java.util.Scanner;

public class StringSorter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[5];

        System.out.println("Enter 5 strings: ");
        for (int i=0; i<5; i++) {
            strings[i] = sc.nextLine();
        }
        Arrays.sort(strings);
        System.out.println("\nSorted strings alphabetically: ");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}