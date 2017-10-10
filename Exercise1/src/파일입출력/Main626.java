package 파일입출력;

// Stream 코드는 1byte 단위로 가져오기 때문에 숫자가 커지면 제대로 표시하지 못한다.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Main626 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int hap = sum(n,m);
		
		
		OutputStream out = new FileOutputStream("output.txt");
		// (char) 를 안 써주어도 자동으로 아스키 코드 값으로 변환해서 들어간다.
		out.write(hap);
		
		InputStream in = new FileInputStream("output.txt");
		int a = in.read();
		System.out.println(a);
		
		
		
		
		if( in != null) in.close();
		if(out != null) out.close();
		
	}
	
	static int sum(int n, int m){
		int hap=0;
		for(int s = n ; s <=m ; s++){
			hap += s;
		}
		
		return hap;
	}

}
