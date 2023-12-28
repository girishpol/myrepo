package com.girish.labcorp.emplooyee;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmployeeManager {
	
	@Test
	public void testAddEmployee() {
		
		EmployeeManager em = new EmployeeManagerImpl();
		assert(em.getNumberOfEmployees() == 0);
		
		em.addEmployee("Manager");
		em.addEmployee("Salaried");
		em.addEmployee("Salaried");
		em.addEmployee("Salaried");
		em.addEmployee("Hourly");
		em.addEmployee("Hourly");
		em.addEmployee("Manager");
		em.addEmployee("Hourly");
		
		assert(em.getNumberOfEmployees() == 8);
		
	}
	
	@Test
	public void testEmpWork() {
		EmployeeManagerImpl em = new EmployeeManagerImpl();
		em.addEmployee("Manager");
		em.addEmployee("Salaried");
		em.addEmployee("Salaried");
		em.addEmployee("Salaried");
		em.addEmployee("Hourly");
		em.addEmployee("Hourly");
		em.addEmployee("Manager");
		em.addEmployee("Hourly");
		assert(em.empWork(100, 260) == 30.00);//Test case for Manager
		assert(em.empWork(101, 260) == 15.00);//Test case for Salaried Employee
		assert(em.empWork(104, 260) == 10.00);//Test case for Hourly Employee
		assert(em.empWork(105, 0) == 0.00);//Test case for Hourly Employee with 0 work day
		assert((int) em.empWork(102, 100) == 5);//Test case for Salaried Employee
		assert(em.empWork(106, 261) < 0);//Test case for Hourly Employee with work days more than 260;
		assert(em.empWork(107, -10) < 0);//Test case for Hourly Employee with work days less than 0;
		assert(em.empWork(111, 10) < 0);//Test case for invalid id
	}

	@Test
	public void testEmpTakeVacations() {
		EmployeeManagerImpl em = new EmployeeManagerImpl();
		em.addEmployee("Manager");
		em.addEmployee("Salaried");
		em.addEmployee("Salaried");
		em.addEmployee("Salaried");
		em.addEmployee("Hourly");
		em.addEmployee("Hourly");
		em.addEmployee("Manager");
		em.addEmployee("Hourly");
		em.empWork(100, 260);
		em.empWork(101, 260);
		em.empWork(104, 260);
		assert(em.empTakeVacations(2, 100) == 28.00);//Test case for Manager
		assert(em.empTakeVacations(2.5f, 101) == 12.5);//Test case for Salaried Employee
		assert(em.empTakeVacations(3.5f, 104) == 6.5);//Test case for Hourly Employee
		assert(em.empTakeVacations(3.5f, 111) < 0);//Test case for invalid id
		assert(em.empTakeVacations(-1, 107) < 0);//Test case for Hourly Employee with vacation used days less than 0;
		assert(em.empTakeVacations(7.5f, 104) < 0);//Test case for Hourly Employee with vacation used days more than available balance;
	}

}
