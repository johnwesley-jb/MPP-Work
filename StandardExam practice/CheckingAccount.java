public class CheckingAccount extends Account{


    private double fee;
    public CheckingAccount(String id, double fee, double balance) {
        super(id, balance);
        this.fee=fee;
    }

    @Override
    public double computeUpdatedBalance() {
        return getBalance() - fee;
    }
}
