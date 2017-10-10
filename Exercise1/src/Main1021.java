import java.util.Scanner;

public class Main1021 {
	static int N, M;
	static int[][] part = new int[110][110];
	static int[] need;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		M = scan.nextInt();

		need = new int[M + 10];

		int i, j;

		Count(N, 1);

		for (i = 1; i < N; i++) {
			if (need[i] != 0)
				System.out.println(i + " " + need[i]);
		}

	}

	static int Count(int n, int s) {
		if (n <= 0)
			return 1;
		for (int i = 1; i < n; i++) {
			if (part[n][i] != 0) {
				return Count(i, part[n][i]) * part[n][i];
			}
		}
		return 1;

		// int cnt = 0;
		// for(int i = 1; i <n; i++){
		// if(part[n][i] == 0 ) cnt++;
		// need[i]=*part[n][i];
		// Count(,);
		// }
		// if( cnt == n-1) return;

	}

}
