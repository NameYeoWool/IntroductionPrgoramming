package edu.skku.loop;

//1 ~100 ���̰� �� 3�ǹ���� 5�� ������ ������ ���ϼ���
public class FortTest5 {
	
	public static void main(String[] args) {
		
		int cnt = 0;
		int  cnt2 = 0;
		for(int i= 1; i<= 100 ; i++){
			//3�� ����̰ų� 5�� ���
			if(i%3==0 || i%5==0) cnt++;
			
			//3�ǹ���̸鼭 5�� ���
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
