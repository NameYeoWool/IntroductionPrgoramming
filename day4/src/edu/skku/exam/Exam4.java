package edu.skku.exam;

import java.util.Scanner;

public class Exam4 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();// ���� �Է�
		
		int m = 0 ;
		
		for(int i = 0 ; i <n; i ++){// ���� �Էµ� ����
			for(int j = 0; j<=i; j++){
				//if(m>9) m = 0;
				
				//�������� Ǯ��- �̰� �� �� ������������ �� ���� �ȳ�
				System.out.printf("%-2d",(m++)%10);
			}
			System.out.println();
		}
		
	}// end main

}// end class
