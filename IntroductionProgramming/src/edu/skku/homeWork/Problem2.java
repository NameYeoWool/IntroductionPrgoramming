package edu.skku.homeWork;

public class Problem2 {
	
	public static void main(String[] args) {
		char[][] arr = new char[5][5];
		char ch = 'A';
		
		//�Է�
		for(int i = 0; i < 5; i ++){
			for(int j = 0 ; j <5; j ++){
				arr[i][j] = ch;
				ch++;
			}
		}
		
		
		//���
		for(int i = 0 ; i <5; i ++){
			//���� ¦��
			if(i%2 == 0){
				for(int j = 0 ; j <5 ; j ++){
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
				
			//���� Ȧ��
			}else{
				for(int j = 4; j>=0 ; j--){
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
		
	}

}
