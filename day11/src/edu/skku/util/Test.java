package edu.skku.util;

public class Test {
	
	public static void main(String[] args) {
		MyDate m = new MyDate();
		//m.year = 2017;
		m.setYear(20187);
		//m.month = 11;
		m.setMonth(111);
		//m.day = 14;
		m.setDay(5);
		System.out.println(m);//m.toString();
		System.out.println(m.getDay());
	}

}
