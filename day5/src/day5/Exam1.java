package day5;

import java.util.Scanner;

public class Exam1 {
	static int[] ks = new int[10];
	public static void main(String[] args) {
		//static 
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i < ks.length; i++){
			ks[i]=scan.nextInt();
		}
		
		//1. 합계
		int sum = total();
		//2. 평균
		double avg = sum/10.;// 정수형/실수 하게되면 실수형 자동형변환
		System.out.println("평균:"+avg);
		//3. 최대값
		int a = max();
		//4. 최소값
		int b = min();
		//5. 최대 최대의 차이
		System.out.println("차이 : " + (a-b));// 더하기 빼기 우선순위가 같아서 "차이: " + a 먼저 계산하므로
										// 괄호 처줌
		//6. 평균과의 차 
		for(int k : ks){
			//System.out.print((int)(avg-k)+ " ");
			System.out.printf("%4.1f",avg-k); // 4는 '전체 크기' 1은 '소수점 이하 자리 수  **소수 둘째 자리에서 반올림
												// 소수점 자리 '.' 도 전체 크기에서 한자리 차지한다.
			
		}
		
		
		
	}//end main
	
	public static int total(){
		int sum = 0;
		for(int k : ks){
			sum = sum +k;
		}
		System.out.println("합계:"+sum);
		return sum;
	}
	
	public static int max(){
		int max = ks[0];
		//내 코드
		/*for(int k : ks){
			if(max<k) max = k;
		}*/
		
		//교수님 코드
		
		for(int i=1 ; i<ks.length; i++){
			if(max<ks[i]){
				max=ks[i];
			}
		}
		System.out.println("최대값:"+max);
		return max;
	}
	
	public static int min(){
		int min = ks[0];
		
		for(int i=1 ; i<ks.length; i++){
			if(min>ks[i]){
				min=ks[i];
			}
		}
		System.out.println("최소값:"+min);
		return min;
	}
	
	

}//end class
