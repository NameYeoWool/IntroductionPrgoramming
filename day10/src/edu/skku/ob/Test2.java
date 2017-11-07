package edu.skku.ob;

public class Test2 {

	public static void main(String[] args) {
		MyDate h1 = new MyDate();
		h1.year= 2017;
		h1.month=1;
		h1.day=1;
		
		MyDate h2 = new MyDate(2017,1,2);
		MyDate h3 = new MyDate(1,2);
		
	}
	
}
