package edu.skku.java7;

public class Exam6_2 {

	public static void main(String[] args) {
		char[][] s = new char[5][5];
		char ch = 'A';
		
		
		for(int r= 0 ; r< s.length; r++){
			for(int c=0 ; c < s[r].length; c++){
				//char ch = 'A' ; 
				//ch++; �ϸ� B ����  - ���ο���  // ch+1; �ϸ� 66 ���� - ���׿��� ( ch- 16bit int-32bit -> int �� �ڵ� ����ȯ )
									//  (char)66 �ϸ� char ���� �� ����
				//¦���� �׳� �������
				if(r%2 == 0){
					s[r][c] = ch++;
				}else{
					// �ִ� ���̰� 4�̴ϱ�
					s[r][4-c]=ch++;
				}
			}
		}
		
		for(int r=0; r<s.length; r++){
			
			for(int c= 0; c< s[r].length; c++){
				System.out.print(s[r][c]+ " ");
			}
			
			System.out.println();
		}
		
	}//end main
}
