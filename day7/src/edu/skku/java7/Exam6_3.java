package edu.skku.java7;

import java.util.Scanner;

public class Exam6_3 {
	
	public static void main(String[] args) {
		// day 7 폴더 안에 있는 data.txt 읽어오기
		//Scanner s = new Scanner(new File("data.txt"));
	
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();// 배열 사이즈 입력
		
		int[][] ns = new int[n][n];
		
		int cnt = 1;
		
		for( int c = 0 ; c < n ; c++){
			for(int r = 0 ; r<n; r++){
				ns[r][c] = cnt++;
			}
		}
		
		//출력
		for(int r= 0 ; r< n; r++){
			for(int c= 0; c < n ; c++){
				//System.out.print(ns[r][c]+ " ");
				System.out.printf("%3d ",ns[r][c]);
			}
			System.out.println();
		}	
		
		
	}//end main

}
