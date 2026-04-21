// Interface
interface PaymentProcessor {

    // Abstract Method
    void processPayment(double amount);

    // Default Method
    default void logTransaction(String status) {
        System.out.println("Logging Transaction: " + status);
    }

    // Static Method
    static double getExchangeRate() {
        return 110.50;
    }
}

// Bkash 
class BkashProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing bKash payment of " + amount + " BDT");
    }
}

// Nagad 
class NagadProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Nagad payment of " + amount + " BDT");
    }
}

// Main Class
public class MainApp {

    public static void main(String[] args) {

        // bKash 
        PaymentProcessor bKash = new BkashProcessor();
        bKash.processPayment(5000);
        bKash.logTransaction("SUCCESS");

        System.out.println();

        // Nagad 
        PaymentProcessor nagad = new NagadProcessor();
        nagad.processPayment(3000);
        nagad.logTransaction("FAILED");

        System.out.println();

        // Static method call (Correct way)
        System.out.println("Exchange Rate: " + PaymentProcessor.getExchangeRate());
    }
}