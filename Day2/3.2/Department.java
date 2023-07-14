package HR2;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private String location;
    private List<Position> listPositions;

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
        listPositions = new ArrayList<>();
    }

    public void addPosition(Position pos) {
        listPositions.add(pos);
    }

    public double getSalary(){
        double sum=0;
        for (Position pos: listPositions){
            sum+=pos.getSalary();
        }
        return sum;
    }

    public void print() {
        System.out.println("Department Name: " + name + "  ---> Location: " + location+"--> Total Salary: "+getSalary());
        for (Position pos : listPositions) {
            pos.print();
        }
    }
}
