package com.girish.labcorp.emplooyee;

//Controller interface for client application
public interface EmployeeManager {
	
	public void addEmployee(String typeOfEmployee);
	public float empWork(int id, int workDays);
	public float empTakeVacations(float vacationdaysUsed,  int id);
	public int getNumberOfEmployees();

}
