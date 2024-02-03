package main.java;

import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter numbers : ");
        String[] inputArray = sc.nextLine().split(" ");
        int[] array = Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();


        System.out.print("Enter the number to search: ");
        int target = sc.nextInt();


        int result = binarySearch(array, target);


        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        sc.close();
    }


    private static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
