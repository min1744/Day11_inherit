package com.iu.quiz;

public class God {
	private static final God GOD = new God();
	
	private God() {}
	
	public void say() {
		System.out.println("Today is Friday!");
	}
	
	public static God get() {
		return GOD;
	}
}