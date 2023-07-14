package lab5_1;

public class Hourly extends Employee{

    private double hourlyWage;
    private int hoursPerWeek;
    public Hourly(String name, String phone, double hourlyWage, int hoursPerWeek) {
        super(name, phone);
        this.hourlyWage=hourlyWage;
        this.hoursPerWeek=hoursPerWeek;
    }

    @Override
    public double calcGrossPay() {
    return 4*hourlyWage*hoursPerWeek;

    }
}
