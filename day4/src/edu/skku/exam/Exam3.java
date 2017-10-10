package edu.skku.exam;

import java.util.Scanner;

public class Exam3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*int n = scan.nextInt();
		int i, j ;
		char ch= 'A';
		for(i= 0 ; i < n ; i ++){
			for(j = 0 ; j < n ; j++){
				if(ch>'Z') ch ='A';
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		*/
		
		//교수님 코드
		
		int n = scan.nextInt();//키보드로부터 숫자 입력
		
		//글자 하나니까 반드시 싱글 ''
		char ch = 'A';// 내부적으로 ch에 65 값 들어간다.
		for(int r= 1; r <= n ; r ++){// 행을 지정
			for(int c =1 ; c <=n; c++){// 열을 지정
				if(ch>'Z') ch ='A';
				//찍고 나서 증가 s 는 String  c 는 char
				System.out.printf("%-2c",ch++);
			}
			System.out.println();//행 바꿈
		}
		
	}

}
