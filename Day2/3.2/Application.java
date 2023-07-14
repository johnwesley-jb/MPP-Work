package HR2;

public class Application {
    public static void main(String[] args) {
        Company comp=new Company("Upgrade Society");



        //Dept management
        Department management=new Department("Managemnt", "2nd floor, R115");

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





       Employee john=new Employee(101011,"John", "Jean Baptiste","02/14/1996", "92-802-2312",900000);
        Employee junior=new Employee(223301,"Junior","Celien","01/22/1993", "17-017-0123",500000);
        Employee jeff=new Employee(737293,"Jeff", "Twawa","07/11/1994", "23-802-0830",250000);
        Employee jerome=new Employee(138310,"Jerome", "Gerancon","10/17/1998", "19-802-0980",350000);
        Employee calix=new Employee(902318,"Calix", "Benard","11/09/1987", "29-802-0956",120000);
        Employee coralie=new Employee(230173,"Coralie", "Azemar","12/16/1999", "22-809-0923",150000);

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
