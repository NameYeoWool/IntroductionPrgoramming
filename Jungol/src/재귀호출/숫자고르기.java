package ���ȣ��;

import java.util.Scanner;

public class ���ڰ��� {
	static int N,cnt;
	static int[] a = new int[110];
	static int[] check = new int[110];
	static int[] sel = new int[110];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, j;
		
		N = scan.nextInt();
		for(i = 1 ; i <= N ; i ++){
			a[i]=scan.nextInt();
		}
		
		
		for( i =1 ; i <=N; i ++){
			for(j = 1; j <=N ;j++) check[j] = 0;
			
			if(f(i,a[i])==1){
				sel[++cnt] = i;
			}
		}
		
		System.out.println(cnt);
		for(i =1 ; i <= cnt; i++){
			System.out.println(sel[i]);
		}
	}
	
	static int f(int s, int e){
		if(s == e) return 1;
		if(check[e]==1) return 0;
		check[e] = 1;
		return f(s,a[e]);
	}
	
	
	
	

}
