package edu.skku.exam;

import java.util.Scanner;

public class Exam5 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n= scan.nextInt();
		
		char ch = 'A';
		
		for(int r= 1; r<=n; r++){
			//°ø¹éÂï±â
			for(int sp=1; sp<=n-r; sp++){
				System.out.print("  ");
			}
			//¾ËÆÄºª Âï±â
			for(int c=1; c<=r; c++){
				if(ch>'Z') ch='A';
				System.out.printf("%2c",ch++);
			}
			System.out.println();
		}
		
	}

}
