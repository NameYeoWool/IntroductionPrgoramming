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
		
		
		//�Է�
		//1�� 1������ �Է� �޴´�.
		for(int r= 1 ;r<n+1; r++){
			for(int c= 1 ; c<n+1; c++){
				map[r][c]= scan.next().charAt(0);
			}
		}
		
		
		//ó��
		
		for(int r= 1 ;r<n+1; r++){
			for(int c= 1 ; c<n+1; c++){
				if(map[r][c]=='B'){
					//
					int cnt=1;
					//�������� + ����, ����, �ϵ�, �ϼ� G exist
					if( map[r][c-1] == 'G' || map[r][c+1] == 'G'
							|| map[r+1][c] == 'G' || map[r-1][c]=='G'
							|| map[r+1][c+1] == 'G' || map[r+1][c-1]=='G'
							||map[r-1][c+1]=='G' || map[r-1][c-1]=='G'){
						
						//�� B ����
						for(int a = c+1 ; a <= n; a++){
							if(map[r][a]=='B') cnt++;							
						}
						
						//�� B ����
						for(int a = c-1 ; a >= 0; a--){
							if(map[r][a]=='B') cnt++;							
						}
						
						//�� B ����
						for(int a = c+1 ; a <= n; a++){
							if(map[a][c]=='B') cnt++;							
						}
						
						//�� B ����
						for(int a = c-1 ; a >= 0; a--){
							if(map[a][c]=='B') cnt++;							
						}
						
						// ������ ������ 2�� �ѱ� �� ����.
						if( cnt  > 2) cnt = 2;
						
						//�ִ� �� ��
						if( cnt > max) max = cnt;
						
						
					}else{
						//�� B ����
						for(int a = c+1 ; a <= n; a++){
							if(map[r][a]=='B') cnt++;							
						}
						
						//�� B ����
						for(int a = c-1 ; a >= 0; a--){
							if(map[r][a]=='B') cnt++;							
						}
						
						//�� B ����
						for(int a = c+1 ; a <= n; a++){
							if(map[a][c]=='B') cnt++;							
						}
						
						//�� B ����
						for(int a = c-1 ; a >= 0; a--){
							if(map[a][c]=='B') cnt++;							
						}
						
						//�ִ밪 ��
						
						if( cnt > max) max= cnt;
						
						
					}
				}// if only B
				
			}//end for colum
		}//end for row
		
		
		//���
		System.out.println(max);
		
	}//end main

}// end class
