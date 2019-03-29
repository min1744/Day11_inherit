package com.iu.himart;

public class HimartView {
	//각 제품의 정보를 출력 메서드
	public void view(HomeAppliances ha) {
		System.out.println("컴퓨터");
		System.out.println("--------------");
		System.out.println("브랜드 : " + ha.getBrand());
		System.out.println("색깔 : " + ha.getColor());
		System.out.println("가격 : " + ha.getPrice());
		System.out.println("포인트 : " + ha.getPoint());
		System.out.println();
		
		if(ha instanceof Tv) {
			Computer computer = (Computer)ha;
			System.out.println(computer.getCapacity());
			System.out.println(computer.getCpu());
		}else if(ha instanceof Tv) {
			Tv tv = (Tv)ha;
		}else {
			Handphone handphone = (Handphone)ha;
		}
			
	}
	public void view(Tv [] tvs) {
		for(int i = 0; i < tvs.length; i++) {
			System.out.println("인치 : " + tvs[i].getInch());
			System.out.println("브랜드 : " + tvs[i].getBrand());
			System.out.println("색깔 : " + tvs[i].getColor());
			System.out.println("가격 : " + tvs[i].getPrice());
			System.out.println("포인트 : " + tvs[i].getPoint());
			System.out.println();
		}
	}
}