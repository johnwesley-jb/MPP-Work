package HR;

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

    public void print() {
        System.out.println("Position title : " + title+ "  ---> Position Description: " + description);
        if (emp!=null)
        emp.print();
        else
            System.out.println("-----------------------Vacancy-----------------------");

    }
}
