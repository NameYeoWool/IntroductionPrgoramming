import java.util.Scanner;

public class Main1147 {
	static int[][] dice = new int[10010][7];
        //  0 번 배여른 주사위 숫자에 해당하지 않으므로 0을 넣어주었다.
	static int[] patter = {0 , 6 , 4 , 5, 2,3,1};
	static int N;
	static long ans;
	static long Max(long x, long y){ return x > y ? x : y ;}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		int i, j;
		for(i = 1; i<=N; i ++){
			for( j =1;  j<=6; j++){
				dice[i][j] = in.nextInt();
				
			}
		}
		
		for(i =1 ; i <= 6; i++){
			//int temp = f(1,i,0);
			//if(ans<tmp) ans =tmp;
			// 주사위, 밑면, 던지기 전 합계
			ans = Max(ans,(long)f(1, i, 0));
			
		}
		System.out.println(ans);
		

	}
	
	private static int f(int level, int bottom, int sum){
		if(level > N) return sum;
		// 밑면의 위치 찾아서 top 값 구하기
		int top=0, side=4;
		for(int i = 1 ; i <=6 ; i++){
			if(dice[level][i]== bottom) top = dice[level][patter[i]];
		}
		
		//옆면 구하기
		if(bottom != 6 && top != 6) side = 6;
		else if(bottom != 5 && top != 5 ) side = 5;
		
		return f(level+1,top,sum+side);
		
	}
	

}