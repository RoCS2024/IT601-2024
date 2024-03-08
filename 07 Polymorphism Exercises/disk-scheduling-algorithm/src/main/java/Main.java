import cscan.CSCAN;
import fcfs.FCFS;
import scan.SCAN;
import sstf.SSTF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the disk sequence (comma-separated): ");
        String input = scanner.nextLine();
        int[] diskSequence = Arrays.stream(input.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();

        FCFS fcfs = new FCFS(diskSequence);
        fcfs.schedule();

        SSTF sstf = new SSTF(diskSequence);
        sstf.schedule();

        SCAN scan = new SCAN(diskSequence);
        scan.schedule();

        CSCAN cscan = new CSCAN(diskSequence);
        cscan.schedule();
    }
}