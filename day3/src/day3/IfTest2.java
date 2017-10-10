package day3;

import java.util.Random;

public class IfTest2 {
	
	public static void main(String[] args) {
		
		//new Random() - Random이라는 클래스를 메모리로 읽어와라
		// import 단축키  : ctrl + shilft + O
		// Random을 저장할 수 있는 r을 만들고 새로 만든 Random의 주소값을 r에 저장
		Random r = new Random();
		
		// 특정값을 주면 0 부터 특정값 사이까지 나온다(특정값은 안나옴)
		// 0 ~ 100
		int score = r.nextInt(101);
		
		//이렇게 하면 -99~99까지 구할 수 있다  . 101로 나누면 -100 ~ 100 까지 구할 수 있다.
		//int score2 = r.nextInt()%100;
		
		// 50~100 사이 값
		//int score3 = r.nextInt(51) + 50;
		
		System.out.println(score);
		
		if(score >= 70){
			System.out.println("합격~");
		}else{
			System.out.println("불합격~");
		}
		
	}//main
}//IfTest1
