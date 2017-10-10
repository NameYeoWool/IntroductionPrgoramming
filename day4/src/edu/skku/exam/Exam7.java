package edu.skku.exam;

import java.util.Scanner;

public class Exam7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);


		while (true) {
			System.out.println("두 수를 입력하세요.");
			int a = scan.nextInt();
			int b = scan.nextInt();

			System.out.println("1. 덧셈");
			System.out.println("2. 뺄셈");
			System.out.println("3. 곱셈");
			System.out.println("4. 나눗셈");
			System.out.println("0. 종료");
			System.out.print("번호를 고르세요.");
			int n = scan.nextInt();//키보드 입력
			if(n == 0) break;
			
			// switch 문 안에 break; 문을 넣게 되면 switch문을 빠져나가고
			// while문을 빠져나가지 않으므로 문제가 발생한다.
			switch(n){
			case 1:
				System.out.println(a+b);
				break;
			case 2:
				System.out.println(a-b);
				break;
			case 3:
				System.out.println(a*b);
				break;
			case 4:
				System.out.println(a/b);
				break;
			default:
				System.out.println("번호를 잘못 입력하셨습니다.");
			}
			
		}//end while
		System.out.println("end...");
	}// end main

}// end class
