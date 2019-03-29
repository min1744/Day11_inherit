package com.iu.himart;

public class Tv extends HomeAppliances {
	private int inch;
	
	public Tv() {
		this.inch = 100;
		this.setBrand("LG");
		this.setColor("Gray");
		this.setPrice(2500000);
		this.setPoint(15);
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
}