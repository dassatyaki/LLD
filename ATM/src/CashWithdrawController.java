public class CashWithdrawController {
    CashWithdrawalProcessor fiveHundredProcessor;
    CashWithdrawalProcessor hundredProcessor;
    CashWithdrawalProcessor fiftyProcessor;

    public CashWithdrawController() {
        fiftyProcessor = new FiftyProcessor();
        hundredProcessor = new HundredProcessor();
        fiveHundredProcessor = new FiveHundredProcessor();
    }

    public void setNextProcessor() {
        fiveHundredProcessor.setNextProcessor(hundredProcessor);
        hundredProcessor.setNextProcessor(fiftyProcessor);
    }
}
