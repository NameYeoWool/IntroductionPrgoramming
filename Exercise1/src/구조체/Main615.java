package ±¸Á¶Ã¼;

import java.util.Scanner;

class Score{
	String name;
	int english;
	int math;
	
	Score(String name, int english, int math){
		this.name= name;
		this.english = english;
		this.math = math;
	}
	
	void out(){
		System.out.printf("%s %d %d\n",name,english,math);
	}
}

public class Main615 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Score p1 = new Score(scan.next(),scan.nextInt(),scan.nextInt());
		Score p2 = new Score(scan.next(),scan.nextInt(),scan.nextInt());
		
		Score hap = new Score("avg",(p1.english+p2.english)/2,(p1.math+p2.math)/2);
		
		p1.out();
		p2.out();
		hap.out();

	}

}
