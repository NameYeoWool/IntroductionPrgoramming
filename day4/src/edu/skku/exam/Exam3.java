package edu.skku.exam;

import java.util.Scanner;

public class Exam3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*int n = scan.nextInt();
		int i, j ;
		char ch= 'A';
		for(i= 0 ; i < n ; i ++){
			for(j = 0 ; j < n ; j++){
				if(ch>'Z') ch ='A';
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		*/
		
		//������ �ڵ�
		
		int n = scan.nextInt();//Ű����κ��� ���� �Է�
		
		//���� �ϳ��ϱ� �ݵ�� �̱� ''
		char ch = 'A';// ���������� ch�� 65 �� ����.
		for(int r= 1; r <= n ; r ++){// ���� ����
			for(int c =1 ; c <=n; c++){// ���� ����
				if(ch>'Z') ch ='A';
				//��� ���� ���� s �� String  c �� char
				System.out.printf("%-2c",ch++);
			}
			System.out.println();//�� �ٲ�
		}
		
	}

}
