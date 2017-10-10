package °´Ã¼ÁöÇâ2;

import java.util.Scanner;

class NS{
	private String name;
	private int score,addscore,sum;
	
	void set(String n, int sc, int add){
		name = n;
		
		if( sc < 0) sc = 0;
		else if (sc> 100) sc = 100;
		
		if( add < 0) add =0;
		
		sum = sc + add;
		if( sum > 100 ) sum = 100;
		
	}
	
	void out(){
		System.out.printf("%s's score is %d",name,sum);
	}
	
}

public class Main637 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input name : ");
		String name = scan.next();
		System.out.print("Input score : ");
		int score = scan.nextInt();
		System.out.print("Input add score : ");
		int addscore =scan.nextInt();
		
		
		NS p1 = new NS();
		p1.set(name,score,addscore);
		p1.out();

	}

}
