package edu.skku.exam;

import java.util.Scanner;

public class Exam6 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int i, j; 
		
		char ch = 'A';
		
		for(int r= 1; r<=n; r++){
			//°ø¹éÂï±â
			for(int sp=1; sp<=n-r; sp++){
				System.out.print("  ");
			}
			//¾ËÆÄºª Âï±â
			for(int c=1; c<=2*r-1; c++){
				if(ch>'Z') ch='A';
				System.out.printf("%2c",ch++);
			}
			System.out.println();
		}
		/* µð¹ö±ë ÇØº¼°Í ¿Ö¾ÈµÇÁö ;;
		for(i = 0; i<n; i++){
			for(j=0; j<n-i; j++){
				System.out.print("  ");
			}
			for(j = 0 ; j< i*2-1; j++){
				if(ch>'Z') ch= 'A';
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
*/	
	}

}
