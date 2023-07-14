import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.List;

public class StaffStudents extends Student {

    private double salary;
    private List<Course> courses;
    LocalDate date;

    public StaffStudents(String name, String phone, int age, int salary, double gpa) {
        super(name, phone, age, gpa);
        this.salary = salary;

    }

    @Override
    public void addCourse(Course cs) {

        if (getCourses().isEmpty()) {
            date = LocalDate.now();
        }
        super.addCourse(cs);
        System.out.println("First course, "+date);
    }

    @Override
    public int getTotalUnits() {
        return super.getTotalUnits();
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
