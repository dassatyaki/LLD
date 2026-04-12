public class ChangePinState extends AtmState {

    @Override
    public void changePin(AtmMachine atmMachine, Card card, int pin) {
        card.setPin(pin);
        System.out.println("Pin has been changed");
        atmMachine.setAtmState(new IdleState());
    }
}
