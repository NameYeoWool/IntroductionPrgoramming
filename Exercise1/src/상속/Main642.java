package ���;


// Main 641 �̶� Ŭ���� �̸����� ���ļ� ���� �������� Student2 ->Student / Score2 -> Score �� �ٲ��־��Ḷ
import java.util.Scanner;

class Student2{
	protected String name;
	protected int grade;
	
	Student2(String name, int grade){
		this.name = name;
		this.grade= grade;
	}
	
	
	void out(){
		System.out.println("name : " + name);
		System.out.println("rade : " + grade);
	}
	
}


class Score2 extends Student2{
	int english, math;
	
	Score2(String name, int grade, int english, int math){
		super(name, grade);
		this.english = english;
		this.math = math;
	}
	
	
	void out(){
		System.out.println("== Score2 ==");
		super.out();
		System.out.println("english : " + english);
		System.out.println("mathematics : " + math);
		System.out.println();
	}
}


class Physical extends Student2{
	double weight;
	int height;
	Physical(String name, int grade,int height , double weight){
		super(name,grade);
		this.height= height;
		this.weight = weight;
	}
	
	void out(){
		System.out.println("== Physical ==");
		super.out();
		System.out.println("height : " + height);
		System.out.println("weight : " + weight);
		
	}
	
	
}
public class Main642 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Score2 s = new Score2(scan.next(),scan.nextInt(),scan.nextInt(),scan.nextInt());
		Physical p = new Physical(scan.next(),scan.nextInt(),scan.nextInt(),scan.nextDouble());
		
		s.out();
		p.out();
		
	}

}
