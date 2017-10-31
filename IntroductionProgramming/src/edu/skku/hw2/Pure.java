package edu.skku.hw2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Pure {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("data/data.txt"));
		Random ran = new Random();
		
		//입력
		int n = scan.nextInt();
		int[][] map = new int[n][n];
		
		for(int r = 0 ; r< n ;r ++){
			for(int c= 0 ; c<n; c++){
				map[r][c]=ran.nextInt(10);
			}
		}
		
		int even = 0 ;
		int odd = 0 ;
		
		//처리
		for(int r =1 ; r<n-1; r++){
			for(int c= 1; c<n-1; c++){
				//상하좌우 모두 짝수인지 검사
				if(map[r+1][c]%2==0 
						&& map[r-1][c]%2==0 
						&& map[r][c+1]%2==0
						&& map[r][c-1]%2==0){
					even++;
					
				//상하좌우 모두 홀수인지 검사
				}else if(map[r+1][c]%2==1 
						&& map[r-1][c]%2==1 
						&& map[r][c+1]%2==1
						&& map[r][c-1]%2==1){
					odd++;
					
				}
				
			}
		}//end for
		
		
		//출력
		System.out.print(even + " " + odd);
		
		
		
	}//end main

}//end class
