package dataType;

public class TypeTest {
	public static void main(String[] args) {
		int age = 22;
		
		//char 는 ""로 주면 에러난다. '' 주어야 함. 
		// String 으로 저장하고 싶으면 String = "A" 가능
		String grade2 = "B";
		
		char grade = 'A';
		double score = 4.5;
		
		// "" 을 ''로 주면 에러 난다.
		String name = "diana";
		
		boolean result = score>4.0;
		
		int k = 50;
		double d = 50.0;
		
		//타입이 맞지 않으므로 error
		// 사이즈가 작은것과 큰것을 더하면 사이즈는 큰 것을 따라간다.
		// 큰 사이즈에 있는 것을 작은것에 넣으려해서 error
		int ans = (int)(k+d); // type Casting으로 문제해결
		double ans2 = k + d; // 변수 선언을 double 로 해서 문제 해결
		
		int ans3 = k + (int)d;// type Casting
		
	}
}
