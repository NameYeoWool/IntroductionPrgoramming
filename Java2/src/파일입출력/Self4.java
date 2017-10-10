package 파일입출력;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Self4 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
		
		int N = in.nextInt();
		
		double[] d = new double[N+2];
		
		for(int i = 0; i < N ; i++){
			d[i] = in.nextDouble();
		}
		
		for(int i = 0 ; i < N ; i ++){
			double s= d[i]/2/3.14;
			System.out.printf("%.2f\n",s);
		}
		
		in.close();
	}

}
