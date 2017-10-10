package 파일입출력;

/// 결과값 안나온다 ㅠㅠ

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/*
class Student{
	static int n = 0 ;
	private String name;
	private int score,rank;
	
	Student(){}
	
	Student(String name, int score){
		this.name= name;
		this.score= score;
	}
	
	String getName(){
		return name;
	}
	
	int getScore(){
		return score;
	}
	
	int getRank(){
		return rank;
	}
	
	void setRank(int rank){
		this.rank = rank;
	}
	
}
*/

public class Self5 {
	static Student[] stu = new Student[100];
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new BufferedReader(new FileReader("input5.txt")));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
		
		
		int i , j ;
		
		while(in.hasNext()){
			stu[Student.n++] = new Student(in.next(),in.nextInt());
		}
		
		sort();
		
		System.out.println("이름 점수 등수");
		out.println("이름 점수 등수");
		
		for( i = 0 ; i < Student.n; i ++){
			out.printf("%3s %3d %2d\n",stu[i].getName(),stu[i].getScore(),stu[i].getRank());
			out.println();
		}
		
		in.close();
		out.close();
	}
	
	static void sort(){
		Student tmp = new Student();
		int i, j;
		for( i = 0 ; i <Student.n-1; i++){
			for( j = i+1 ; j < Student.n ; j++){
				if(stu[i].getScore()<stu[j].getScore()){
					tmp =stu[i];
					stu[i] = stu[j];
					stu[j] = tmp;
				}
			}
		}
		
		stu[0].setRank(1);
		for( i = 1; i < Student.n; i ++){
			if(stu[i].getScore() == stu[i-1].getScore()){
				stu[i].setRank(stu[i-1].getRank());
			}else{
				stu[i].setRank(i+1);
			}
			
		}
		
	}

}
