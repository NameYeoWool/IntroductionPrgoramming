package day3;

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		int month = scan.nextInt();
		int endDay= 0;
		
		
		switch(month){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			endDay = 31;
			break;
		case 2:
			endDay = 28;
			break;
		default:
			endDay = 30;
			
		}
		
		System.out.println("������ ��:"+ endDay);
		
	}
}
