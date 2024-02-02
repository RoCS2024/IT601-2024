package main.java.InsertElementInArray;


import java.util.Scanner;
class InsertElementInArray {

    public static void main (String[] args) {

        int array[] = new int[6];

        int location = 0;

        int value = 0;

        int max = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter 5 integer values in array: ");

        for(int i = 0; i < max; i++) {

            array[i]=scanner.nextInt();

        }

        System.out.print("\nEnter the location where you want to Insert a new value (index begins with 0) :");
        location = scanner.nextInt();

        System.out.print("\nEnter  the new value that you want to insert in Array: ");
        value = scanner.nextInt();

        for(int i = max; i >location; i--){
            array[i] = array[i-1];
        }

        array[location] = value;


        System.out.println("\nValues in Array after inserting new value "+value+" at the location "+location+" are following: ");
        for(int i = 0; i <= max; i++) {
            System.out.println(array[i]);
        }
    }

}