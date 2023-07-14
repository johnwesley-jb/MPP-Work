import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person {
    private List<Course> courses;
    private double salary;

    public Faculty(String name, String phone, int age, int salary) {
        super(name, phone, age);
        this.salary = salary;
        this.courses = new ArrayList<Course>();
    }

    // Accessors

    public void addCourse(Course cs) {
        courses.add(cs);
    }

    public int getTotalUnits() {
        int total = 0;
        for (Course c : courses) {
            total += c.getUnits();
        }
        return total;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    public List<Course> getCourses() {
        return this.courses;
    }

}
