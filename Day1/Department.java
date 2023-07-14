import java.util.ArrayList;
import java.util.List;

public class Department {

    private String Name;

    List<Person> persons;

    public Department(String name) {
        this.Name = name;
        this.persons = new ArrayList<Person>();
    }

    public String getDepartmentName() {
        return this.Name;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public double getTotalSalary() {
        double sum = 0;


//		for (Person p : persons) {
//			if (p instanceof Staff) {
//				Staff st=(Staff)p;
//				sum += st.getSalary();
//			}
//			if (p instanceof Faculty){
//				Faculty fa=(Faculty)p;
//				sum += fa.getSalary();
//			}
//
//		}
        for (Person p : persons) {
            sum += p.getSalary();


        }
        return sum;
    }

    public void showAllMembers() {

        for (Person p : persons) {

            System.out.printf("%s %s %d %s \n", p.getName(), p.getPhone(), p.getAge(), p.getClass().getSimpleName());

        }
    }

    public void unitsPerFaculty() {
        for (Person p : persons) {

            if (p.getClass().getSimpleName().equals("Faculty")) {
                Faculty fa = (Faculty) p;

                System.out.printf("Faculty name:  %s and totalunits: %d\n", fa.getName(), fa.getTotalUnits());
            }

        }

    }

    public void unitsPerFaculty2() {
        for (Person p : persons) {

            if (p instanceof Faculty) {
                Faculty fa = (Faculty) p;

                System.out.printf("Faculty name:  %s and totalunits: %d\n", fa.getName(), fa.getTotalUnits());
            }

        }

    }

    public List<Course> getCourses(String name) {
        List<Course> courses = new ArrayList<>();
        for (Person p : persons) {

            //if the given name is valid and is faculty
            if (p.getName().equals(name) && p.getClass().getSimpleName().equals("Faculty")) {

            }

        }

        return courses;
    }

}
