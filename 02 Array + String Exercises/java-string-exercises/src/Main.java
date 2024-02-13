import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input for array elements
        int[] array = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input for the element to search
        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();

        // Perform Sentinel Search
        int index = performSentinelSearch(array, key);

        // Display the result
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    // Function to perform Sentinel Search in an array
    private static int performSentinelSearch(int[] array, int key) {
        int lastElement = array[array.length - 1];
        array[array.length - 1] = key;

        int i = 0;
        while (array[i] != key) {
            i++;
        }

        array[array.length - 1] = lastElement; // Restore the original last element

        return (i < array.length - 1 || array[i] == key) ? i : -1;
    }
}
