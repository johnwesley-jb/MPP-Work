package HR2;

import java.io.DataOutput;
import java.util.List;

public class Position {
    private String title;
    private String description;
    private Employee emp;

    public Position(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void addEmployee(Employee emp) {
        this.emp = emp;
    }

    public double getSalary() {
        if (emp == null)
            return 0;
        return emp.getSalary();
    }

    public void print() {
        System.out.println("Position title : " + title + "  ---> Total salary: " + getSalary());
        if (emp != null)
            emp.print();
        else
            System.out.println("-----------------------Vacancy-----------------------");

    }
}
