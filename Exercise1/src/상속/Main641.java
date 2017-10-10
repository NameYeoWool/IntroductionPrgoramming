package »ó¼Ó;

import java.util.Scanner;

class Student{
	String name;
	int grade;
	
	Student(String name, int grade){
		this.name = name;
		this.grade = grade;
	}
	
}


class Score extends Student{
	int english, math;
	
	Score(String name, int grade, int english, int math){
		super(name, grade);
		this.english=english;
		this.math=math;
	}
	
	void out(){
		System.out.printf("name : %s\nrade : %d\nenglish : %d\nmathematics : %d\nsum : %d",name,grade,english,math,english+math);
		
		
	}
	
}


public class Main641 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Score s1 = new Score(scan.next(),scan.nextInt(),scan.nextInt(),scan.nextInt());
		s1.out();
		
		
	}

}
