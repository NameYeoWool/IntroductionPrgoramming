package edu.skku.java7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exam6_4 {
	
	public static void main(String[] args) throws FileNotFoundException {
		//Scanner s = new Scanner(System.in);
		// ���� ��θ� ������ �� �� �ִ�.
		Scanner s = new Scanner(new File("data/data.txt"));
		int[][] sc = new int[5][4];
		
		//������ �Է� 20�� ������
		for(int r = 0 ; r<5; r++) {//sc.length
			for(int c = 0 ; c<4; c++){//sc[r].length
				sc[r][c] = s.nextInt();
			}
		}
		
		//ó��
		//�� �ະ �հԸ� ���ϰ� ����� ���ؼ� 70�̻��� ��� ��ȣ
		//��ȣ ���
		
		
		
		//������ Ǯ��
		int sum = 0 ;
		int max = 0; // ���� ���� �� ����
		int pos = -1; // ���� �� ���� index ���� position���� �ش�. 
		for(int r= 0; r<5; r++){
			sum = sc[r][1] + sc[r][2] +sc[r][3];
			// %5.2f - ��ü 5�ڸ��� 2�ڸ��� �Ҽ��� ���� 2�ڸ�
			// 3.0 �̶� 3.  ���� ǥ���̴�.
			// �Ҽ����� ���ڸ��� �ν��Ѵ� - %6.2f   -   ����68.00 - �� 6�ڸ�
			System.out.printf("%3d%3d%3d%3d%4d%6.2f\n"
					,sc[r][0], sc[r][1],sc[r][2],sc[r][3],sum,sum/3.0);
			
			if(max<sum){
				max = sum;
				pos =sc[r][0];//ū ������ ��ȣ�� ����
			}//end if
			
			
		}//end for
		
		System.out.println("1���� "+pos+"��");
		
		
	}//end main
	
}

