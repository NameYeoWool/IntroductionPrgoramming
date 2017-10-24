package edu.skku.exam;

import java.util.Scanner;

public class Exam6 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int i, j; 
		
		char ch = 'A';
		
		for(int r= 1; r<=n; r++){
			//공백찍기
			for(int sp=1; sp<=n-r; sp++){
				System.out.print("  ");
			}
			//알파벳 찍기
			for(int c=1; c<=2*r-1; c++){
				if(ch>'Z') ch='A';
				System.out.printf("%2c",ch++);
			}
			System.out.println();
		}
		/* 디버깅 해볼것 왜안되지 ;;
		 * 
		 *  0 부터 시작하는 짓거리를 해서 그런다. 계산하기 쉽게  1행부터 시작한다고 생각하자
		for(i = 0; i<n; i++){
			for(j=0; j<n-i; j++){
				System.out.print("  ");
			}
			for(j = 0 ; j< i*2-1; j++){
				if(ch>'Z') ch= 'A';
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
*/	
	}

}
