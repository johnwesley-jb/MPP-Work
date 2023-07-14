package A;
// Program 4: ProcessingEmployees.java
// Processing streams of Employee objects.

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessingEmployees
{
   public static void main(String[] args)
   {
      // initialize array of Employees
      Employee[] employees = {
         new Employee("Jason", "Red", 5000, "IT"),
         new Employee("Ashley", "Green", 7600, "IT"),
         new Employee("Matthew", "Indigo", 3587.5, "Sales"),
         new Employee("James", "Indigo", 4700.77, "Marketing"),
         new Employee("Luke", "Indigo", 6200, "IT"),
         new Employee("Jason", "Blue", 3200, "Sales"),
         new Employee("Wendy", "Brown", 4236.4, "Marketing")};

      // get List view of the Employees
      List<Employee> list = Arrays.asList(employees);


       System.out.println("1) Count the number of last names that begin with the letter  ‘B’.  Print out this number.");
      long count =list.stream()
              .filter(emp -> emp.getLastName().startsWith("B"))
              .count();
      System.out.printf("%d%n",count);

      System.out.println("2) Print out all of the Employee objects whose last name begins with the letter  ‘B’  in sorted order. ");
      list.stream()
              .filter(emp -> emp.getLastName().startsWith("B"))
              .sorted(Comparator.comparing(Employee::getName))
              .forEach(emp -> System.out.println(emp.getLastName()));

      System.out.println("3) Print out all of the Employee objects whose last name begins with the letter  ‘B’  and change their first name and last name to be All capital letters.");
       System.out.println("Without change");
      list.stream()
              .filter(emp ->emp.getLastName().startsWith("B") )
              .forEach(emp -> System.out.println(emp.getLastName().toUpperCase()));

       System.out.println("With change");
        list.stream()
            .forEach(emp ->emp.setLastName(emp.getLastName().toUpperCase()) );
      list.stream().forEach(System.out::println);

       System.out.println("4) Print out All of the employee objects, but if the last name begins with the letter  ‘B’,  then capitalize all the letters in the last name.");
      list.stream()
              .forEach(emp->{
                 if (emp.getLastName().startsWith("B")) {
                    emp.setLastName(emp.getLastName().toUpperCase());
                 }
                 System.out.println(emp);

              });

       System.out.println("4.1)  Use the  Collectors.joining  method to print out All Employee objects.  (See my  presentation file  ‘Do_Last_This_Was_Lesson 9_Streams_E.docx’.)  ");
       String result = list.stream()
               .map(Object::toString)
               .collect(Collectors.joining("\n"));
       System.out.println(result);


       System.out.println("4.2)  Use the  Collectors.joining  method to print out All Employee objects, and separate    each one with a delimeter of  “---\\n---“.");
              String result1 = list.stream()
               .map(Object::toString)
               .collect(Collectors.joining("---\n---"));
       System.out.println(result1);

       System.out.println("5) Print out all of the Employee objects’ last names, whose last name begins with the letter  ‘I’  in sorted order, and get rid of all the duplicates.  Print out only the last names.");

              List<String> lastNames= list
                      .stream()
                      .filter(emp-> emp.getLastName().startsWith("I"))
                      .map(Employee::getLastName)
                      .distinct()
                      .collect(Collectors.toList());
              lastNames.forEach(System.out::println);


       System.out.println("6)  Print out the average of all the salaries.");
       System.out.printf("%.2f",list.stream()
               .mapToDouble(Employee::getSalary).
               average().getAsDouble());

       System.out.println("7)  Use the  ‘reduce’  method to print out the total salary of all employees.");

      double totalSalary = list
              .stream()
              .mapToDouble(Employee::getSalary)
              .reduce(0,(x,y)->x+y);
       System.out.printf("%.2f",totalSalary);

       System.out.println("8)  Print out only the first names of all the employees.  Use the  ‘map’  method to accomplish this.  ");
       List<String> firstNames= list
               .stream()
               .map(Employee::getFirstName)
               .collect(Collectors.toList());
       firstNames.forEach(System.out::println);

       System.out.println("9)  Create an infinite stream of even numbers (0, 2, 4, …) and then, eventually print out only the first 20 even numbers from this stream.  ");

       Stream<Integer> evenNum = Stream.iterate(0, i -> i + 2);
       evenNum.limit(20)
               .forEach(System.out::println);

       System.out.println("");

       Stream strings = Stream.of("A", "good", "day", "to", "write", "some", "Java");
       String str= strings.reduce("",(x, y)->x+" "+y).toString();

       System.out.println(str);

//              String result = list.stream()
//               .map(Object::toString)
//               .collect(Collectors.joining(" "));
//       System.out.println(result);



       // display all Employees
//      System.out.println("Complete Employee list:");
//      list.stream().forEach(System.out::println);   //A method reference.

      // To test Collectors.joining
//      // Convert elements to strings and concatenate them, separated by commas
//      String joined = list.stream()
//              .map(Object::toString)  //  this DOES go to the overridden method  toString  inside Employee!!  Yes!!
//
//                                     //  joining method needs Strings coming in.
//
//              //.map(Employee::toString)  //  this also DOES work!!  Yes!!
//              .collect(Collectors.joining(", "));
//
//      System.out.println("\n\n" + joined);




   } // end main

    public int countWords(List<String> words, char c, char d, int len){
        return (int) words.stream()
                .filter(w -> w.length() == len)
                .filter(w -> w.contains("" + c))
                .filter(w -> !w.contains("" + d))
                .count();
    }
} // end class ProcessingEmployees


