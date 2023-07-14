package lab5_1;

import java.time.LocalDate;
import java.util.Date;

public class Order {
    private String oderNo;
    private LocalDate orderDate;
    private double orderAmount;

    public Order(String oderNo, LocalDate orderDate, double orderAmount) {
        this.oderNo = oderNo;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }

    public String getOderNo() {
        return oderNo;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }
}
