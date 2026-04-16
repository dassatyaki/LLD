public class FiveHundredProcessor extends CashWithdrawalProcessor{

    @Override
    public void process(AtmMachine atmMachine, int amount) {
        Inventory inventory = atmMachine.getInventory();

        int quantity = amount / 500;
        int remainder = amount % 500;
        int numQuantity = inventory.getFiveHundredNotes();

        if(quantity <= numQuantity) {
            System.out.println(quantity + " five hundred notes issued");
            inventory.deductNotes(quantity, Note.FIVE_HUNDRED);
            nextWithdrawalProcessor.process(atmMachine, remainder);
        }
        else {
            System.out.println(numQuantity + " five hundred notes issued");
            inventory.deductNotes(numQuantity, Note.FIVE_HUNDRED);
            nextWithdrawalProcessor.process(atmMachine, remainder + (quantity - numQuantity) * 500);
        }
    }
}
