package com.girish.labcorp.emplooyee;

import java.util.Map;
import java.util.HashMap;

//Implementation of Controller Interface
public class EmployeeManagerImpl implements EmployeeManager {
	
	private int currentId = 100;

	Map<Integer, Employee> employees = new HashMap<>();
		
	public void addEmployee(String typeOfEmployee) {
		
		Employee e = null;
		
		if(typeOfEmployee.equals("Hourly")) {
			e = new HourlyEmployee();
		}else if(typeOfEmployee.equals("Salaried")) {
			e = new SalariedEmployee();
		}else if(typeOfEmployee.equals("Manager")) {
			e = new Manager();
		}else {
			System.out.println("Invalid employee type");
			return;
		}
		
		e.setId(currentId);
		e.setEmpType(typeOfEmployee);
		
		employees.put(currentId, e);
		
		currentId++;
	}
	
	public int getNumberOfEmployees() {
		return employees.size();
	}
	
	public float empWork(int id, int workDays) {
		Employee emp = employees.get(id);
		if(emp == null) {
			System.out.println("Id does not exist in the system");
			return -1.00f;
		}
		
		float vacationDays = 0;
		
		if(emp.getEmpType().equals("Hourly")) {
			HourlyEmployee he = (HourlyEmployee) emp;
			vacationDays =  he.work(workDays);
		}else if(emp.getEmpType().equals("Salaried")) {
			SalariedEmployee se = (SalariedEmployee) emp;
			vacationDays = se.work(workDays);
		}else if(emp.getEmpType().equals("Manager")) {
			Manager m = (Manager) emp;
			vacationDays = m.work(workDays);
		}
		
		return vacationDays;
	}
	

	
	public float empTakeVacations(float vacationdaysUsed,  int id) {
		Employee emp = employees.get(id);
		if(emp==null) {
			System.out.println("Id does not exist in the system");
			return -1.00f;
		}
		return emp.take_vacations(vacationdaysUsed);
	}
	
}
