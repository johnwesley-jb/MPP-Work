import java.util.ArrayList;
import java.util.List;

public class Employee {
    private List<Account> accounts;
    private String name;

    public Employee(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }
    public double computeUpdatedBalanceSum() {
        double sum = 0;
        for (Account ac : accounts) {
            sum += ac.computeUpdatedBalance();
        }
        return sum;
    }

    public void addAccount(Account acc) {
        accounts.add(acc);

    }
}
