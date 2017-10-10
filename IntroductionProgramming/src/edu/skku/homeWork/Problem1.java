package edu.skku.homeWork;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i, j;

		// 입력 데이터가 앞에 1,2,3,4,5 가 붙어있는 건지 아닌건지 모르겠어서 2가지 경우를 모두 만들었습니다.

		// 입력 - 1,2,3,4,5 앞의 index를 받지 않을경우

		// int[][] score = new int[5][3];

		/*
		 * for(i =0 ; i < score.length; i++){ for(j = 0 ; j
		 * <score[i].length;j++){ score[i][j]=scan.nextInt();
		 * 
		 * } }
		 */

		// 입력- 1,2,3,4,5 앞의 index를 받을 경우

		int[][] score = new int[5][4];

		for (i = 0; i < score.length; i++) {
			for (j = 0; j < score[i].length; j++) {
				score[i][j] = scan.nextInt();
			}
		}

		// 합
		// 입력 1일 경우
		/*
		 * for(i=0 ; i < score.length; i++){ int sum=0; for(j = 0 ; j
		 * <score[j].length;j++){ sum += score[i][j]; } if(check(sum))
		 * System.out.println(i+1); }
		 */

		// 입력 2일 경우
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
