/**
 * This class is the Main class that serves as the entry point of our classes.
 * It has input validations.
 * It has the instance of DiskSchedulingAlgorithm.
 * Downcasting is also applied.
 */

import com.disk.scheduling.algorithm.DiskSchedulingAlgorithm;
import com.disk.scheduling.algorithm.SSTF.Sstf;
import com.disk.scheduling.algorithm.SCAN.Scan;
import com.disk.scheduling.algorithm.CSCAN.CScan;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] jobArray;
    private static int totalTrack;
    private static int curHead;
    private static int totalJob;
    private static int totalHeadMovement = 0;

    public static void main(String[] args) {
        getInput();
        DiskSchedulingAlgorithm diskSched = new DiskSchedulingAlgorithm(curHead, totalJob, totalTrack, totalHeadMovement, jobArray);
        runMenu(diskSched);
    }

    private static void getInput() {
        do {
            System.out.print("Enter Number of Tracks: ");
            totalTrack = scanner.nextInt();
            if (totalTrack <= 0) {
                System.out.println("Number of Tracks must be greater than 0!");
            }
        } while (totalTrack <= 0);

        totalTrack--;

        do {
            System.out.print("Enter Current Head Position: ");
            curHead = scanner.nextInt();
            if (curHead < 0 || curHead > totalTrack) {
                System.out.println("Current Head Position is out of range!");
            }
        } while (curHead < 0 || curHead > totalTrack);

        do {
            System.out.print("Enter Number of Jobs: ");
            totalJob = scanner.nextInt();
            if (totalJob <= 0 || totalJob > totalTrack) {
                System.out.println("Number of Jobs must be greater than 0 and less than total tracks!");
            }
        } while (totalJob <= 0 || totalJob > totalTrack);

        jobArray = new int[totalJob];
        System.out.println("\nEnter Job Positions:");
        for (int i = 0; i < totalJob; i++) {
            do {
                System.out.print("Job " + (i + 1) + " Position: ");
                jobArray[i] = scanner.nextInt();
                if (jobArray[i] == curHead) {
                    System.out.println("Job Position cannot be the same as Current Head Position!");
                }
            } while (jobArray[i] == curHead);
        }

        System.out.println("\nQueue: " + Arrays.toString(jobArray));
    }

    private static void runMenu(DiskSchedulingAlgorithm diskSched) {
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    diskSched.schedule();
                    diskSched.calculateTHM();
                    break;
                case 2:
                    Sstf sstf = new Sstf(curHead, totalJob, totalTrack, totalHeadMovement, jobArray);
                    sstf.schedule();
                    sstf.calculateTHM();
                    break;
                case 3:
                    Scan scan = new Scan(curHead, totalJob, totalTrack, totalHeadMovement, jobArray);
                    scan.schedule();
                    scan.calculateTHM();
                    break;
                case 4:
                    CScan cScan = new CScan(curHead, totalJob, totalTrack, totalHeadMovement, jobArray);
                    cScan.schedule();
                    cScan.calculateTHM();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose from the available options.");
            }
        } while (choice != 0);
    }

    private static void displayMenu() {
        System.out.println("\nOptions:");
        System.out.println("[1] FCFS");
        System.out.println("[2] SSTF");
        System.out.println("[3] SCAN");
        System.out.println("[4] CSCAN");
        System.out.println("[0] EXIT");
        System.out.print("Choose an option: ");
    }

}

