public class CashPayment implements PaymentStrategy{

    @Override
    public void makePayment(int total) {
        System.out.println("Cash payment done for Rs " + total);
    }
}
