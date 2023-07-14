package lab5_1;

import java.time.LocalDate;

public class MainApp {


    public static void main(String[] args) {
        Employee eh1=new Hourly("Johnny","9093-9404",18,50);
        Employee eh2=new Hourly("Jeff","7399-2443",18,50);
        Employee eh3=new Hourly("Chavanne","5173-2443",18, 50);
        Employee eh4=new Hourly("Charles","2308-3445",18,50);

        Employee s1=new Salaried("Robert","7364-0024",6000);
        Employee s2=new Salaried("Antony","5028-4390",6500);
        Employee s3=new Salaried("Louinord","7930-3421",9000);

        double comm=0.07;
        Employee c1=new Commissioned("Jefferson","3772-6106",comm,2500);
        Employee c2=new Commissioned("Jefferson","3222-1106",comm,2500);
        Employee c3=new Commissioned("Jefferson","3182-6178",comm,2500);



        (( Commissioned) c1).addOrder(new Order("59598", LocalDate.parse("2022-08-16"),5000));

        System.out.println(s1.calcGrossPay());
        System.out.println(eh1.calcGrossPay());
        System.out.println(c1.calcGrossPay());
        s1.calcCompensation(10,2022).print();
       System.out.println(new DateRange(LocalDate.parse("2019-08-16"),LocalDate.parse("2019-08-28")).isInRange(LocalDate.parse("2019-08-29")));
    }




}
