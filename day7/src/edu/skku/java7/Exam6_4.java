package edu.skku.java7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exam6_4 {
	
	public static void main(String[] args) throws FileNotFoundException {
		//Scanner s = new Scanner(System.in);
		// 폴더 경로를 지정해 줄 수 있다.
		Scanner s = new Scanner(new File("data/data.txt"));
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
		int max = 0; // 가장 작은 값 셋팅
		int pos = -1; // 나올 수 없는 index 값을 position으로 준다. 
		for(int r= 0; r<5; r++){
			sum = sc[r][1] + sc[r][2] +sc[r][3];
			// %5.2f - 전체 5자리중 2자리는 소수점 이하 2자리
			// 3.0 이랑 3.  같은 표현이다.
			// 소수점도 한자리로 인식한다 - %6.2f   -   공백68.00 - 총 6자리
			System.out.printf("%3d%3d%3d%3d%4d%6.2f\n"
					,sc[r][0], sc[r][1],sc[r][2],sc[r][3],sum,sum/3.0);
			
			if(max<sum){
				max = sum;
				pos =sc[r][0];//큰 총점의 번호를 저장
			}//end if
			
			
		}//end for
		
		System.out.println("1등은 "+pos+"번");
		
		
	}//end main
	
}

