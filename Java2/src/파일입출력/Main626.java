package 파일입출력;

import java.util.Scanner;

public class Main626 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int hap =0;
		for( int i= n ; i <=m ; i++){
			hap = hap + i;
		}
		
		System.out.println(hap);
	}

}
