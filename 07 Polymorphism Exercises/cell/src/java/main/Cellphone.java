package main;

public class Cellphone {
    protected double load;
    private String network;
    private String model;

    public Cellphone(String network, String model) {
        this.network = network;
        this.model = model;
        this.load = 0.0;
    }

    public double getLoad() {
        return load;
    }

    public String getNetwork() {
        return network;
    }

    public String getModel() {
        return model;
    }

    public void loadMoney(double amount) {
        if (amount > 0) {
            load += amount;
            System.out.println("Loaded ₱" + amount + " to " + model + ".");
        } else {
            System.out.println("Not enough load amount. Enter a  value.");
        }
    }

    public void makeCall(String otherNetwork, int duration) {
        if (duration > 0) {
            double callCost = calculateCallCost(otherNetwork, duration);
            if (load >= callCost) {
                load -= callCost;
                System.out.println("Call made to " + otherNetwork + " for " + duration + " minutes. Cost: ₱" + callCost);
            } else {
                System.out.println("Don't have enough load. Redial again.");
            }
        } else {
            System.out.println("Invalid call. Enter a correct value.");
        }
    }

    public void sendText(String otherNetwork) {
        double textCost = calculateTextCost(otherNetwork);
        if (load >= textCost) {
            load -= textCost;
            System.out.println("Text sent to " + otherNetwork + ". Cost: ₱" + textCost);
        } else {
            System.out.println("Don't have enough load. Reload to send that text.");
        }
    }

    public void useData(double dataUsage) {
        System.out.println(model + " does not support data usage.");
    }

    private double calculateCallCost(String otherNetwork, int duration) {
        double rate = 5;
        return rate * duration;
    }

    private double calculateTextCost(String otherNetwork) {
        double rate = 1;
        return rate;
    }
}

