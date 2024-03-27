package com.javaex.ex04;

public class Customer extends User {
	private int point;
	
	public Customer(String id, String password, String name, int point) {
		super(id, password, name);
		this.point = point;
	}
	
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println(", #포인트: " + point);
	}
	
	
	

}
