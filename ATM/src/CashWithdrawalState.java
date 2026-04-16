public class CashWithdrawalState extends AtmState{
    @Override
    public void withdrawAmount(AtmMachine atmMachine, Card card, int amount) {
        Inventory inventory = atmMachine.getInventory();

        if(amount > card.getAccount().getBalance()) {
            System.out.println("Balance is not enough");
        }
        else if(amount > inventory.getTotal()) {
            System.out.println("Cash not available in ATM");
        }
        else {
            CashWithdrawController cashWithdrawController = new CashWithdrawController();
            cashWithdrawController.setNextProcessor();
            cashWithdrawController.fiveHundredProcessor.process(atmMachine, amount);
            card.getAccount().setBalance(card.getAccount().getBalance() - amount);
            atmMachine.setAtmState(new IdleState());
        }
    }
}
