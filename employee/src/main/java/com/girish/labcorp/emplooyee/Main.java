package com.girish.labcorp.emplooyee;

public class Main {

	public static void main(String[] args) {
		
		EmployeeManagerImpl em = new EmployeeManagerImpl();
		em.addEmployee("Manager");
		em.addEmployee("Salaried");
		em.addEmployee("Salaried");
		em.addEmployee("Salaried");
		em.addEmployee("Hourly");
		em.addEmployee("Hourly");
		em.addEmployee("Manager");
		em.addEmployee("Hourly");
		
		System.out.println(em.empWork(100, 260));
		
		System.out.println(em.empTakeVacations((float)2.0, 100));

	}

}
