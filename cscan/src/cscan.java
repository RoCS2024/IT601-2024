import java.util.Arrays;
import java.util.Scanner;

public class cscan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of jobs: ");
        int numJobs = scanner.nextInt();

        System.out.print("Enter the number of tracks: ");
        int numTracks = scanner.nextInt();

        System.out.print("Enter the current head position: ");
        int head = scanner.nextInt();

        int[] jobs = new int[numJobs];
        System.out.println("Enter the track positions for each job: ");
        for (int i = 0; i < numJobs; i++) {
            System.out.print("Job " + (i + 1) + ": ");
            jobs[i] = scanner.nextInt();
        }



        int thm = 0;

        System.out.println("C-SCAN Disk Scheduling");
        int[] sortedArrCScan = Arrays.copyOf(jobs, jobs.length);
        Arrays.sort(sortedArrCScan);

        int startCScan = 0;
        for (int i = 0; i < sortedArrCScan.length; i++) {
            if (sortedArrCScan[i] > head) {
                startCScan = i;
                break;
            }
        }


        for (int i = startCScan; i < sortedArrCScan.length; i++) {
            System.out.println("Move head to track " + sortedArrCScan[i] + ",  movement: " + Math.abs(head - sortedArrCScan[i]));
            thm += Math.abs(head - sortedArrCScan[i]);
            head = sortedArrCScan[i];
        }


        for (int i = 0; i < startCScan; i++) {
            System.out.println("Move head to track " + sortedArrCScan[i] + ",  movement: " + Math.abs(head - sortedArrCScan[i]));
            thm += Math.abs(head - sortedArrCScan[i]);
            head = sortedArrCScan[i];
        }

        System.out.println("Total Head Movement: " + thm);
        scanner.close();
    }
}

