package volume_calculator;
import java.util.Scanner;
public class Main {
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            double radius;
            double height;

            do {
                System.out.println("Enter the radius of the cylinder:");
                while (!sc.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a valid number for the radius:");
                    sc.next();
                }
                radius = sc.nextDouble();

                if (radius <= 0) {
                    System.out.println("Invalid input. Radius must be greater than 0.");
                }
            } while (radius <= 0);

            do {
                System.out.println("Enter the height of the cylinder:");
                while (!sc.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a valid number for the height:");
                    sc.next();
                }
                height = sc.nextDouble();

                if (height <= 0) {
                    System.out.println("Invalid input. height must be greater than 0.");
                }
            } while (height <= 0);

                CylinderVolCalcu volume = new CylinderVolCalcu(radius, height);

                printResult(volume.getVolumeOfCyl());

        }

    private static void printResult(double result) {
            System.out.println("the volume of the cylinder is " + result + " cm^3 ");
    }
}
