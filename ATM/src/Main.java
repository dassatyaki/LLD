public class Main {
    public static void main(String[] args) {
        AtmMachine atm = AtmMachine.getInstance();
        Inventory inventory = atm.getInventory();

        inventory.addNotes(Note.FIVE_HUNDRED, 100);
        inventory.addNotes(Note.HUNDRED, 200);
        inventory.addNotes(Note.FIFTY, 500);
        inventory.addNotes(Note.ONE, 1000);

        CashWithdrawController cashWithdrawController = new CashWithdrawController();
        cashWithdrawController.setNextProcessor();

        BankAccount bankAccount = new BankAccount("12345", 10000);
        Card card = new Card("11111", bankAccount, 1234);
        User user = new User(0, card);

        AtmState atmState = atm.getAtmState();
        atmState.insertCard(atm, card);
        atmState.authenticatePin(atm, card, 1234);
        atmState.selectOperation(atm, Operation.VIEW_BALANCE, card, 1234);
        atmState.viewBalance(atm, card);
    }
}
