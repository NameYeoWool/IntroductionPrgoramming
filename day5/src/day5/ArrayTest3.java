package day5;

import java.util.Scanner;

public class ArrayTest3 {
	
	public static void main(String[] args) {
		int[] ks = { 70, 87, 76, 59, 84, 96, 77, 88 , 86, 63};
		
		//배열에 들어있는 값 중 가장 작은 값과 그 위치를 구하세요.
		int min=ks[0]; // 들어올 값의 최대 boundary를 모르므로 *****첫 번째 배열이 가장 작다고 가정
		int position = 0; // ****첫번째 배열이 가장 작다고 가정했기 때문에, 0 값을 가져야 함.
		for(int i = 0 ; i < ks.length; i ++){
			if(min>ks[i]) {
				min = ks[i];
				position = i;
			}
		}
		
		System.out.println("최솟값: "+ min +"\n위치: "+position);
		
		
		for(int i = 0 ; i <ks.length; i++){
			System.out.print(ks[i]+" ");
		}
		System.out.println();
		
		//java 5.5 부터 추가된 자바 for-each문 
		// 입력 못 받고 , 무조건 끝까지 돎 ( 중간 멈춤 불가)
		// 위치구하기 불가
		// for( int k : datas[배열,collecton])
		for(int k : ks){
			System.out.print(k+" ");
		}
		
	}//end main

}// end class
