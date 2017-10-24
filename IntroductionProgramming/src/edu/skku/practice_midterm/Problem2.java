package edu.skku.practice_midterm;

import java.util.Random;

public class Problem2 {
	
	public static void main(String[] args) {
		Random r = new Random();
		
		int x ; 
		
		for( int i = 0 ; i <5 ; i++){
			for(int j = 0; j < 6; j ++){
				x = r.nextInt(45) + 1;
				System.out.printf("%2d " , x);
			}
			System.out.println();

		}
	}

}
