public class FiftyProcessor extends CashWithdrawalProcessor{
    @Override
    public void process(AtmMachine atmMachine, int amount) {
        Inventory inventory = atmMachine.getInventory();

        int quantity = amount / 50;
        int remainder = amount % 50;
        int numQuantity = inventory.getFiftyNotes();

        if(quantity <= numQuantity) {
            System.out.println(quantity + " fifty notes issued");
            inventory.deductNotes(quantity, Note.FIFTY);
            nextWithdrawalProcessor.process(atmMachine, remainder);
        }
        else {
            System.out.println(numQuantity + " fifty notes issued");
            inventory.deductNotes(numQuantity, Note.FIFTY);
            nextWithdrawalProcessor.process(atmMachine, remainder + (quantity - numQuantity) * 50);
        }
    }
}
