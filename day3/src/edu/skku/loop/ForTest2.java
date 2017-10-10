package edu.skku.loop;

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("단을 입력하세요.");
		
		int dan = scan.nextInt();
		
		for(int i = 1; i < 10 ; i++){
			System.out.println(dan + " * " + i + " = " + dan*i);
		}//end for
		
		
	}//end main
}//end class
