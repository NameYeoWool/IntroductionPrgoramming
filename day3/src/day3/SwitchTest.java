package day3;

import java.util.Random;

public class SwitchTest {
	
	public static void main(String[] args) {
		Random r = new Random();
		
		int score = r.nextInt(101);// 0~ 100 ���� ��
		System.out.println(score);
		switch(score/10){
		
		//10�϶��� 9�϶� �� ������� �����Ƿ� ���������־ ��
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
