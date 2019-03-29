package com.iu.zoo;

public class Tazo extends Birds {
	private int egg;
	
	public Tazo() {
		super();
	}
	public Tazo(int egg) {
		this.egg = egg;
		this.getAge();
		super.getAge();
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}
}