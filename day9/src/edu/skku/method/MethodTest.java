package edu.skku.method;

public class MethodTest {
	
	public static void main(String[] args) {
		int a = 50;
		int b = 30;
		int result = add(a, b)*sub(a,30);
		System.out.println(result);
		
	}//end main
	
	//Method, �Լ�(function)-������ �θ��� �̸�- ������ Method
	//parameters, arguments - ���� �����ؼ� �ޱ� ���ؼ� ���� ����
	public static int add(int x, int y){
		//�۾�
		System.out.println(x+y);
		return x+y;
	}
	
	public static int sub(int a, int y){
		System.out.println(a-y);
		return a-y;
	}

	
	

}//end class
