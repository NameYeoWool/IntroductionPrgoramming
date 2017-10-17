package edu.skku.java7;

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
		
		
		
		//교수님 풀이
		int sum = 0 ;
		for(int r= 0; r<5; r++){
			sum = sc[r][1] + sc[r][2] +sc[r][3];
			//이상이니까 절사 되어서 70이라 상관이 없다.
			if(sum/3 >= 70){
				System.out.println(sc[r][0]);
			}
		}
	}

}

