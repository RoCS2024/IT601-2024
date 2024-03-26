import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Car, 2. Motorcycle, 3. Truck:");
        int choice = sc.nextInt();

        Vehicle vehicle;

        switch (choice) {
            case 1:
                vehicle = new Car();
                break;
            case 2:
                vehicle = new Motorcycle();
                break;
            case 3:
                vehicle = new Truck();
                break;
            default:
                System.out.println("1 to 3 only.");
                return;
        }

        System.out.println("1 to start, 2 to stop: ");
        int ac = sc.nextInt();

        if (ac == 1) {
            vehicle.start();
        } else {
            vehicle.stop();
        }
    }
}