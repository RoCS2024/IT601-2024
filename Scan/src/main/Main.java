//ITP63 PROBLEM #3

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SDS {

    public static int scanDiskScheduling(List<Integer> requests, int initialPosition) {
        Collections.sort(requests);
        int totalHeadMovement = 0;
        int currentPosition = initialPosition;
        int direction = 1;

        while (!requests.isEmpty()) {
            Integer nextRequest = findNextRequest(requests, currentPosition, direction);

            if (nextRequest != null) {
                int movement = Math.abs(currentPosition - nextRequest);
                totalHeadMovement += movement;
                currentPosition = nextRequest;

                requests.remove(nextRequest);
            }

            direction = -direction;
        }

        return totalHeadMovement;
    }

    private static Integer findNextRequest(List<Integer> requests, int currentPosition, int direction) {
        Integer nextRequest = null;

        for (Integer request : requests) {
            if ((direction == 1 && request >= currentPosition) || (direction == -1 && request <= currentPosition)) {
                if (nextRequest == null || Math.abs(request - currentPosition) < Math.abs(nextRequest - currentPosition)) {
                    nextRequest = request;
                }
            }
        }

        return nextRequest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the disk request sequence (space-separated integers): ");
        String inputSequence = scanner.nextLine();
        String[] sequenceArray = inputSequence.split("\\s+");

        List<Integer> requestsSequence = new ArrayList<>();
        for (String num : sequenceArray) {
            requestsSequence.add(Integer.parseInt(num));
        }

        System.out.print("Enter the initial head position: ");
        int initialHeadPosition = scanner.nextInt();

        int totalMovement = scanDiskScheduling(requestsSequence, initialHeadPosition);

        System.out.println("Total head movement: " + totalMovement);

        scanner.close();
    }
}