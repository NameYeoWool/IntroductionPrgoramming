package edu.skku.java6;

import java.util.Scanner;

public class Exam3 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String msg = s.next();
		int[] cnt = new int[10];
		
		//(char)(3 + '0') 도 가능하다. '3' 나옴
		
		for(int i=0; i <msg.length(); i++){
			char ch = msg.charAt(i);
			cnt[ch-'0']++;
		}
		
		for(int j = 0 ; j<cnt.length; j++){
			System.out.println(j+":"+cnt[j]);
		}
	}

}
