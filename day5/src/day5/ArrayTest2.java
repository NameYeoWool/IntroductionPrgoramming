package day5;

import java.util.Scanner;

public class ArrayTest2 {
	
	public static void main(String[] args) {
		//int[] ks;
		//ks = new int[10;
		int[] ks = new int[10];
		Scanner s = new Scanner(System.in);
		
		//입력 ,처리, 결과출력은 따로 작성해서 가독성있게
		//입력
		int i = 0;
		for(; i < ks.length ; i++){
			int count=0;
			ks[i] = s.nextInt();
		}
		
		//처리
		//1. 입력 수의 합을 구하시오.
		int sum = 0;
		for( int j = 0 ; j <ks.length; j++){
			sum = sum + ks[j];
		}
		System.out.println("합계: " + sum);
		
		//2. 입력된 수 중 가장 큰 수를 구하시오.
		int max = ks[0]; // 음수 가장 작은 값을 계산하기 힘들기때문에, *******배열의 첫번째 값을 가장 작다고 가정하고 비교 시작.*******
		
		for(int j = 0 ; j < ks.length ; j ++){
			//내 코드
			//max = ( max <= ks[j])? ks[j] : max;
			
			//교수님 코드
			if(max< ks[j]) max = ks[j];
		}
		System.out.println("최고값: " + max);
		//System.out.println(i);  // 10 찍힌다.
		//System.out.println(count); // 블럭 안에서 만들어진 것은 블럭 안에서만 유효하다. count는 for문 안에서만 선언되어 있음.
		
		//결과 출력
		/*for(int j = 0 ; j < ks.length; j++){
			System.out.println(ks[j]);
		}*/
		
		
		
	}//end main

}// end class
