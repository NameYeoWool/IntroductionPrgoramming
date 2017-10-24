package edu.skku.practice_midterm;

import java.util.Scanner;

public class Problem4 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int cnt = 0 ;
		for( int i = 0 ; i < n ; i ++){
			
			for( int j = 0; j <=i; j ++){
				System.out.print(cnt + " ");
				cnt++;
			}
			System.out.println();
		}
		
	}

}
