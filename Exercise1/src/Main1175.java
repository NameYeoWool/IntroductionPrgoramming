import java.util.Scanner;

public class Main1175 {
	static int[] arr = new int[8];
	static int[] check = new int[45];
	static int N;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		int m = scan.nextInt();
		dice(1, m);

	}

	static void dice(int n, int m) {
		int i;
		if (n > N) {
			int ans= 0;
			for(i=1; i<=N; i++){
				ans = ans + arr[i];
			}
			if( ans != m) return;
			
			for (i = 1; i <= N; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}

		for (i = 1; i <= 6; i++) {
			arr[n] = i;
			dice(n + 1, m);
		}
	}

}
