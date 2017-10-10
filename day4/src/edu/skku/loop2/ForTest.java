package edu.skku.loop2;

public class ForTest {
	
	public static void main(String[] args) {
		for(int i = 1; i < 10 ; i ++){//1
			//if( i == 7 ) break;//2·Î
			if(i == 7 ) continue;//1·Î
			System.out.println(i);
			System.out.println("fff");
		}
		//2
		System.out.println("end...");
	}
}
