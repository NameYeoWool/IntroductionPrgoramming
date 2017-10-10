package 자료처리;

import java.util.Scanner;

public class Main1157 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i, j ; 
		int n  = scan.nextInt();
		int m = 0;
		
		int[] arr = new int[n+1];
		
		for(i = 0 ; i < n ; i++){
			arr[i] = scan.nextInt();
		}
		
		int tmp;
		while(true){
			for( i = 0 ; i < n-1; i++){
				if(arr[i] > arr[i+1]){
					tmp =arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
				}
			}
			
			for(int k = 0 ; k <n; k++){
				System.out.print(arr[k]  + " ");
			}
			System.out.println();
			m++;
			if(m== n-1) break;
		}
		
		
		

	}

}
