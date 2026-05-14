interface pay {
    void pay();
}

class CreditCard implements pay {
    // forgot to implement pay() BUG    

    @Override
    public void pay() {
        System.out.println("Paying with credit card");
    }
}

public class Problem2 {
    public static void main(String[] args) {
        pay paymentMethod = new CreditCard();
        paymentMethod.pay(); // This will work correctly now
    }
}
