package collections;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		int age1 = e1.age;
		int age2 = e2.age;
		
		if(age1 > age2) {
			return -1;
		}else if(age1 < age2) {
			return 1;
		}else {
			return e1.name.compareTo(e2.name);
		}
	}
	
	

}
