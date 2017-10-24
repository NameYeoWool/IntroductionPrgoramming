package edu.skku.practice_midterm;

import java.util.Scanner;

public class Problem3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		char ch = 'A';
		
		for(int i = 0 ; i < n ; i ++){
			for( int j = 0 ; j < n ; j ++){
				if(ch>'Z') ch = 'A';
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
		
		
	}

}
