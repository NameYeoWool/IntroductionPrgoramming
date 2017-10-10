import java.util.Scanner;

public class Main1147 {
	static int[][] dice = new int[10010][7];
        //  0 �� �迩�� �ֻ��� ���ڿ� �ش����� �����Ƿ� 0�� �־��־���.
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
			// �ֻ���, �ظ�, ������ �� �հ�
			ans = Max(ans,(long)f(1, i, 0));
			
		}
		System.out.println(ans);
		

	}
	
	private static int f(int level, int bottom, int sum){
		if(level > N) return sum;
		// �ظ��� ��ġ ã�Ƽ� top �� ���ϱ�
		int top=0, side=4;
		for(int i = 1 ; i <=6 ; i++){
			if(dice[level][i]== bottom) top = dice[level][patter[i]];
		}
		
		//���� ���ϱ�
		if(bottom != 6 && top != 6) side = 6;
		else if(bottom != 5 && top != 5 ) side = 5;
		
		return f(level+1,top,sum+side);
		
	}
	

}