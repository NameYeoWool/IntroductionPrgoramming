package edu.skku.school;

public class Student {
	int num;
	String name;
	int score; // ���� ����
	
	public void study(){
		int k = 7; // ���� ����(local)
		score++;
		System.out.println(name+ "���� ��..."+score);
	}
	public void study(int time){
		score = score*time;
		System.out.println(name+ "���� ��..."+score);
	}
	public void play(int time){
		score=score-time;
		System.out.println(name+ "��� ��..."+score);
	}
}
