package edu.skku.loop;

//1~100 ������ 7�� ����� ���� ���ϱ�
public class ForTest4 {
	
	public static void main(String[] args) {
		
		int sum = 0 ;
		
		/*for(int i = 7; i<= 100 ; i += 7 ){
			//sum = sum+ i;
			sum += i;
		}*/
		
		for(int i = 1; i <= 100 ; i ++){
			if(i%7==0) sum+=i;
		}
		
		System.out.println(sum);
	}

}
