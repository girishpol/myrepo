package com.girish.labcorp.emplooyee;

public class SalariedEmployee extends Employee {
	
	private static final int MAX_VACATIONS = 15;

	@Override
	public float work(int workDays) {
		if(workDays < 0 || workDays > MAX_WORK_DAYS) {
			System.out.println("Invalid work days");
			return -1.00f;
		}
		float vacationDays = workDays * (float)MAX_VACATIONS/(float)MAX_WORK_DAYS;
		super.setVacationDays(vacationDays);
		return vacationDays;
	}

}
