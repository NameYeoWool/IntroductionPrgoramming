package ±¸Á¶Ã¼;

import java.util.Scanner;

class Student{
	String school;
	int grade;
	
	void set(String sc, int n){
		school = sc;
		grade= n;
	}
	
	void out(){
		System.out.printf("%dth grade in %s School\n",grade,school);
	}
	
	void out2(){
		System.out.printf("%dst grade in %s School\n",grade,school);
	}
}

public class Main614 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Student p1 = new Student();
		p1.set("Jejuelementary",6);
		p1.out();
		
		Student p2 = new Student();
		p2.set(scan.next(),scan.nextInt());
		p2.out2();
		
		
	}

}
