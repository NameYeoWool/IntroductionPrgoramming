package edu.skku.school;

public class Student {
	int num;
	String name;
	int score; // 전역 변수
	
	public Student(){}
	public Student(int num, String name, int score){
		this.num= num;
		this.name= name;
		this.score= score;
	}
	public Student(int num, String name){
		this.num= num;
		this.name= name;
		this.score= 0;
	}
	
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
