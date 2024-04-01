/**
 * This class represents a Java class named DiskSchedulingAlgorithm.
 * by default the class implements the First Come First Serve Disk Scheduling Algorithm.
 */

package com.disk.scheduling.algorithm;

import java.util.Arrays;

public class DiskSchedulingAlgorithm {
    private int curHead;
    private int totalJob;
    private int totalTrack;
    private int totalHeadMovement;
    private int[] jobArray = new int[totalJob];

    public DiskSchedulingAlgorithm(int curHead, int totalJob, int totalTrack, int totalHeadMovement, int[] jobArray) {
        this.curHead = curHead;
        this.totalJob = totalJob;
        this.totalTrack = totalTrack;
        this.totalHeadMovement = totalHeadMovement;
        this.jobArray = jobArray;
    }

    public int getCurHead() {
        return curHead;
    }

    public void setCurHead(int curHead) {
        this.curHead = curHead;
    }

    public int getTotalJob() {
        return totalJob;
    }


    public int getTotalTrack() {
        return totalTrack;
    }


    public int[] getJobArray() {
        return jobArray;
    }


    public void schedule () {
        for(int i = 0; i<jobArray.length; i++){
            System.out.print(jobArray[i] + " ");
        }
    }

    public void calculateTHM() {
        int fcfsCurHead = curHead;
        for(int i = 0; i<jobArray.length; i++){
            totalHeadMovement = totalHeadMovement + Math.abs(fcfsCurHead - jobArray[i]);
            fcfsCurHead = jobArray[i];
        }
        System.out.println(" ");
        System.out.println("FCFS Total Head Movement is " + totalHeadMovement);
        resetTotalHeadMovement(); // Reset total head movement
    }

    public void resetTotalHeadMovement() {
        totalHeadMovement = 0;
        jobArray = Arrays.copyOf(jobArray, jobArray.length);
    }
}