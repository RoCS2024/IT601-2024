package scan;

import scheduling.DiskSchedulingAlgorithm;

import java.util.Arrays;
import java.util.List;

public class SCAN extends DiskSchedulingAlgorithm {
    public SCAN(int[] sequence) {
        super(sequence);
    }

    @Override
    public void schedule() {
        System.out.println("SCAN Scheduling Algorithm");
        System.out.println("Sequence: " + Arrays.toString(sequence));

    }
}
