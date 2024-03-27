package com.javaex.ex04;

public class Employee extends User {
	
	private int salary;
	
	public Employee(String id, String password, String name, int salary) {
		super(id, password, name);
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("운영자의 월급은 " + salary + "원 입니다.");
	}

	
	

	
}
