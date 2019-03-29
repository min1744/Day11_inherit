package com.iu.himart;

public class Handphone extends HomeAppliances {
	private int inch;
	private String model;
	
	public Handphone() {
		this.inch = 10;
		this.model = "S10";
		this.setBrand("Samsung");
		this.setColor("Black");
		this.setPrice(1000000);
		this.setPoint(10);
	}
	
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
}