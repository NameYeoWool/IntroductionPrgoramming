package edu.skku.homeWork;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i, j;

		// �Է� �����Ͱ� �տ� 1,2,3,4,5 �� �پ��ִ� ���� �ƴѰ��� �𸣰ھ 2���� ��츦 ��� ��������ϴ�.

		// �Է� - 1,2,3,4,5 ���� index�� ���� �������

		// int[][] score = new int[5][3];

		/*
		 * for(i =0 ; i < score.length; i++){ for(j = 0 ; j
		 * <score[i].length;j++){ score[i][j]=scan.nextInt();
		 * 
		 * } }
		 */

		// �Է�- 1,2,3,4,5 ���� index�� ���� ���

		int[][] score = new int[5][4];

		for (i = 0; i < score.length; i++) {
			for (j = 0; j < score[i].length; j++) {
				score[i][j] = scan.nextInt();
			}
		}

		// ��
		// �Է� 1�� ���
		/*
		 * for(i=0 ; i < score.length; i++){ int sum=0; for(j = 0 ; j
		 * <score[j].length;j++){ sum += score[i][j]; } if(check(sum))
		 * System.out.println(i+1); }
		 */

		// �Է� 2�� ���
		for (i = 0; i < score.length; i++) {
			int sum = 0;
			for (j = 1; j < score[j].length; j++) {
				sum += score[i][j];
			}
			if (check(sum))
				System.out.println(i + 1);
		}

	}

	public static boolean check(int sum) {
		double avg = sum / 3.0;
		if (avg >= 70)
			return true;
		return false;
	}

}
