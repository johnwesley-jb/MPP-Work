package lab5_1;

import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private String phone;
    public Employee(String name, String phone){
        this.name=name;
        this.phone=phone;

    }
    public Paycheck calcCompensation(int month, int year){
        LocalDate ld=LocalDate.of(year,month,1);
        LocalDate first=DateRange.getFirstDayOfMoth(ld);
        LocalDate last=DateRange.getLastDayOfMoth(ld);
        var dr=new DateRange(first,last);
        Paycheck pc=new Paycheck(calcGrossPay(),0.23,0.05,0.01,0.03,0.075,dr);
    return pc;
    }
    public abstract double calcGrossPay();

}

