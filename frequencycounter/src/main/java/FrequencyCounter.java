package main.java;

import java.util.Scanner;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number series: ");
        String numSeries = sc.nextLine();

        System.out.print("Enter which number to count: ");
        char numCount = sc.next().charAt(0);

        int frequency = countFrequency(numSeries, numCount);

        System.out.println("The frequency of " + numCount + " in the series is " + frequency);

        sc.close();
    }

    // Function to count the frequency of a number in a series
    public static int countFrequency(String series, char target) {
        int frequency = 0;

        for (int i = 0; i < series.length(); i++) {
            if (series.charAt(i) == target) {
                frequency++;
            }
        }

        return frequency;
    }
}
