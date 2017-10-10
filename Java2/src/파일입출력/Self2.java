package 파일입출력;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Self2 {

	public static void main(String[] args) throws IOException {
		
		Writer out = new FileWriter("input.txt");
		String data= "동해물과 백두산이 마르고 닳도록\r\n하느님이 보우하사 우리나라 만세\r\n무궁화 삼천리 화려강산\r\n대한사람 대한으로 길이보전하세";
		out.write(data);
		
		out.close();
		
		Reader in = new FileReader("input.txt");
		int len, i;
		
		// char 범위를 왜이리 높게 잡아야 잘 나오는지는 모르겠다.
		char[] cbuf = new char[70];
		
		while(true){
			len = in.read(cbuf);
			if( len == -1) break;
			for(i=0; i< len; i++)System.out.print(cbuf[i]);
			System.out.println();
		}
		
		
		in.close();
		
		
	}

}


