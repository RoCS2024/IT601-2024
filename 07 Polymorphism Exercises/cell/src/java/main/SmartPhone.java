package main;

public class SmartPhone extends Cellphone {
    public SmartPhone(String network, String model) {
        super(network, model);
    }

    @Override
    public void useData(double dataUsage) {
        if (dataUsage > 0) {
            double dataCost = calculateDataCost(dataUsage);
            if (load >= dataCost) {
                load -= dataCost;
                System.out.println("Data used: " + dataUsage + " GB. Cost: ₱" + dataCost);
            } else {
                System.out.println("Not enough load. Please reload to use data.");
            }
        } else {
            System.out.println("Not enough data usage. Enter a value.");
        }
    }

    private double calculateDataCost(double dataUsage) {
        double rate = 50;
        return rate * dataUsage;
    }
}
