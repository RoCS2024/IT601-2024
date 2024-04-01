/**
 * This class is an extension/sub class of the base class.
 * it overrides the methods in the base class.
 * this is the CSCAN Disk Scheduling Algorithm.
 */

package com.disk.scheduling.algorithm.CSCAN;

import com.disk.scheduling.algorithm.DiskSchedulingAlgorithm;

import java.util.Arrays;

public class CScan extends DiskSchedulingAlgorithm {
    private int[] cscanArray;
    private int[] cscanArray2;
    private int cscanCurHead;
    private int thmCSCAN;

    public CScan(int curHead, int totalJob, int totalTrack, int totalHeadMovement, int[] jobArray) {
        super(curHead, totalJob, totalTrack, totalHeadMovement, jobArray);
        initializeArrays();
    }

    private void initializeArrays() {
        cscanArray = Arrays.copyOf(getJobArray(), getTotalJob());
        cscanArray2 = cscanArray2;
        cscanCurHead = getCurHead();
        thmCSCAN = 0;
    }

    @Override
    public void schedule() {
        int newValue = getTotalTrack();
        int newValue2 = 0;
        cscanArray2 = addElement(cscanArray, newValue, newValue2);

        for (int i = 0; i < cscanArray2.length; i++) {
            if (cscanArray2[i] > cscanCurHead) {
                cscanArray2[i] = cscanArray2[i] - cscanCurHead;
            } else {
                cscanArray2[i] = cscanArray2[i] + getTotalTrack();
            }
        }
        Arrays.sort(cscanArray2);

        for (int i = 0; i < cscanArray2.length; i++) {
            if (cscanArray2[i] < getTotalTrack()){
                cscanArray2[i] = cscanArray2[i] + cscanCurHead;
            }
            else {
                cscanArray2[i] = cscanArray2[i] - getTotalTrack();
            }
        }

        System.out.print("CSCAN: ");
        for (int i = 0; i < cscanArray.length; i++) {
            System.out.print(cscanArray[i] + " ");
        }
    }

    @Override
    public void calculateTHM() {
        for (int i = 0; i < cscanArray2.length; i++) {
            thmCSCAN = thmCSCAN + Math.abs(cscanArray2[i] - cscanCurHead);
            cscanCurHead = cscanArray2[i];
        }
        System.out.println(" ");
        System.out.println("CSCAN Total Head Movement: " + thmCSCAN);
        resetTotalHeadMovement();
    }

    private static int[] addElement(int[] array, int element, int element2) {
        int[] newArray = Arrays.copyOf(array, array.length + 2);
        newArray[array.length] = element;
        newArray[array.length + 1] = element2;
        return newArray;
    }
}
