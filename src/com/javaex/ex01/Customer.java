
package com.javaex.ex01;

public class Customer extends Person{
	
	private int cNo;
	private int point;
	
	//생성자
	public Customer () {
		System.out.println("생성자 Customer(0) 호출");
	}
	public Customer(String name, String hp, int cNo, int point) {
		super(name, hp);
		this.cNo = cNo;
		this.point = point;
	}
	
	public int getcNo() {
		return cNo;
	}
	public void setcNo(int cNo) {
		this.cNo = cNo;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("#이름: " + name + ", #핸드폰: " + hp
				+ ", #고객번호: " + cNo + ", #포인트 점수: " + point);
	}
	
	
	
	
}
