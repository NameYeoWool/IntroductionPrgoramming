package edu.skku.java7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exam7_1 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//입력
		// 데이터 파일로 불러올때, 복붙 하고 마지막에 엔터 처주어야 한다. - next()는 빈 공백이나 enter를 기준으로 나눔
		Scanner s = new Scanner(new File("data/data1.txt"));
		int n = s.nextInt();//배열 크기 입력
				//new 붙여줘야 함을 잊지 말자!
		char[][] map = new char[n][n];
		
		
		for(int r =0 ; r<n; r++){
			for(int c = 0; c < n ; c++){
				//공백을 기준으로 문자를 읽어온다.
				//글자 여러개를 읽어 올 수 있으므로 , 
				//retrun 은 String이 온다.
				//string에서 charAt(인덱스)를 string에서 인덱스에
				//해당하는 값을 꺼내온다.
				map[r][c]=s.next().charAt(0);//한글자 입력
			}
		}
		
		//처리
		int count =0 ;
		for(int r =0; r<n; r++){
			for(int c= 0 ;c<n; c++){
				switch(map[r][c]){
				
				case 'A':
					//로봇 A일 경우 작업
					//c를 바꾸면 안됨
					//배열을 벗어나지 않게 돌아야 한다.
					for(int a = c+1; a<n; a++){
						if(map[r][a] == 'S') count++;
						else break;
					}
					break;// switch 문을 빠져나감 -가장 가까운 반복문 나감
				case 'B':
					//B일 때, 작업
					for(int a = c+1; a<n; a++){
						if(map[r][a] == 'S') count++;
						else break;
					}
					
					for(int a = c-1; a>=0; a--){
						if(map[r][a] == 'S') count++;
						else break;
					}
					break;
				case 'C':
					for(int a = c+1; a<n; a++){
						if(map[r][a] == 'S') count++;
						else break;
					}
					
					for(int a = c-1; a>=0; a--){
						if(map[r][a] == 'S') count++;
						else break;
					}
					
					//아래  r+1 이니까 행 증가 아래로 c 고정
					for(int a = r+1; a<n; a++){
						if(map[a][c] == 'S') count++;
						else break;
					}
					
					//위 r-1 이니까 행 감소 위로 c 고정
					for(int a = r-1; a>=0; a--){
						if(map[a][c] == 'S') count++;
						else break;
					}
					break;
				
				}// end switch
			}//for c
		}//for r
		//출력
		System.out.println(count);
		
	}//end main

}//end class
