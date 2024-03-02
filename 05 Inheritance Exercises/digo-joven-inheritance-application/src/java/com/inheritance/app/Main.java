package com.inheritance.app;


import com.inheritance.app.base.Sorter;
import com.inheritance.app.extended.ExtendedSorter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> inputList = new ArrayList<>();
        System.out.println("Enter number of Objects: ");
        int obj = sc.nextInt();

        for(int i = 0; i <= obj; i++){
            System.out.println("Enter Objects:");
            String input = sc.nextLine();

            inputList.add(input);
        }


        System.out.println("Original List:");
        System.out.println(inputList);

        Sorter sorter = new Sorter(new ArrayList<>(inputList));
        sorter.sort();
        System.out.println("\nSorted List (ascending order):");
        sorter.display();

        ExtendedSorter extendedSorter = new ExtendedSorter(new ArrayList<>(inputList));
        extendedSorter.sort();
        System.out.println("\nSorted List with Duplicates Removed (ascending order):");
        extendedSorter.display();
    }
}