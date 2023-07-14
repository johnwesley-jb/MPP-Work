public abstract class Account {
    private double balance;
    private String id;
    public Account(String id, double balance){
        this.id=id;
        this.balance=balance;

    }

    public String getAccountID() {
        return this.id;
    }
    public double getBalance() {
        return this.balance;
    }
    abstract double computeUpdatedBalance();


}
