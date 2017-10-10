package day_9_26;

import java.util.Scanner;

public class Problem5 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt()%10;
		
		int i , j ;
		
		int m = 0 ;
		
		char ch = 'A';
		
		/*for(i = 0 ; i< n ; i ++){
			// 공백
			for(j= 0 ; j< n-i-1; j++){
				System.out.print("  ");
			}
			
			// 문자
			for(j = 0 ; j<= i ; j++){
				if(ch>'Z') ch = 'A';
				System.out.print(ch++ + " ");
			}
			
			//줄바꿈
			System.out.println();
		}*/
		
		
		// 1부터 시자하는게 생각하기 편한데?
		for( i =1; i <= n ; i++){
			for( j=1 ; j <= n -i; j++){
				System.out.print("  ");
			}
			for(j = 1;  j <=i; j++){
				if(ch>'Z') ch = 'A';
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
		
	}

}
