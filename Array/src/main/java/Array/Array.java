package main.java.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter array value: ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the search number: ");
        int searchNumber = scanner.nextInt();

        searchAndSwap(array, searchNumber);


        int num = 0;
        for(int i=0; i<array.length;i++){
            if(array[i] == searchNumber){
                num = i;
            }
        }
        System.out.println("The Output is"+ " "+searchNumber+ " " + "is" + " " + "at index " + num);
        System.out.println("Output array: " + Arrays.toString(array));

    }

    static void searchAndSwap(int[] arr, int searchNum) {
        int index = -1;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchNum) {
                index = i;
                break;
            }
        }


        if (index != -1 && index > 0) {
            int temp = arr[index];
            arr[index] = arr[index - 1];
            arr[index - 1] = temp;
        }
    }
}


