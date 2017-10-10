import java.util.Scanner;

public class Main1309 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextLong();
		
		System.out.println(fac(n));
		
	}

	static long fac(long n){
		if(n==1) {
			System.out.printf("%d! = %d\n",n,n);
			return 1;
		}
		System.out.printf("%d! = %d * %d!\n",n,n,n-1);
		return n*fac(n-1);
		
	}
	
}
