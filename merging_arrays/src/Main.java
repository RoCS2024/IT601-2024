import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main (String[] args) {
        Scanner merge = new Scanner(System.in);
        System.out.print("Enter values for the first array (use comma to separate): ");
        int[] a1 = readIntArray(merge);

        System.out.print("Enter values for the second array (use comma to separate): ");
        int[] a2 = readIntArray(merge);
        int[] ma = mergeArrays(a1, a2);

        System.out.println("New Array: " + Arrays.toString(ma));
        merge.close();
    }
    public static int[] readIntArray(Scanner merge) {
        String input = merge.nextLine();
        String[] values = input.split(",");
        int[] array = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            array[i] = Integer.parseInt(values[i].trim());
        }
        return array;
    }
    public static int[] mergeArrays(int[] a1, int[] a2) {
        Set<Integer> uniqueElements = new HashSet<>();
        for (int num : a1) {
            uniqueElements.add(num);
        }

        for (int num : a2) {
            uniqueElements.add(num);
        }

        int[] mergedArray = new int[uniqueElements.size()];
        int index = 0;

        for (int num : uniqueElements) {
            mergedArray[index++] = num;
        }

        return mergedArray;
    }
}