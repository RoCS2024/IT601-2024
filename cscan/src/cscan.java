import java.util.*;

class cscan {

    public static void CSCAN(int arr[], int head, int disk_size) {
        int size = arr.length;
        int seek_count = 0;
        int distance, cur_track;

        Vector<Integer> left = new Vector<>();
        Vector<Integer> right = new Vector<>();
        Vector<Integer> seek_sequence = new Vector<>();

        left.add(0);
        right.add(disk_size - 1);

        for (int i = 0; i < size; i++) {
            if (arr[i] < head)
                left.add(arr[i]);
            if (arr[i] > head)
                right.add(arr[i]);
        }

        Collections.sort(left);
        Collections.sort(right);

        for (int i = 0; i < right.size(); i++) {
            cur_track = right.get(i);
            seek_sequence.add(cur_track);
            distance = Math.abs(cur_track - head);
            seek_count += distance;
            head = cur_track;
        }

        head = 0;

        seek_count += (disk_size - 1);

        for (int i = 0; i < left.size(); i++) {
            cur_track = left.get(i);
            seek_sequence.add(cur_track);
            distance = Math.abs(cur_track - head);
            seek_count += distance;
            head = cur_track;
        }

        System.out.println("Total number of seek operations = " + seek_count);

        System.out.println("Seek Sequence is");

        for (int i = 0; i < seek_sequence.size(); i++) {
            System.out.println(seek_sequence.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of jobs:");
        int size = scanner.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the track positions for each job");
        for (int i = 0; i < size; i++) {
            System.out.print("Job " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the current head position:");
        int head = scanner.nextInt();

        System.out.println("Enter the disk size:");
        int disk_size = scanner.nextInt();

        System.out.println("Initial position of head: " + head);

        CSCAN(arr, head, disk_size);

        scanner.close();
    }
}
