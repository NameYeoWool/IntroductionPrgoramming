package 파일입출력;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Self3 {

	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(new BufferedReader(new FileReader("input3.txt")));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:\\temp\\output.txt")));
		
		
		String[] a1 = new String[110];
		int i=0 ;
		String c;
		
		
		
		while(true){
			c = scan.nextLine();
			if(c==null)break;
			a1[i++] = c;
		}
		
		for(int j = i-1; j >=0; j-- ){
			out.println(a1[j]);
		}
		
		scan.close();
		out.close();
				
				
	}

}
