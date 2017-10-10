package day_9_26;

import java.util.Scanner;

public class Problem4 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt()%10;
		
		int i , j ;
		
		int m = 0 ;
		
		for(i=0; i < n ; i ++){
			for( j = 0 ; j <=i ; j++){
				System.out.print(m++ + " ");
			}
			System.out.println();
		}
	}

}
