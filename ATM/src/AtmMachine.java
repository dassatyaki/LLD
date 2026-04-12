public class AtmMachine {
    private static volatile AtmMachine atmMachine;
    private Inventory inventory;
    private AtmState atmState;

    private AtmMachine() {
        inventory = new Inventory();
        atmState = new IdleState();
    }

    public static AtmMachine getInstance() {
        if(atmMachine == null) {
            synchronized (AtmMachine.class) {
                if(atmMachine == null) {
                    atmMachine = new AtmMachine();
                }
            }
        }
        return atmMachine;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public AtmState getAtmState() {
        return atmState;
    }

    public void setAtmState(AtmState atmState) {
        this.atmState = atmState;
    }
}
