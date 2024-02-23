import java.util.Scanner;

public class Appliance {
    private double wattage;
    private double price;
    private int warranty;

    public Appliance(double wattage, double price, int warranty) {
        this.wattage = wattage;
        this.price = price;
        this.warranty = warranty;
    }

    public double getWattage() {
        return wattage;
    }

    public double getPrice() {
        return price;
    }

    public int getWarranty() {
        return warranty;
    }

    public double calculateElectricityCost(double costPerKilowattHour) {
        double usageHoursPerDay = getUsageHoursPerDay();
        double kilowattHoursPerDay = (wattage * usageHoursPerDay) / 1000;
        return kilowattHoursPerDay * costPerKilowattHour;
    }

    public static double getUsageHoursPerDay() {
        return 0;
    }
}

class Television extends Appliance {
    private int screenSize;

    public Television(double wattage, double price, int warranty, int screenSize) {
        super(wattage, price, warranty);
        this.screenSize = screenSize;
    }

    public static double getUsageHoursPerDay() {
        return 4.5;
    }
}

class Computer extends Appliance {
    private boolean isGaming;

    public Computer(double wattage, double price, int warranty, boolean isGaming) {
        super(wattage, price, warranty);
        this.isGaming = isGaming;
    }

    public static double getUsageHoursPerDay() {
        return 6.0;
    }
}

class Refrigerator extends Appliance {
    private boolean hasFreezer;

    public Refrigerator(double wattage, double price, int warranty, boolean hasFreezer) {
        super(wattage, price, warranty);
        this.hasFreezer = hasFreezer;
    }

    public static double getUsageHoursPerDay() {
        return 24.0;
    }
}