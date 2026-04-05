public class CardPayment implements PaymentStrategy{

    @Override
    public void makePayment(int total) {
        System.out.println("Card payment done for Rs " + total);
    }
}
