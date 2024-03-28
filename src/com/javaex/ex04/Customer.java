package com.javaex.ex04;

public class Customer extends User {			//상속 (확장)
	//필드
	private int point;
	
	//기본생성자
	public Customer() {
		
	}
	
	//생성자
	public Customer(String id, String password, String name, int point) {
		super(id, password, name);		//부모 먼저 초기화
		this.point = point;				//나머지 필드 초기화
	}
	
	
	//getter/setter
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	@Override
	public void showInfo() {
		System.out.println("#아이디: " + id + ", #패스워드: " + password + ", #이름: " + name + ", #포인트:" + point);
	}
	
	
	
	

}
