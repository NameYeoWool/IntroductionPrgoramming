package ���������;

// Stream �ڵ�� 1byte ������ �������� ������ ���ڰ� Ŀ���� ����� ǥ������ ���Ѵ�.

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
		// (char) �� �� ���־ �ڵ����� �ƽ�Ű �ڵ� ������ ��ȯ�ؼ� ����.
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
