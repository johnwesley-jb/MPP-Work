public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(String id,double interestRate, double balance) {
        super(id, balance);
        this.interestRate=interestRate;
    }

    @Override
    public double computeUpdatedBalance() {
        double balance = getBalance();
        return balance + interestRate * balance;
    }
}
