public class ExitGate {
    Billing billing;
    PaymentStrategy paymentStrategy;

    public ExitGate() {
        billing = new Billing();
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void unPark(Ticket ticket, int exitTime, PaymentStrategy paymentStrategy) {
        double price = billing.calculatePrice(ticket, exitTime);
        setPaymentStrategy(paymentStrategy);
        paymentStrategy.pay(price);
        ticket.getFloor().getSpot(ticket.getSpotId()).freeSpot();
    }
}
