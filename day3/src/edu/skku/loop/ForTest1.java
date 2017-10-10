package edu.skku.loop;

import java.util.Random;

public class ForTest1 {

	public static void main(String[] args) {
		Random r = new Random();
		
		
		for(int i = 0 ; i < 7 ; i ++){
			int su = r.nextInt(45)+1; // 0~44 사이 숫자에 +1 -> 1~45
			System.out.print(su+" ");
		}
	}//main
}//class
