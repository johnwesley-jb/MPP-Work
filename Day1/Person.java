import java.util.List;

public class Person {

    private String Name;
    private String Phone;
    private int Age;
    private double salary;

    public Person(String name, String phone, int age) {
        this.Name = name;
        this.Phone = phone;
        this.Age = age;
    }

    //Accessors
    public String getName() {
        return this.Name;
    }

    public String getPhone() {
        return this.Phone;
    }

    public int getAge() {
        return this.Age;
    }

    public double getSalary() {
        return salary;

    }

}
