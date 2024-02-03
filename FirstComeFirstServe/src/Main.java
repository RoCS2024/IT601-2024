import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of disk requests: ");
            int numRequests = scanner.nextInt();

            if (numRequests <= 0) {
                throw new IllegalArgumentException("Number of requests should be greater than 0.");
            }

            int[] requests = new int[numRequests];

            System.out.println("Enter the disk requests:");
            for (int i = 0; i < numRequests; i++) {
                requests[i] = scanner.nextInt();
            }

            System.out.print("Enter the initial head position: ");
            int initialHead = scanner.nextInt();

            // Calculate total head movement using FCFS algorithm
            int totalHeadMovement = calculateFCFS(requests, initialHead);

            System.out.println("Order of tasks in FCFS: ");
            for (int task : requests) {
                System.out.print(task + " ");
            }



            System.out.println("Total head movement using FCFS: " + totalHeadMovement);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int calculateFCFS(int[] requests, int initialHead) {
        int totalHeadMovement = 0;
        int currentHead = initialHead;

        for (int i = 0; i < requests.length; i++) {
            // Calculate head movement for the current request
            int movement = Math.abs(currentHead - requests[i]);
            totalHeadMovement += movement;

            // Update current head position
            currentHead = requests[i];
        }

        return totalHeadMovement;
    }
}
