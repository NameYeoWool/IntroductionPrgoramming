package day_9_26;

import java.util.Random;

public class Problem2 {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int i, j; 
		
		for( i = 0 ; i < 5 ; i++){
			for(j=0; j < 6 ; j++){
				//nextInt(n) 하면  0<= r < n 값 반환
				int n = r.nextInt(45)+1;
				System.out.printf("%2d ",n);
			}
			System.out.println();
		}
		
	}

}
