package sstf;

import scheduling.DiskSchedulingAlgorithm;

import java.util.Arrays;
import java.util.List;

public class SSTF extends DiskSchedulingAlgorithm {
    public SSTF(int[] sequence) {
        super(sequence);
    }

    @Override
    public void schedule() {
        System.out.println("SSTF Scheduling Algorithm");
        System.out.println("Sequence: " + Arrays.toString(sequence));

    }
}

