public class SelectOperationState extends AtmState{

    @Override
    public void selectOperation(AtmMachine atmMachine, Operation operation, Card card, int pin) {
        if(operation.equals(Operation.VIEW_BALANCE)) {
            atmMachine.setAtmState(new ViewBalanceState());
        }
        else if(operation.equals(Operation.CHANGE_PIN)) {
            atmMachine.setAtmState(new ChangePinState());
        }
        else if(operation.equals(Operation.WITHDRAW_AMOUNT)) {
            atmMachine.setAtmState(new CashWithdrawalState());
        }
        else {
            System.out.println("Invalid operation selected");
            atmMachine.setAtmState(new SelectOperationState());
        }
    }
}
