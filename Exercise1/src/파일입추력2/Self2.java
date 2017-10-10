package 파일입추력2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Self2 {

	public static void main(String[] args) throws IOException {
		
		Writer out = new FileWriter("input.txt");
		String data= "동해물과 백두산이 마르고 닭도록\r\n하느님이 보우하사 우리나라 만세\r\n무궁화 삼천리 화려강산\r\n대한사람 대한으로 길이보전하세";
		out.write(data);
		
		Reader in = new FileReader("input.txt");
		int len, i;
		
		char[] cbuf = new char[30];
		len = in.read(cbuf);
		System.out.println(len);
		
		while(true){
			len = in.read(cbuf);
			if( len == -1) break;
			for( i = 0 ; i < len; i ++) System.out.print(cbuf[i]); 
			System.out.println();
			
		}
		
		
		if( out != null) out.close();
		if( in != null) in.close();
	}

}

