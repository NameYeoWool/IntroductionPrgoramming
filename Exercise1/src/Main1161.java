import java.util.Scanner;

public class Main1161 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		hanoi(n,1,3);

	}
	
	static void hanoi(int n,int s , int e){
		if(n<=0) return;
		hanoi(n-1,s,6-s-e);
		System.out.printf("%d : %d -> %d\n",n,s,e);
		hanoi(n-1,6-s-e,e);
	}

}
