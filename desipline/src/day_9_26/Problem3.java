package day_9_26;

import java.util.Scanner;

public class Problem3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int i , j ;
		
		char ch = 'A';
		
		for(i = 0; i < n; i ++){
			for( j = 0 ; j < n ; j ++){
				if(ch>'Z') ch = 'A';
				System.out.printf("%-2c",ch++);
			}
			System.out.println();
		}
		
		
	}

}
