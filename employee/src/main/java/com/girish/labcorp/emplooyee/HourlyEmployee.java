package com.girish.labcorp.emplooyee;

public class HourlyEmployee extends Employee {
	
	private static final int MAX_VACATIONS = 10;

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
