public class IdleState extends AtmState{

    @Override
    public void insertCard(AtmMachine atmMachine, Card card) {
        System.out.println("Card has been inserted");
        atmMachine.setAtmState(new AuthenticationState());
    }
}
