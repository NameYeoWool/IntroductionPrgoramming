package °´Ã¼ÁöÇâ2;

import java.util.Scanner;

class Person{
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	String getName(){
		return name;
	}
	
	int getAge(){
		return age;
	}
	
	void out(){
		System.out.printf("name : %s\nage : %d",name,age);
	}
	
}


public class Main636 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Person p1 = new Person(scan.next(),scan.nextInt());
		p1.out();
		
	}

}
