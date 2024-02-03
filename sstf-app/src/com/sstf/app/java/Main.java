package com.sstf.app.java;

import java.util.Scanner;

public class Main {

    static void sum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        System.out.println(sum);
    }

    static void print(int[] array) {
        for (int value : array) {
            System.out.print(" " + value);
        }
    }

    static int minIndex(int[][] hold, int length) {
        int minIndex = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < length; i++) {
            int currentNumber = hold[i][1];
            if (hold[i][1] != -1 && currentNumber != 0 && currentNumber < minDistance) {
                minDistance = currentNumber;
                minIndex = i;
            }
        }
        return minIndex;
    }

    static void sstf(int[] jobArray, int chp) {
        int length = jobArray.length;
        int[][] hold = new int[length][2];
        int[] sstf = new int[length];
        int[] thm = new int[length];

        for (int i = 0; i < length; i++) {
            hold[i][0] = jobArray[i];
        }

        int head = chp;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (hold[j][1] != -1) {
                    hold[j][1] = Math.abs(head - hold[j][0]);
                }
            }
            int minIndex = minIndex(hold, length);
            head = hold[minIndex][0];
            hold[minIndex][1] = -1;
            sstf[i] = head;
        }

        System.out.println();
        System.out.print("SSTF: ");
        print(sstf);

        int temp = sstf[0] - chp;
        for (int i = 1; i < length; i++) {
            thm[i] = Math.abs(sstf[i] - sstf[i - 1]);
        }
        thm[0] = temp;

        System.out.print(" THM: ");
        sum(thm);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of jobs: ");
        int jobs = sc.nextInt();

        System.out.print("Enter the number of tracks: ");
        int tracks = sc.nextInt();

        System.out.print("Enter the current head position: ");
        int chp = sc.nextInt();

        int[] jobArray = new int[jobs];
        for (int i = 0; i < jobs; i++) {
            System.out.print("Enter Job " + (i + 1) + ": ");
            jobArray[i] = sc.nextInt();

            if (jobArray[i] > tracks) {
                i--;
                System.out.println("Job above tracks! Maximum track is: " + tracks);
            }
        }

        sstf(jobArray, chp);
    }
}
