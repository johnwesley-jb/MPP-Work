package HR;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private String location;
private List<Position> listPositions;
    public Department(String name, String location) {
        this.name = name;
        this.location = location;
        listPositions=new ArrayList<>();
    }

    public void addPosition(Position pos){
        listPositions.add(pos);
    }

    public void print() {
        System.out.println("Department Name: " + name + "  ---> Location: " + location);
        for (Position pos: listPositions){
            pos.print();
        }
    }
}
