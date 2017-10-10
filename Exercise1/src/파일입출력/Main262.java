package 파일입출력;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class Main262 {

	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m= scan.nextInt();
		int hap = sum(n ,m);
		
		Writer out = new FileWriter("exe2.txt");
		out.write((char)hap);
		
		Reader in = new FileReader("exe2.txt");
		int a = in.read();
		System.out.println(a);
		
		if( in != null) in.close();
		if( out != null) out.close();
		
		
		
	}
	
	static int sum(int n, int m ){
		int hap = 0;
		for( int i = n; i <= m ; i++){
			hap += i ;
		}
		
		return hap;
	}

}
