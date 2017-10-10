package edu.skku.java6;

import java.util.Scanner;

public class Exam_1 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] sc = new int[5][4];
		
		//데이터 입력 20개 데이터
		for(int r = 0 ; r<5; r++) {//sc.length
			for(int c = 0 ; c<4; c++){//sc[r].length
				sc[r][c] = s.nextInt();
			}
		}
		
		//처리
		//각 행별 합게를 구하고 평균을 구해서 70이상일 경우 번호
		//번호 출력
	}

}

