package Payment;

public class CardPayment implements PaymentStrategy {
    @Override
    public void pay(double price) {
        System.out.println("Paid " + price + " with card");
    }
}
