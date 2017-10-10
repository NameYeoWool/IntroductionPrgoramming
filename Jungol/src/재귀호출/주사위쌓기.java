package Àç±ÍÈ£Ãâ;

import java.util.Scanner;

public class ÁÖ»çÀ§½×±â {
	static int[][] dice = new int [10010][7];
	static int[] pattern =  {0 , 6, 4, 5 , 2, 3, 1};
	static int N;
	static long ans;
	static long Max(long x, long y) { return x> y ? x:y;}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		int i, j ;
		for( i = 1; i <= N ; i++){
			for(j =1; j <= 6; j ++){
				dice[i][j] = in.nextInt();
			}
		}
		
		
		for( i = 1; i <=6; i ++){
			ans = Max(ans,(long)f(1,i,0));
		}
		System.out.println(ans);
		
	}
	
	
	private static int f(int level, int bottom,int sum){
		if( level>N) return sum;
		int top = 0, side= 4;
		for(int i = 1; i <= 6 ; i++){
			if(dice[level][i]==bottom) top = dice[level][pattern[i]];
		}
		
		if(bottom != 6 && top != 6) side = 6;
		else if(bottom != 5 && top !=5) side =5;
		
		return f(level+1,top,sum+side);
	}

}
