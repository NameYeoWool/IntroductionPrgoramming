package edu.skku.java7;

import java.util.Scanner;

public class Exam_1 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
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
		for(int r= 0; r<5; r++){
			sum = sc[r][1] + sc[r][2] +sc[r][3];
			//�̻��̴ϱ� ���� �Ǿ 70�̶� ����� ����.
			if(sum/3 >= 70){
				System.out.println(sc[r][0]);
			}
		}
	}

}

