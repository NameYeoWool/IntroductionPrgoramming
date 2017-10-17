package edu.skku.java7;

public class Exam6_2 {

	public static void main(String[] args) {
		char[][] s = new char[5][5];
		char ch = 'A';
		
		
		for(int r= 0 ; r< s.length; r++){
			for(int c=0 ; c < s[r].length; c++){
				//char ch = 'A' ; 
				//ch++; 하면 B 나옴  - 내부연산  // ch+1; 하면 66 나옴 - 이항연산 ( ch- 16bit int-32bit -> int 로 자동 형변환 )
									//  (char)66 하면 char 찍을 수 있음
				//짝수면 그냥 집어넣음
				if(r%2 == 0){
					s[r][c] = ch++;
				}else{
					// 최대 길이가 4이니까
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
