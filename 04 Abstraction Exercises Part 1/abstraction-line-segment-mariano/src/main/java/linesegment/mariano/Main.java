package main.java.linesegment.mariano;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coordinates of the first point (x1 y1):");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("Enter the coordinates of the second point (x2 y2):");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        LineSegment line1 = new LineSegment(x1, y1, x2, y2);
        System.out.println("Distance between points of line1: " + line1.distance());

        // Setting startsWithOrigin to true
        LineSegment.setStartsWithOrigin(true);
    }
}
