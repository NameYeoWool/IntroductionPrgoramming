package edu.skku.exam;

import java.util.Scanner;

public class Exam4 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();// 숫자 입력
		
		int m = 0 ;
		
		for(int i = 0 ; i <n; i ++){// 행은 입력된 숫자
			for(int j = 0; j<=i; j++){
				//if(m>9) m = 0;
				
				//나머지로 풀기- 이게 좀 더 빠르긴하지만 별 차이 안남
				System.out.printf("%-2d",(m++)%10);
			}
			System.out.println();
		}
		
	}// end main

}// end class
