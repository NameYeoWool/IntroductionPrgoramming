package edu.skku.practice_midterm;

import java.util.Scanner;

public class Problem5 {
	
	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		
		int n = scan.nextInt();
		
		char ch = 'A';
		
		for(int i = 1 ; i <= n ; i++){
			for(int j = 1 ; j <= n - i ; j++){
				System.out.print("  ");
				
			}
			for(int j = 0 ; j< i ; j ++){
				if(ch>'Z') ch = 'A';
				System.out.print(ch +" ");
				ch++;
			}
			System.out.println();
				
		}
		
	}

}
