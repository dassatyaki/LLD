public class AuthenticationState extends AtmState{
    @Override
    public void authenticatePin(AtmMachine atmMachine, Card card, int pin) {
        boolean validatePin = card.validatePin(pin);

        if(validatePin) {
            System.out.println("Entered pin is correct. Proceed to select operation");
            atmMachine.setAtmState(new SelectOperationState());
        }
        else {
            System.out.println("Wrong pin entered");
            atmMachine.setAtmState(new IdleState());
        }
    }
}
