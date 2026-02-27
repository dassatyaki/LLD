package Payment;

public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(double price) {
        System.out.println("Paid " + price + " with cash");
    }
}
