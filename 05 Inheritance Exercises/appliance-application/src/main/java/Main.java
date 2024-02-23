import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Television tv = new Television(150, 2000, 2, 55);
        Computer pc = new Computer(500, 2500, 3, true);
        Refrigerator ref = new Refrigerator(200, 3000, 5, true);

        System.out.println("Enter the cost of electricity per kilowatt-hour: ");
        double cost = sc.nextDouble();

        double totalCost = tv.calculateElectricityCost(cost)
                + pc.calculateElectricityCost(cost)
                + ref.calculateElectricityCost(cost);

        System.out.println("Total electricity cost for all appliances: " + totalCost + " pesos");
    }
}
