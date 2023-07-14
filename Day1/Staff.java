import java.util.List;

public class Staff extends Person {
    private double salary;

    public Staff(String name, String phone, int age, int salary) {
        super(name, phone, age);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
