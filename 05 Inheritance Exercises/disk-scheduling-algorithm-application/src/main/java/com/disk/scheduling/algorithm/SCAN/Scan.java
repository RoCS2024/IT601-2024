/**
 * This class is an extension/sub class of the base class.
 * it overrides the methods in the base class.
 * this is the SCAN Disk Scheduling Algorithm.
 */

package com.disk.scheduling.algorithm.SCAN;

import com.disk.scheduling.algorithm.DiskSchedulingAlgorithm;

import java.util.Arrays;

public class Scan extends DiskSchedulingAlgorithm {
    private int[] scanArray;
    private int[] scanArray2;
    private int thmSCAN;

    public Scan(int curHead, int totalJob, int totalTrack, int totalHeadMovement, int[] jobArray) {
        super(curHead, totalJob, totalTrack, totalHeadMovement, jobArray);
        initializeArrays();
    }

    private void initializeArrays() {
        scanArray = Arrays.copyOf(getJobArray(), getTotalJob());
        scanArray2 = new int[getTotalJob()];
        thmSCAN = 0;
    }

    @Override
    public void schedule() {
        int num1 = 0;
        int num2 = 0;
        int scanCurHead = getCurHead();

        for (int i = 0; i < scanArray.length; i++) {
            if (scanArray[i] > scanCurHead) {
                num1++;
            } else {
                num2++;
            }
        }

        int[] Array1 = new int[num1];
        int[] Array2 = new int[num2];
        int a = 0, b = 0, c = 0;

        for (int i = 0; i < scanArray.length; i++) {
            if (scanArray[i] > scanCurHead) {
                Array1[b] = scanArray[i];
                b++;
            } else {
                Array2[c] = scanArray[i];
                c++;
            }
        }

        Arrays.sort(Array1);
        Arrays.sort(Array2);
        reverse(Array2);

        for (int i = 0; i < Array1.length; i++) {
            scanArray2[i] = Array1[i];
            a = i;
        }

        for (int i = 0; i < Array2.length; i++) {
            a++;
            scanArray2[a] = Array2[i];
        }

        System.out.print("SCAN: ");
        for (int i = 0; i < scanArray2.length; i++) {
            System.out.print(scanArray2[i] + " ");
        }
        System.out.println();
    }

    @Override
    public void calculateTHM() {
        int scanCurHead = getCurHead();
        for (int i = 0; i < scanArray2.length; i++) {
            thmSCAN += Math.abs(scanCurHead - scanArray2[i]);
            scanCurHead = scanArray2[i];
        }
        System.out.println("SCAN Total Head Movement is " + thmSCAN);
        resetTotalHeadMovement();
    }

    private static void reverse(int[] array) {
        int n = array.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }
}
