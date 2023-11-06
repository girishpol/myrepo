package collections;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.List;
import java.util.LinkedList;

public class EmployeeTest {
	
	public static void main(String[] args) {
		Set<Employee> set = new TreeSet<>(new EmployeeAgeComparator()); 
		set.add(new Employee(100,"Girish",37));
		set.add(new Employee(200,"Ram",47));
		set.add(new Employee(300,"Ajay",37));
		set.add(new Employee(400,"Sita",67));
		
		for(Employee emp:set) {
			System.out.println(emp.id + " " + emp.name + " " + emp.age);
		}
		
	}

}
