package com.javaex.ex05;

public class Depart extends Employee {

	 private String depart;
	 
	 public Depart(String name, int salary, String depart) {
		 super(name, salary);
		 this.depart = depart;
	 }
	 
	 public String getDepart() {
		 return depart;
	 }
	 public void setDepart(String depart) {
		 this.depart = depart;
	 }
	 
	 @Override
	 public void showInformation() {
		 System.out.println("이름:" + getName() + ", 연봉:" + getSalary() + ", 부서:" + depart);
	 }
	 

}
