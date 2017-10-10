package 자료처리;

import java.util.Scanner;

public class Main1295 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int i , j ;
		
		int n = scan.nextInt();
		int[] arr= new int[n+1];
		
		for( i = 0 ; i < n ; i ++){
			arr[i] = scan.nextInt();
		}
		
		int m = scan.nextInt();
		int[] brr= new int[m+1];
		int[] ans = new int[m+1];
		
		for( i = 0 ; i <m; i ++){
			brr[i] = scan.nextInt();
		}
		
		for( i = 0 ; i < m ; i ++){
			for(j = 0 ; j <n ; j++){
				if(brr[i]==arr[j]){
					ans[i]= j +1;
				}
			}
		}
		
		for(i = 0; i < m ; i ++){
			System.out.println(ans[i]);
		}
	}
}
