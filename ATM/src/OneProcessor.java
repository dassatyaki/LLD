public class OneProcessor extends CashWithdrawalProcessor{
    @Override
    public void process(AtmMachine atmMachine, int amount) {
        Inventory inventory = atmMachine.getInventory();

        int quantity = amount;
        int numQuantity = inventory.getOneNotes();

        if(quantity <= numQuantity) {
            System.out.println(quantity + " one notes issued");
            inventory.deductNotes(quantity, Note.ONE);
        }
        else {
            System.out.println(numQuantity + " one notes issued");
            inventory.deductNotes(numQuantity, Note.ONE);
        }
    }
}
