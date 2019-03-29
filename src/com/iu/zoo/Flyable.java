package com.iu.zoo;

public interface Flyable {
	//상수
	//접근지정자는 public static final
	//안 쓰면 자동으로 만들어 줌
	public static final int NUM = 10;
	int NUMBER = 20;
	//추상메서드
	//public abstract
	//안 쓰면 자동으로 만들어 줌
	public abstract void fly();
}