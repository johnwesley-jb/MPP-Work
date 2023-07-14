package HR;

public class Application {
    public static void main(String[] args) {
        Company comp=new Company("Upgrade Society");



        //Dept management
        Department management=new Department("Accountability", "2nd floor, R115");

        //Management position
        Position ceo=new Position("CEO","chief executive officer ");
        Position manager=new Position("Manager","The director of the department");
        Position accountant=new Position("Accountant","Accountant of the dept");
        Position secretary=new Position("Secretary","Secretary of the dept");


        //adding Managemnt postions
        management.addPosition(ceo);
        management.addPosition(manager);
        management.addPosition(accountant);
        management.addPosition(secretary);

        //Dept IT
        Department it=new Department("IT", "1st floor, R107");

        //IT position
        Position ITManager=new Position("Manager","The director of the IT department");
        Position netAdm=new Position("Network Administrator", "Has all roles on company network");
        Position technicien=new Position("Technicien", "Solving physical issue");

        it.addPosition(ITManager);
        it.addPosition(netAdm);
        it.addPosition(technicien);

        comp.addDepartment(management);
        comp.addDepartment(it);





       Employee john=new Employee(101011,"John", "JW","Jean Baptiste","02/14/1996", "92-802-2312");
        Employee junior=new Employee(223301,"Junior", "JC","Celien","01/22/1993", "17-017-0123");
        Employee jeff=new Employee(737293,"Jeff", "JT","Twawa","07/11/1994", "23-802-0830");
        Employee jerome=new Employee(138310,"Jerome", "JG","Gerancon","10/17/1998", "19-802-0980");
        Employee calix=new Employee(902318,"Calix", "CB","Benard","11/09/1987", "29-802-0956");
        Employee coralie=new Employee(230173,"Coralie", "CA","Azemar","12/16/1999", "22-809-0923");

        //adding managers
       ceo.addEmployee(john);
       manager.addEmployee(junior);
       secretary.addEmployee(coralie);

       //adding IT
       ITManager.addEmployee(jerome);
       netAdm.addEmployee(jeff);
       technicien.addEmployee(calix);
       comp.print();



    }
}
