
package day3;
import java.util.Random;

public class IfTest1 {
	
	public static void main(String[] args) {
		
		//new Random() - Random�̶�� Ŭ������ �޸𸮷� �о�Ͷ�
		// import ����Ű  : ctrl + shilft + O
		// Random�� ������ �� �ִ� r�� ����� ���� ���� Random�� �ּҰ��� r�� ����
		Random r = new Random();
		
		// Ư������ �ָ� 0 ���� Ư���� ���̱��� ���´�(Ư������ �ȳ���)
		// 0 ~ 100
		int score = r.nextInt(101);
		
		//���� �ڵ� - ���� > 0 
		int score2 = r.nextInt(2);
		
		//�̷��� �ϸ� 0~99���� ���� �� �ִ�  . 101�� ������ 0~ 100 ���� ���� �� �ִ�.
		//int score2 = r.nextInt()%100;
		
		// 50~100 ���� ��
		//int score3 = r.nextInt(51) + 50;
		
		System.out.println(score);
		System.out.println(score2 + " 2 ");
		if(score >= 70){
			System.out.println("�հ�~");
		}
		
	}//main
}//IfTest1
