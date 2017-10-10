package 파일입출력;

import java.util.Scanner;

public class Main627 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[] d = new double[15];
		for( int i =0 ; i < 10; i ++){
			d[i]=scan.nextDouble();
		}
		
		double avg = (d[0] + d[9])/2;
		
		System.out.printf("%1.f",avg);
		
	}

}

