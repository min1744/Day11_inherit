package com.iu.himart;

public class Computer extends HomeAppliances {
	private int capacity;
	private String cpu;
	
	public Computer() {
		this.capacity = 256;
		this.cpu = "i7";
		this.setBrand("Apple");
		this.setColor("Silver");
		this.setPrice(2000000);
		this.setPoint(20);
	}
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
}