public class Cellphone {
    private double prepaidLoad;

    public Cellphone() {
        prepaidLoad = 0.0;
    }

    public void loadPrepaid(double amount) {
        prepaidLoad += amount;
        System.out.println("Prepaid load of $" + amount + " added successfully. Current balance: ₱" + prepaidLoad);
    }

    public boolean makeCall(double minutes) {
        double callCost = minutes * 5;
        if (prepaidLoad >= callCost) {
            prepaidLoad -= callCost;
            System.out.println("Call made for " + minutes + " minutes. Remaining balance: ₱" + prepaidLoad);
            return true;
        } else {
            System.out.println("Insufficient balance. Please load more prepaid credits.");
            return false;
        }
    }

    public boolean sendText() {
        double textCost = 1;
        if (prepaidLoad >= textCost) {
            prepaidLoad -= textCost;
            System.out.println("Text message sent. Remaining balance: ₱" + prepaidLoad);
            return true;
        } else {
            System.out.println("Insufficient balance. Please load more prepaid credits.");
            return false;
        }
    }

    public double getPrepaidLoad() {
        return prepaidLoad;
    }
}
