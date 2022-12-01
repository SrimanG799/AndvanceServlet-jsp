package com.model;

public class Employee {

	int roll;
	String name;
	String campany;
	double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int roll, String name, String campany, double salary) {
		super();
		this.roll = roll;
		this.name = name;
		this.campany = campany;
		this.salary = salary;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getcampany() {
		return campany;
	}

	public void setcampany(String campany) {
		this.campany = campany;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [roll=" + roll + ", name=" + name + ", campany=" + campany + ", salary=" + salary + "]";
	}

}
