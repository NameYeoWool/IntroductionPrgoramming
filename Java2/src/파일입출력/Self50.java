package 파일입출력;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


class Student{
	static int n = 0;
	private String name;
	private int score, rank, index;
	
	Student(){}
	Student(String name, int score, int index){
		this.name = name;
		this.score = score;
		this.index = index;
	}
	
	void setRank(int rank){
		this.rank=rank;
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
	int getIndex(){
		return index;
	}
}

public class Self50 {
	static Student[] stu = new Student[100];
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new BufferedReader(new FileReader("Self4.txt")));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output5.txt")));
		
		int index = 0;
		while(in.hasNext()){
			stu[Student.n++]= new Student(in.next(),in.nextInt(),index++);
			
		}
		
		sort_rank();
		sort_index();
		
		out.println("Name Score Rank");
		System.out.println("Name Score Rank");
		for( int i = Student.n-1 ; i >= 0; i --){
			out.printf("%6s %4d %4d",stu[i].getName(),stu[i].getScore(),stu[i].getRank());
			out.println();
			System.out.printf("%6s %4d %4d",stu[i].getName(),stu[i].getScore(),stu[i].getRank());
			System.out.println();
			
		}
		
		if( in != null) in.close();
		if( out != null) out.close();
		
	}
	
	static void sort_rank(){
		Student tmp = new Student();
		int i , j ;
		for( i = 0 ;  i <Student.n-1 ; i ++){
			for( j = i+1 ;  j < Student.n; j++){
				if(stu[i].getScore() < stu[j].getScore()){
					tmp = stu[i];
					stu[i] = stu[j];
					stu[j] = tmp;
				}
			}
		}
		
		stu[0].setRank(1);
		for( i = 1 ; i< Student.n; i++){
			if(stu[i].getScore()==stu[i-1].getScore()){
				stu[i].setRank(stu[i-1].getRank());
			}else{
				stu[i].setRank(i+1);
			}
		}
		
	}
	static void sort_index(){
		int i, j ;
		Student tmp = new Student();
		for(i = 0 ; i < Student.n -1; i ++){
			for(j = i+1 ; j <Student.n; j++){
				if(stu[i].getIndex()<stu[j].getIndex()){
					tmp = stu[i];
					stu[i] = stu[j];
					stu[j] = tmp;
				}
			}
		}
	}

}


