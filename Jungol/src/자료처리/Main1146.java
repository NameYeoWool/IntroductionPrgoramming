package 자료처리;

import java.util.Scanner;

public class Main1146 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] arr = new int[n+1];
		int[] srr = new int[n+1];
		
		for(int i = 0 ; i < n ; i ++){
			arr[i] = scan.nextInt();
		}
		
		System.arraycopy(arr, 0, srr, 0, arr.length);
		
		int tmp;
		
		for( int i = 0 ; i <n-1 ; i ++){
			for( int j = i+1 ; j< n; j++){
				if( srr[i] > srr[j] ){
					tmp = srr[i];
					srr[i] = srr[j];
					srr[j] = tmp;
				}
			}
		}
		
		
		for( int i = 0 ; i < n-1 ; i ++){
			for( int j = i ; j < n ; j ++){
				if(srr[i] == arr[j] ){
					int s = arr[i];
					arr[i] = arr[j];
					arr[j] = s;
					
					
					for(int h = 0 ; h < n ; h ++){
						System.out.print(arr[h] + " ");
					}
					System.out.println();
				}
				
				
				
			}
		}
		
		
		
	}

}
