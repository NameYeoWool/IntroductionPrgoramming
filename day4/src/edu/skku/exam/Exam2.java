package edu.skku.exam;

import java.util.Random;

public class Exam2 {

	public static void main(String[] args) {

		Random ran = new Random();
		
		//이중 for문 시 행을 의미
		for (int j = 0; j < 5; j++) {
			// 열을 의미
			for (int i = 0; i < 6; i++) {
				int su = ran.nextInt(45) + 1; // 1 ~45
				//printf : printFormat 줄임말
				//교수님코드   d는 십진수 쓴다는 의미, f는 float 실수 의미
				//%-3d 하면 왼쪽 정렬
				System.out.printf("%3d",su);
				
				//내가 한 코드가 맞는듯 잘안쓰셔서 그런듯
				//System.out.printf("%2d ",su);
			}
			System.out.println();

		}

	}

}
