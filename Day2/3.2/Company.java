package HR2;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Department> departmentList;

    public Company(String name) {
        this.name = name;
        departmentList = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departmentList.add(dept);

    }
    public double getSalary(){
        double sum=0;
        for (Department dept: departmentList){
            sum+=dept.getSalary();
        }
        return sum;
    }

    public void print() {
        System.out.println("Company name: "+name+" Total Salary: "+getSalary());
        for (Department dept : departmentList) {
            dept.print();
        }
    }


}
