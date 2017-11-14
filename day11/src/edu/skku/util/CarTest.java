package edu.skku.util;

public class CarTest {
	
	public static void main(String[] args) {
		Car c= new Car("11호2123","테슬라",15000);
		System.out.println(c);// c.toString();
		
		Car[] cars = new Car[10];
		cars[0] = new Car("11호2123","테슬라",15000);
		cars[1] = new Car("11호2123","테슬라",15000);
		cars[2] = new Car("11호2123","테슬라",15000);
		cars[3] = new Car("11호2123","테슬라",15000);
		cars[4] = new Car("11호2123","테슬라",15000);
		cars[5] = new Car("11호2123","테슬라",15000);
		cars[6] = new Car("11호2123","테슬라",15000);
		cars[7] = new Car("11호2123","테슬라",15000);
		cars[8] = new Car("11호2123","테슬라",15000);
		cars[9] = new Car("11호2123","테슬라",15000);
		
		for(int i = 0 ; i <cars.length; i ++){
			System.out.println(cars[i]);
		}
	}

}
