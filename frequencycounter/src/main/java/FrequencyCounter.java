package main.java;

import java.util.Scanner;

public class frequencycounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number series: ");
        int numSeries = sc.nextInt();

        System.out.print("Enter which number to count: ");
        int numCount = sc.nextInt();

        int frequency = countFrequency(numSeries, numCount);

        System.out.println("The frequency of " + numCount + " in the series is " + frequency);

        sc.close();
    }

    public static int countFrequency(int numberSeries, int target) {
        int frequency = 0;

        while (numberSeries > 0) {
            if (numberSeries % 10 == target) {
                frequency++;
            }
            numberSeries /= 10;
        }

        return frequency;
    }
}
