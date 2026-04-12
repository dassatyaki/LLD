public class ViewBalanceState extends AtmState{

    @Override
    public void viewBalance(AtmMachine atmMachine, Card card) {
        System.out.println("Current balance of user is " + card.getAccount().getBalance());
        atmMachine.setAtmState(new SelectOperationState());
    }
}
