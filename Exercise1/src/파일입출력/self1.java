package 파일입출력;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class self1 {

	public static void main(String[] args) throws IOException {
		
		OutputStream out = new FileOutputStream("output.txt");
		
		int i = 50;
		while( i <= 70){
			// wirte 하면 (char) 안써주어도 자동으로 아스키 코드에 해당하는 값으로 변환한다.
			out.write((char)i);
			i++;
		}
		
		InputStream in = new FileInputStream("output.txt");
		
		int a;
		while((a=in.read()) != -1){
			// 그러나 출력할때는 read() 함숙  1byte 단위로 숫자로 읽어오기 때문에
			// 문자로 출력하기 위해서는 (char) 로 형변환을 해주어야 한다.
			System.out.print((char)a);
		}
		
		
		if(out != null) out.close();
		if(in != null) in.close();
		
	}

}
