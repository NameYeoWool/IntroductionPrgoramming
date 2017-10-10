package homework1_2;

import java.util.Scanner;

public class Grade {
	
	int kor, eng, math;
	int k = 1;
	
	Grade(){
		kor = 80;
		eng = 70;
		math = 100;
	}
	Grade(int kor, int eng, int math){
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public void set(){
		Scanner scan = new Scanner(System.in);
		kor = scan.nextInt();
		eng = scan.nextInt();
		math = scan.nextInt();
	}
	

}
