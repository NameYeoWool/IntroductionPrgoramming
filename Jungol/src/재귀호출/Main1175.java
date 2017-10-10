package Àç±ÍÈ£Ãâ;

import java.util.Scanner;

public class Main1175 {
	static int[] arr= new int[10];
	static int N ;
	static int M;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		M = scan.nextInt();
		
		dice(1);
	}
	
	static void dice(int n){
		int i;
		int ans=0;
		if(n > N){
			for(i = 1 ; i <=N; i ++){
				ans = ans+ arr[i];
			}
			if( ans != M) return;
			
			for( i = 1; i <= N ; i ++){
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		
		for( i = 1 ; i <=6; i ++){
			arr[n]=i;
			dice(n+1);
		}
		
	}

}
