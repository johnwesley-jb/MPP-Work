package Standard4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeAdmin {

	// returns a list of social security numbers, sorted in ascending order,
	// that belong to an Employee in the input table but that are not on the
	// socSecNums input list

	List<Employee> employees=new ArrayList<>();

	public static List<String> prepareSsnReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//implement
		List<String> stringList=table.keySet()
				.stream()
				.filter(k-> !socSecNums.contains(k))
				.collect(Collectors.toList());

		return stringList;
				
	}			
		//return a list of Employees whose social security number is on the input list socSecNums
				//and whose salary is >80000; the return list does not need to be sorted  
	public static List<Employee> prepareEmpReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//implement
		List<Employee> list = table
				.entrySet()
				.stream()
				.map(HashMap.Entry::getValue)
				.filter(k-> socSecNums.contains(k.getSsn()))
				.filter(emp -> emp.getSalary()>80000)
				.collect(Collectors.toList());
		return list;
	}
}