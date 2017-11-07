package edu.skku.ob;

public class Test {
	
	public static void main(String[] args) {
		MyDate today = new MyDate();
		today.year = 2017;
		today.month = 11;
		today.day = 7;
		today.info();
		
		
		MyDate birth = new MyDate();
		birth.year = 1997;
		birth.month = 11;
		birth.day = 10;
		birth.info();
	}

}
