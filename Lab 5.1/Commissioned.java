package lab5_1;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {

    private double commission;
    private double baseSalary;

    private List<Order> orderList;

    public Commissioned(String name, String phone, double commission, double baseSalary) {
        super(name, phone);
        this.commission = commission;
        this.baseSalary = baseSalary;
        orderList = new ArrayList<>();
    }

    public void addOrder(Order od) {
       // if (DateRange.isInRange())
        orderList.add(od);
    }

    @Override
    public double calcGrossPay() {
        double totalCommission = 0;
        for (Order ord : orderList) {
            totalCommission += ord.getOrderAmount() * this.commission;
        }
        return baseSalary + totalCommission;
    }
}
