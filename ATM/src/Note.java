public enum Note {
    ONE(1),
    FIFTY(50),
    HUNDRED(100),
    FIVE_HUNDRED(500);

    public int amount;

    Note(int amount) {
        this.amount = amount;
    }
}
