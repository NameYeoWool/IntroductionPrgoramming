package edu.skku.loop;

//1 ~100 사이값 중 3의배수와 5ㅢ ㅐ수의 갯수를 구하세요
public class FortTest5 {
	
	public static void main(String[] args) {
		
		int cnt = 0;
		int  cnt2 = 0;
		for(int i= 1; i<= 100 ; i++){
			//3의 배수이거나 5의 배수
			if(i%3==0 || i%5==0) cnt++;
			
			//3의배수이면서 5의 배수
			if(i%3==0 && i%5 ==0) cnt2++;
			
		}//for
		
		System.out.println(cnt);
		m();
		//m();
		System.out.println(cnt2);
	}//end main
	
	public static void m() {
		System.out.println("mmmmmmmmmmmm");
	}

}//end class
