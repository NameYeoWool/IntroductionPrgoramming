package edu.skku.java6;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		int[] score = new int[10];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < score.length; i++) {
			score[i] = scan.nextInt();
		}

		// 1�� ã��

		for (int base = 0; base < score.length - 1; base++) {
			int max = score[base];
			int pos = base;

			for (int a = base+1; a < score.length; a++) {
				if (max < score[a]) {
					max = score[a];
					pos = a;
				}
			}
			// System.out.println("�ְ�����:"+max+" ��ȣ:"+(pos+1));
			// 1���� 0�������� �̵�
			// ���� �ű�� - score[pos] ���� max�� ������ �ִ�.
			score[pos] = score[base];
			// ���� ū �濡 max ��
			score[base] = max;
		}
		
		for(int i = 0 ; i<score.length ; i++){
			System.out.println(score[i]+ " ");
		}
	}
}
