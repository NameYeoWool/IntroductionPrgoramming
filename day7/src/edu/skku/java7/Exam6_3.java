package edu.skku.java7;

import java.util.Scanner;

public class Exam6_3 {
	
	public static void main(String[] args) {
		// day 7 ���� �ȿ� �ִ� data.txt �о����
		//Scanner s = new Scanner(new File("data.txt"));
	
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();// �迭 ������ �Է�
		
		int[][] ns = new int[n][n];
		
		int cnt = 1;
		
		for( int c = 0 ; c < n ; c++){
			for(int r = 0 ; r<n; r++){
				ns[r][c] = cnt++;
			}
		}
		
		//���
		for(int r= 0 ; r< n; r++){
			for(int c= 0; c < n ; c++){
				//System.out.print(ns[r][c]+ " ");
				System.out.printf("%3d ",ns[r][c]);
			}
			System.out.println();
		}	
		
		
	}//end main

}
