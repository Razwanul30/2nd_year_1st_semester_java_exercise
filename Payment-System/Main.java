interface PaymentMethod {
    void pay(double amount);
}

class CardPayment implements PaymentMethod {
    private String cardNumber;

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using card: " + cardNumber);
    }
}

class BikashPayment implements PaymentMethod {
    private String mobileNumber;

    public BikashPayment(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Bikash with mobile number: " + mobileNumber);
    }
}

class PaypalPayment implements PaymentMethod {
    private String email;

    public PaypalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal with email: " + email);
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentMethod cardPayment = new CardPayment("1234-5678-9012-3456");
        PaymentMethod bikashPayment = new BikashPayment("017XXXXXXXX");
        PaymentMethod paypalPayment = new PaypalPayment("user@example.com");

        cardPayment.pay(100.0);
        bikashPayment.pay(200.0);
        paypalPayment.pay(300.0);
    }
}