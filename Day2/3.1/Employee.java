package HR;

import java.util.List;

public class Employee {
    private int employeeId;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private String birthDate;
    private String SSN;

    public Employee(int employeeId, String firstName, String middleInitial, String lastName, String birthDate, String SSN) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.SSN = SSN;
    }

    public void print() {
        System.out.println("Employee :"+employeeId+", "+firstName+", "+middleInitial+", "+lastName+", " + birthDate+ ", "+ SSN);
    }
}
