import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private double gpa;
    private List<Course> courses;

    public Student(String name, String phone, int age, double gpa) {
        super(name, phone, age);
        this.gpa = gpa;
        this.courses = new ArrayList<Course>();
    }

    //Accessors
    public double getGpa() {
        return this.gpa;
    }

    public List<Course> getCourses() {
        return courses;
    }

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

}
