package edu.skku.exam;

import java.util.Random;

public class Exam2 {

	public static void main(String[] args) {

		Random ran = new Random();
		
		//���� for�� �� ���� �ǹ�
		for (int j = 0; j < 5; j++) {
			// ���� �ǹ�
			for (int i = 0; i < 6; i++) {
				int su = ran.nextInt(45) + 1; // 1 ~45
				//printf : printFormat ���Ӹ�
				//�������ڵ�   d�� ������ ���ٴ� �ǹ�, f�� float �Ǽ� �ǹ�
				//%-3d �ϸ� ���� ����
				System.out.printf("%3d",su);
				
				//���� �� �ڵ尡 �´µ� �߾Ⱦ��ż� �׷���
				//System.out.printf("%2d ",su);
			}
			System.out.println();

		}

	}

}
