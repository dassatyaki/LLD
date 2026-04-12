public abstract class CashWithdrawalProcessor {
    public CashWithdrawalProcessor nextWithdrawalProcessor;
    public abstract void process(AtmMachine atmMachine, int amount);
    public void setNextProcessor(CashWithdrawalProcessor cashWithdrawalProcessor) {
        nextWithdrawalProcessor = cashWithdrawalProcessor;
    }
}
