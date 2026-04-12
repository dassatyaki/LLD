public class CashWithdrawController {
    CashWithdrawalProcessor fiveHundredProcessor;
    CashWithdrawalProcessor hundredProcessor;
    CashWithdrawalProcessor fiftyProcessor;
    CashWithdrawalProcessor oneProcessor;

    public CashWithdrawController() {
        fiftyProcessor = new FiftyProcessor();
        hundredProcessor = new HundredProcessor();
        fiveHundredProcessor = new FiveHundredProcessor();
        oneProcessor = new OneProcessor();
    }

    public void setNextProcessor() {
        fiveHundredProcessor.setNextProcessor(hundredProcessor);
        hundredProcessor.setNextProcessor(fiftyProcessor);
        fiftyProcessor.setNextProcessor(oneProcessor);
    }
}
