package scheduling;

import java.util.List;

public abstract class DiskSchedulingAlgorithm {
    protected int[] sequence;

    public DiskSchedulingAlgorithm(int[] sequence) {
        this.sequence = sequence;
    }

    public void schedule() {

    }
}

