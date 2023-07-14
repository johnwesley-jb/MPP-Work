package HR2;

import java.util.List;

public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String SSN;
    private double salary;

    public Employee(int employeeId, String firstName, String lastName, String birthDate, String SSN,double salary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.SSN=SSN;
        this.salary= salary;
    }

    public void print() {
        System.out.println("Employee :"+employeeId+", "+firstName+", "+salary);
    }

    public double getSalary() {
        return salary;
    }
}
