package day5;

import java.util.Scanner;

public class Exam1 {
	static int[] ks = new int[10];
	public static void main(String[] args) {
		//static 
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i < ks.length; i++){
			ks[i]=scan.nextInt();
		}
		
		//1. �հ�
		int sum = total();
		//2. ���
		double avg = sum/10.;// ������/�Ǽ� �ϰԵǸ� �Ǽ��� �ڵ�����ȯ
		System.out.println("���:"+avg);
		//3. �ִ밪
		int a = max();
		//4. �ּҰ�
		int b = min();
		//5. �ִ� �ִ��� ����
		System.out.println("���� : " + (a-b));// ���ϱ� ���� �켱������ ���Ƽ� "����: " + a ���� ����ϹǷ�
										// ��ȣ ó��
		//6. ��հ��� �� 
		for(int k : ks){
			//System.out.print((int)(avg-k)+ " ");
			System.out.printf("%4.1f",avg-k); // 4�� '��ü ũ��' 1�� '�Ҽ��� ���� �ڸ� ��  **�Ҽ� ��° �ڸ����� �ݿø�
												// �Ҽ��� �ڸ� '.' �� ��ü ũ�⿡�� ���ڸ� �����Ѵ�.
			
		}
		
		
		
	}//end main
	
	public static int total(){
		int sum = 0;
		for(int k : ks){
			sum = sum +k;
		}
		System.out.println("�հ�:"+sum);
		return sum;
	}
	
	public static int max(){
		int max = ks[0];
		//�� �ڵ�
		/*for(int k : ks){
			if(max<k) max = k;
		}*/
		
		//������ �ڵ�
		
		for(int i=1 ; i<ks.length; i++){
			if(max<ks[i]){
				max=ks[i];
			}
		}
		System.out.println("�ִ밪:"+max);
		return max;
	}
	
	public static int min(){
		int min = ks[0];
		
		for(int i=1 ; i<ks.length; i++){
			if(min>ks[i]){
				min=ks[i];
			}
		}
		System.out.println("�ּҰ�:"+min);
		return min;
	}
	
	

}//end class
