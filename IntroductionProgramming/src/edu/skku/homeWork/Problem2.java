package edu.skku.homeWork;

public class Problem2 {
	
	public static void main(String[] args) {
		char[][] arr = new char[5][5];
		char ch = 'A';
		
		//입력
		for(int i = 0; i < 5; i ++){
			for(int j = 0 ; j <5; j ++){
				arr[i][j] = ch;
				ch++;
			}
		}
		
		
		//출력
		for(int i = 0 ; i <5; i ++){
			//행일 짝수
			if(i%2 == 0){
				for(int j = 0 ; j <5 ; j ++){
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
				
			//행이 홀수
			}else{
				for(int j = 4; j>=0 ; j--){
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
		
	}

}
