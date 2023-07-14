public class Course {

    private String Number;
    private String Title;
    private int Units;

    public Course(String number, String title, int units, Person person) {
        this.Number = number;
        this.Title = title;
        this.Units = units;
    }

    //Accessor
    public String getNumber() {
        return this.Number;
    }

    public String getTitle() {
        return this.Title;
    }

    public int getUnits() {
        return this.Units;
    }
}
