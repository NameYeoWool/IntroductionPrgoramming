package edu.skku.method;

public class MethodTest {
	
	public static void main(String[] args) {
		int a = 50;
		int b = 30;
		int result = add(a, b)*sub(a,30);
		System.out.println(result);
		
	}//end main
	
	//Method, 함수(function)-예전에 부르전 이름- 지금은 Method
	//parameters, arguments - 값을 전달해서 받기 위해서 쓰는 변수
	public static int add(int x, int y){
		//작업
		System.out.println(x+y);
		return x+y;
	}
	
	public static int sub(int a, int y){
		System.out.println(a-y);
		return a-y;
	}

	
	

}//end class
