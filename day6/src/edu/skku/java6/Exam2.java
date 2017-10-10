package edu.skku.java6;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		int[] score = new int[10];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < score.length; i++) {
			score[i] = scan.nextInt();
		}

		// 1등 찾기

		for (int base = 0; base < score.length - 1; base++) {
			int max = score[base];
			int pos = base;

			for (int a = base+1; a < score.length; a++) {
				if (max < score[a]) {
					max = score[a];
					pos = a;
				}
			}
			// System.out.println("최고점수:"+max+" 번호:"+(pos+1));
			// 1등을 0번방으로 이동
			// 먼저 옮기고 - score[pos] 값은 max가 가지고 있다.
			score[pos] = score[base];
			// 가장 큰 방에 max 값
			score[base] = max;
		}
		
		for(int i = 0 ; i<score.length ; i++){
			System.out.println(score[i]+ " ");
		}
	}
}
