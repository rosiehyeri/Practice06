package com.javaex.ex05;

public class Depart extends Employee {

	 private String depart;
	 
	 public Depart() {
		 
	 }
	 
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
	 }  //getname() 아니면 Employee class를 protected로 바꿔도 되는데 이 문제는 employee 클래스를 만지면 안돼서 이렇게 한거임
	 //depart는 this.depart로 쓰면 더 명확함
	 

}
