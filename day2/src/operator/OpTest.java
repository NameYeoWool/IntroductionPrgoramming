package operator;

public class OpTest {
	
	public static void main(String[] args) {
		int a = 20;
		a =  a + 1;
		System.out.println(a); // 21
		a++; // a = a +1 ;
		System.out.println(a); // 22
		--a; // a = a- 1;
		System.out.println(a); // 21
		a--;
		System.out.println(a); // 20 
		System.out.println(a--); // 작업 수행하고 나서 -1   // 20
		System.out.println(--a);// -1 하고 작업 수행  // 18
		
		
		// ctrl  + D  한줄 삭제
		// 한줄이동 alt + 윗방향 , 아랫방향 화살표
		// ctrl + alt  + 아래방향 화살표 - 복사
				
		
		a = 5;
		int b = a--;// 작업 수행( b에다가 a 를 넣어라)하고 a 감소시킴 - 마지막에 감소
		System.out.println(b);// 결과 5찍힘
		
		int c = --a; // 앞에 --가 붙었으므로 a 감소시키고 작업수행(c에 a값 할당) - 맨 처음 감소
		System.out.println(c);
		
	}
}
