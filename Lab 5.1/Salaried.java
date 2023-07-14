package lab5_1;

public class Salaried extends Employee{

    private double salary;
    public Salaried(String name, String phone, double salary) {
        super(name, phone);
        this.salary=salary;
    }


    @Override
    public double calcGrossPay() {
        return salary;
    }
}
