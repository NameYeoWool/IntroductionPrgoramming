package day_9_26;

public class Problem01 {
	
	public static void main(String[] args) {
		
		int i ,j;
		
		for( i = 2; i < 10; i ++){
			System.out.println(i + "´Ü");
			for(j = 1; j < 10 ; j ++){
				System.out.println(i+" * "+ j +" = "+i*j);
			}
		}
	}

}
