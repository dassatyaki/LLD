public class HundredProcessor extends CashWithdrawalProcessor{
    @Override
    public void process(AtmMachine atmMachine, int amount) {
        Inventory inventory = atmMachine.getInventory();

        int quantity = amount / 100;
        int remainder = amount % 100;
        int numQuantity = inventory.getHundredNotes();

        if(quantity <= numQuantity) {
            System.out.println(quantity + " hundred notes issued");
            inventory.deductNotes(quantity, Note.HUNDRED);
            nextWithdrawalProcessor.process(atmMachine, remainder);
        }
        else {
            System.out.println(numQuantity + " hundred notes issued");
            inventory.deductNotes(numQuantity, Note.HUNDRED);
            nextWithdrawalProcessor.process(atmMachine, remainder + (quantity - numQuantity) * 100);
        }
    }
}
