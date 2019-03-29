package com.iu.himart;

public class HimartMain {

	public static void main(String[] args) {
		Computer computer = new Computer();
		Tv tv = new Tv();
		Handphone handphone = new Handphone();
		HimartView hv = new HimartView();
		Tv [] tvs = new Tv[3];
		Customer customer = new Customer();
		
		HomeAppliances [] products = new HomeAppliances[3];
		products[0] = tv;
		products[1] = handphone;
		products[2] = computer;
		
		/*for(int i = 0; i < tvs.length; i++)
			tvs[i] = new Tv();
		
		hv.view(computer);
		hv.view(tv);
		hv.view(handphone);
		hv.view(tvs);
		customer.buy(tv);
		customer.buy(computer);
		customer.buy(handphone);
		
		HomeAppliances p = tv;
		
		System.out.println(((Tv)p).getInch());
		
		p = new HomeAppliances();
		System.out.println(((Tv)p).getInch());
		
		
		System.out.println(p.getBrand());
		System.out.println(p.getPrice());*/
	}
}