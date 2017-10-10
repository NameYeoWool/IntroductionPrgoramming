package 자료처리;

import java.util.Scanner;

public class Main1814 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		int i , j ;
		int n = scan.nextInt();
		int[] arr = new int[n+1];
		
		
		for( i = 0 ; i < n; i ++){
			arr[i] = scan.nextInt();
		}
		
		int tmp;
		for( i = 0 ; i < n ; i ++){
			for( j = 0 ; j < i ; j++){
				if(arr[i]<arr[j]){
					tmp = arr[i];
					
					for( int h = i-1 ; h >= j; h--){
						arr[h+1] = arr[h];
						cnt++;
					}
					
					arr[j]= arr[i];
					
				}
			}
		}
		
		System.out.println(cnt);
	}

}
