package fcfs;

import scheduling.DiskSchedulingAlgorithm;

import java.util.Arrays;
import java.util.List;

public class FCFS extends DiskSchedulingAlgorithm {
    public FCFS(int[] sequence) {
        super(sequence);
    }

    @Override
    public void schedule() {
        System.out.println("FCFS Scheduling Algorithm");
        System.out.println("Sequence: " + Arrays.toString(sequence));

    }
}
