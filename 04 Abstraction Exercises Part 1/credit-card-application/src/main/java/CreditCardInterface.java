import java.util.*;

public class CreditCardInterface {
    public static void main(String[] args) {
        CreditCardInterface cci = new CreditCardInterface();
        Scanner sc = new Scanner(System.in);
        run(cci, sc);

        System.out.print("Enter credit limit for all credit cards: ");
        double creditLimit = sc.nextDouble();
        CreditCard.setCreditLimit(creditLimit);


        List<CreditCard> creditCards = new ArrayList<>();
        creditCards.add(new CreditCard("CT21-0122", "(Principal Holder)Conrad Martinez", "555", "12/24"));
        creditCards.add(new CreditCard("CT22-0158", "(Supplementary Holder) Kyle Matalog", "666", "06/25"));

        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("\nAvailable Credit Cards:");
            for (int i = 0; i < creditCards.size(); i++) {
                System.out.println(i + 1 + ". " + creditCards.get(i).getOwnerName());
            }

            int cardIndex;

            do {
                System.out.print("Select a credit card (1-" + creditCards.size() + "): ");
                cardIndex = sc.nextInt();

            } while (cardIndex < 1 || cardIndex > creditCards.size());

            CreditCard selectedCard = creditCards.get(cardIndex - 1);

            System.out.println("\nCredit Card Details:");
            System.out.println("Account Number: " + selectedCard.getAccountNumber());
            System.out.println("Owner's Name: " + selectedCard.getOwnerName());
            System.out.println("CVV: " + selectedCard.getCvv());
            System.out.println("Expiration Date: " + selectedCard.getExpirationDate());
            System.out.println("Credit Limit: " + CreditCard.getCreditLimit());
            System.out.println("Balance: " + selectedCard.getBalance());

            System.out.print("\nEnter amount to charge: ");
            double chargeAmount = sc.nextDouble();
            selectedCard.charge(chargeAmount);

            System.out.print("Enter amount to pay the bill: ");
            double paymentAmount = sc.nextDouble();
            selectedCard.payBill(paymentAmount);

            System.out.print("Do you want to continue? (1 if yes/ 2 if no): ");
            String userChoice = sc.next().toLowerCase();

            continueProgram = userChoice.equals("1");
        }

        System.out.println("Program terminated. Thank you!");
        sc.close();
    }

    private static void run(CreditCardInterface cci, Scanner sc) {
    }
}

