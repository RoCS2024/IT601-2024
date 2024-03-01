class CreditCard {
    private static double creditLimit;
    private String accountNumber;
    private String ownerName;
    private String cvv;
    private String expirationDate;
    private double balance;

    public CreditCard(String accountNumber, String ownerName, String cvv, String expirationDate) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
        this.balance = 0.0;
    }

    public static void setCreditLimit(double limit) {
        creditLimit = limit;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getCvv() {
        return cvv;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public double getBalance() {
        return balance;
    }

    public boolean charge(double amount) {
        if (balance + amount <= creditLimit) {
            balance += amount;
            return true;
        } else {
            System.out.println("Exceeded credit limit. Transaction failed.");
            return false;
        }
    }

    public void payBill(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Payment successful. Remaining balance: " + balance);
        } else {
            System.out.println("Invalid payment amount or insufficient balance.");
        }
    }

    public static double getCreditLimit() {
        return creditLimit;
    }
}
