package Standard5;

import java.util.List;
import java.util.stream.Collectors;

public class Admin {
	public static List<Student> obtainHonorRoll(List<Student> list) {
		//implement
		List<Student> lst=list.stream()
				.filter(student -> student.getMajor()==Majors.CS & student.getGpa()>3.0)
				.collect(Collectors.toList());
		return lst;
	}
}
