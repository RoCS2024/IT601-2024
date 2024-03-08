package cscan;

import scheduling.DiskSchedulingAlgorithm;

import java.util.Arrays;
import java.util.List;

public class CSCAN extends DiskSchedulingAlgorithm {
    public CSCAN(int[] sequence) {
        super(sequence);
    }

    @Override
    public void schedule() {
        System.out.println("SCAN Scheduling Algorithm");
        System.out.println("Sequence: " + Arrays.toString(sequence));

    }
}
