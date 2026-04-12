public class Card {
    private String cardNumber;
    private int pin;
    private BankAccount account;

    public Card(String cardNumber, BankAccount account, int pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.account = account;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public boolean validatePin(int pin) {
        return this.pin == pin;
    }

    public BankAccount getAccount() {
        return account;
    }
}
