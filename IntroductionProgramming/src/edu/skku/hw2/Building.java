package edu.skku.hw2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Building {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scan = new Scanner(new File("data/data1.txt"));
		
		int n = scan.nextInt();
		int max = 0;
		char[][] map = new char[n+2][n+2];
		
		
		//입력
		//1행 1열부터 입력 받는다.
		for(int r= 1 ;r<n+1; r++){
			for(int c= 1 ; c<n+1; c++){
				map[r][c]= scan.next().charAt(0);
			}
		}
		
		
		//처리
		
		for(int r= 1 ;r<n+1; r++){
			for(int c= 1 ; c<n+1; c++){
				if(map[r][c]=='B'){
					//
					int cnt=1;
					//동서남북 + 남동, 남서, 북동, 북서 G exist
					if( map[r][c-1] == 'G' || map[r][c+1] == 'G'
							|| map[r+1][c] == 'G' || map[r-1][c]=='G'
							|| map[r+1][c+1] == 'G' || map[r+1][c-1]=='G'
							||map[r-1][c+1]=='G' || map[r-1][c-1]=='G'){
						
						//동 B 세기
						for(int a = c+1 ; a <= n; a++){
							if(map[r][a]=='B') cnt++;							
						}
						
						//서 B 세기
						for(int a = c-1 ; a >= 0; a--){
							if(map[r][a]=='B') cnt++;							
						}
						
						//남 B 세기
						for(int a = c+1 ; a <= n; a++){
							if(map[a][c]=='B') cnt++;							
						}
						
						//북 B 세기
						for(int a = c-1 ; a >= 0; a--){
							if(map[a][c]=='B') cnt++;							
						}
						
						// 공원이 있으면 2를 넘길 수 없다.
						if( cnt  > 2) cnt = 2;
						
						//최대 값 비교
						if( cnt > max) max = cnt;
						
						
					}else{
						//동 B 세기
						for(int a = c+1 ; a <= n; a++){
							if(map[r][a]=='B') cnt++;							
						}
						
						//서 B 세기
						for(int a = c-1 ; a >= 0; a--){
							if(map[r][a]=='B') cnt++;							
						}
						
						//남 B 세기
						for(int a = c+1 ; a <= n; a++){
							if(map[a][c]=='B') cnt++;							
						}
						
						//북 B 세기
						for(int a = c-1 ; a >= 0; a--){
							if(map[a][c]=='B') cnt++;							
						}
						
						//최대값 비교
						
						if( cnt > max) max= cnt;
						
						
					}
				}// if only B
				
			}//end for colum
		}//end for row
		
		
		//출력
		System.out.println(max);
		
	}//end main

}// end class
