package edu.skku.school;

public class Student {
	int num;
	String name;
	int score; // 전역 변수
	
	public void study(){
		int k = 7; // 지역 변수(local)
		score++;
		System.out.println(name+ "공부 중..."+score);
	}
	public void study(int time){
		score = score*time;
		System.out.println(name+ "공부 중..."+score);
	}
	public void play(int time){
		score=score-time;
		System.out.println(name+ "노는 중..."+score);
	}
}
