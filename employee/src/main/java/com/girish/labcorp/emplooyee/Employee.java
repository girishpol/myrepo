package com.girish.labcorp.emplooyee;

//abstract employee class
public abstract class Employee {
	
	public static final int MAX_WORK_DAYS = 260;
	private int id;
	private String empType;
	private float vacationDays;
	
	Employee(){
		vacationDays = 0;
	}
	
	//method to update the vacation days based on usage
	public float take_vacations(float vacationDaysUsed) {
		if(vacationDaysUsed < 0) {
			System.out.println("Number of input vacations can not be less than 0");
			return -1.00f;
		}
		if(vacationDaysUsed > this.vacationDays) {
			System.out.println("Number of input vacations can not be more than available balance");
			return -1.00f;
		}
		this.vacationDays = this.vacationDays - vacationDaysUsed;
		return this.vacationDays;
	}
	
	//abstract method to calculate vacation days
	public abstract float work(int workDays);

	public float getVacationDays() {
		return this.vacationDays;
	}

	public void setVacationDays(float vacationDays) {
		this.vacationDays = vacationDays;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

}
