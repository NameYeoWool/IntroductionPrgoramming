package day3;

import java.util.Random;

public class SwitchTest {
	
	public static void main(String[] args) {
		Random r = new Random();
		
		int score = r.nextInt(101);// 0~ 100 사이 값
		System.out.println(score);
		switch(score/10){
		
		//10일때는 9일때 랑 결과값이 같으므로 지정안해주어도 됨
		case 10:
			//System.out.println("A");
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("A");
			break;
		case 7:
			System.out.println("B");
			break;
		default:
			System.out.println("F");
		}
		
	}

}
