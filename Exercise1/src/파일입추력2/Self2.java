package �������߷�2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Self2 {

	public static void main(String[] args) throws IOException {
		
		Writer out = new FileWriter("input.txt");
		String data= "���ع��� ��λ��� ������ �ߵ���\r\n�ϴ����� �����ϻ� �츮���� ����\r\n����ȭ ��õ�� ȭ������\r\n���ѻ�� �������� ���̺����ϼ�";
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

