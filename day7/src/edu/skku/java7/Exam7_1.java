package edu.skku.java7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exam7_1 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//�Է�
		// ������ ���Ϸ� �ҷ��ö�, ���� �ϰ� �������� ���� ó�־�� �Ѵ�. - next()�� �� �����̳� enter�� �������� ����
		Scanner s = new Scanner(new File("data/data1.txt"));
		int n = s.nextInt();//�迭 ũ�� �Է�
				//new �ٿ���� ���� ���� ����!
		char[][] map = new char[n][n];
		
		
		for(int r =0 ; r<n; r++){
			for(int c = 0; c < n ; c++){
				//������ �������� ���ڸ� �о�´�.
				//���� �������� �о� �� �� �����Ƿ� , 
				//retrun �� String�� �´�.
				//string���� charAt(�ε���)�� string���� �ε�����
				//�ش��ϴ� ���� �����´�.
				map[r][c]=s.next().charAt(0);//�ѱ��� �Է�
			}
		}
		
		//ó��
		int count =0 ;
		for(int r =0; r<n; r++){
			for(int c= 0 ;c<n; c++){
				switch(map[r][c]){
				
				case 'A':
					//�κ� A�� ��� �۾�
					//c�� �ٲٸ� �ȵ�
					//�迭�� ����� �ʰ� ���ƾ� �Ѵ�.
					for(int a = c+1; a<n; a++){
						if(map[r][a] == 'S') count++;
						else break;
					}
					break;// switch ���� �������� -���� ����� �ݺ��� ����
				case 'B':
					//B�� ��, �۾�
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
					
					//�Ʒ�  r+1 �̴ϱ� �� ���� �Ʒ��� c ����
					for(int a = r+1; a<n; a++){
						if(map[a][c] == 'S') count++;
						else break;
					}
					
					//�� r-1 �̴ϱ� �� ���� ���� c ����
					for(int a = r-1; a>=0; a--){
						if(map[a][c] == 'S') count++;
						else break;
					}
					break;
				
				}// end switch
			}//for c
		}//for r
		//���
		System.out.println(count);
		
	}//end main

}//end class
