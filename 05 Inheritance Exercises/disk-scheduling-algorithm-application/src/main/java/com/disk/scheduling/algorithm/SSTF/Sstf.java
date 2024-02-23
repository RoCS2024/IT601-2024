/**
 * This class is an extension/sub class of the base class.
 * it overrides the methods in the base class.
 * this is the Shortest Seek Time First Disk Scheduling Algorithm.
 */

package com.disk.scheduling.algorithm.SSTF;

import com.disk.scheduling.algorithm.DiskSchedulingAlgorithm;

public class Sstf extends DiskSchedulingAlgorithm {
    private int[] sstfArray;
    private int sstfCurHead;
    private int[] sstfArray2;
    private int thmSSTF;

    public Sstf(int curHead, int totalJob, int totalTrack, int totalHeadMovement, int[] jobArray) {
        super(curHead, totalJob, totalTrack, totalHeadMovement, jobArray);

        this.sstfArray = new int[totalJob];
        System.arraycopy(jobArray, 0, this.sstfArray, 0, totalJob);
        this.sstfCurHead = curHead;
        this.sstfArray2 = new int[totalJob];
        this.thmSSTF = 0;
    }

    @Override
    public void schedule() {
        System.out.print("SSTF: ");
        for (int i = 0; i < getTotalJob(); i++) {
            int index = findClosest(sstfArray, sstfCurHead);
            sstfArray2[i] = sstfArray[index];
            System.out.print(sstfArray[index] + " ");

            thmSSTF += Math.abs(sstfCurHead - sstfArray[index]);
            sstfCurHead = sstfArray[index];

            sstfArray = removeElement(sstfArray, index);
        }
        System.out.println();
    }

    @Override
    public void calculateTHM() {
        System.out.println(" ");
        System.out.println("SSTF Total Head Movement is " + thmSSTF);
        resetTotalHeadMovement();
    }

    private int findClosest(int[] array, int head) {
        int min = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            int distance = Math.abs(head - array[i]);
            if (distance < min) {
                min = distance;
                index = i;
            }
        }
        return index;
    }

    private int[] removeElement(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        return newArray;
    }
}
