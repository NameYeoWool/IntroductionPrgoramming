package ���������;

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
			// wirte �ϸ� (char) �Ƚ��־ �ڵ����� �ƽ�Ű �ڵ忡 �ش��ϴ� ������ ��ȯ�Ѵ�.
			out.write((char)i);
			i++;
		}
		
		InputStream in = new FileInputStream("output.txt");
		
		int a;
		while((a=in.read()) != -1){
			// �׷��� ����Ҷ��� read() �Լ�  1byte ������ ���ڷ� �о���� ������
			// ���ڷ� ����ϱ� ���ؼ��� (char) �� ����ȯ�� ���־�� �Ѵ�.
			System.out.print((char)a);
		}
		
		
		if(out != null) out.close();
		if(in != null) in.close();
		
	}

}
