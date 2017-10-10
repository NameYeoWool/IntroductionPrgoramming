import java.util.Scanner;

public class Main1169 {
	static int[] arr = new int[6];
	static int[] check = new int[7];
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
			for ( i = 1; i <= N; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		
		if (m == 1) {
			for(i=1; i<=6 ; i++){
				arr[n]=i;
				dice(n+1,m);
			}

		} else if (m == 2) {
			for(i=1; i<=6 ; i++){
				arr[n]=i;
				if(arr[n]<arr[n-1]) continue;
				dice(n+1,m);
			}


		} else {
			for (i = 1; i <= 6; i++) {
				if (check[i] == 1)continue;
				arr[n] = i;
				check[i] = 1;
				dice(n + 1,m);
				check[i] = 0;

			}
		}
	}

}
