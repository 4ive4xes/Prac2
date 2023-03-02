abstract public class Telephone {
    protected boolean telephoneState;
    protected int displayDiagonal;
    protected String OS;

    abstract void call(String number);
    abstract void blockTelephone();
    abstract void unblockTelephone();
    abstract String sendSms(String sms);
}
