package edu.skku.java6;

import java.util.Scanner;

public class Exam3 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String msg = s.next();
		int[] cnt = new int[10];
		
		//(char)(3 + '0') 도 가능하다. '3' 나옴   -  문자로 변환
		
		for(int i=0; i <msg.length(); i++){
			char ch = msg.charAt(i);
			cnt[ch-'0']++; // 문자에서 숫자로 변환
		}
		
		for(int j = 0 ; j<cnt.length; j++){
			System.out.println(j+":"+cnt[j]);
		}
	}

}
