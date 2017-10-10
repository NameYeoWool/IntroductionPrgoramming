package operator;

public class OpTest2 {
	
	public static void main(String[] args) {
		int i = 300;
		i = i / 70; // 소수점 계산 안됨
		
		if( i == 4){
			i = i + 5 ; 
			System.out.println("ok..." + i);
		}
	}//end main
}//end class
