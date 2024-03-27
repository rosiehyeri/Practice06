package com.javaex.ex03;

public class Shape {
	protected String fillColor;
	protected String lineColor;
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	public Shape() {        // Shape 클래스에 기본 생성자가 추가되어 Triangle 클래스에서 부모 클래스의 생성자를 호출할 때 오류가 발생하지 않음
		
	}
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	
}

