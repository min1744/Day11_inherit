package com.iu.himart;

public class Customer{
	private int price;
	private int point;
	
	public Customer() {
		this.price = 10000000;
		this.point = 0;
	}
	
	//buy()메서드, 매개변수 1개, 매서드는 여러 개여도 상관없음
	//계산 후 현재 잔액, 현재 포인트 출력
	public void buy(HomeAppliances p) {
		this.price = this.price - p.getPrice();
		this.point = this.point - p.getPoint();
		System.out.println("금액 : " + this.price);
		System.out.println("포인트 : " + this.point);
	}
}