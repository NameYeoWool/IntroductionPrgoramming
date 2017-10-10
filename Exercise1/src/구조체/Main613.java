package ±¸Á¶Ã¼;

import java.util.Scanner;

class Person{
	String name, school;
	int grade;
	
	
	void out(){
		System.out.printf("Name : %s\nSchool : %s\nGrade : %d",name,school,grade);
	}
}


public class Main613 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Person p1 = new Person();
		
		p1.name = scan.next();
		p1.school = scan.next();
		p1.grade = scan.nextInt();
		
		p1.out();
		
		
		
	}

}
