package com.javaex.ex04;

public class Employee extends User {
	
	private int salary;
	
	public Employee() {
		
	}
	
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
	
	@Override
	public void showInfo() {
		System.out.println("#아이디: " + id + ", #패스워드: " + password + ", #이름: " + name + "운영자의 월급은 " + salary + "만원 입니다.");
	}
}
