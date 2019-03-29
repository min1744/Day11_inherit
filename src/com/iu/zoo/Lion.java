package com.iu.zoo;

public class Lion extends Animal{

	private int tooth;
	private Animal animal;
	
	public Lion() {
		super();
	}

	public int getTooth() {
		return tooth;
	}

	public void setTooth(int tooth) {
		this.tooth = tooth;
	}

	public void eat() {
		
	}

	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.eat();
	}
}