public abstract class AtmState {
    public void insertCard(AtmMachine atmMachine, Card card){};
    public void authenticatePin(AtmMachine atmMachine, Card card, int pin) {};
    public void selectOperation(AtmMachine atmMachine, Operation operation, Card card, int pin){};
    public void viewBalance(AtmMachine atmMachine, Card card){};
    public void changePin(AtmMachine atmMachine, Card card, int pin){};
    public void withdrawAmount(AtmMachine atmMachine, Card card, int amount){};
}
