public class Cellphone {
    private double prepaidLoad;

    public Cellphone() {
        prepaidLoad = 0.0;
    }

    public void loadPrepaid(double amount) {
        prepaidLoad += amount;
        System.out.println("Prepaid load of ₱" + amount + " added successfully. Current balance: ₱" + prepaidLoad);
    }

    public void makeCall(double minutes) {
        double callCost = minutes * 5;
        prepaidLoad -= callCost;
        System.out.println("Call made for " + minutes + " minutes. Remaining balance: ₱" + prepaidLoad);
    }

    public void sendText() {
        double textCost = 1;
        prepaidLoad -= textCost;
        System.out.println("Text message sent. Remaining balance: ₱" + prepaidLoad);
    }

    public double getPrepaidLoad() {
        return prepaidLoad;
    }
}
