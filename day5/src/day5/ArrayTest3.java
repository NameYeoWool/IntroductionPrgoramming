package day5;

import java.util.Scanner;

public class ArrayTest3 {
	
	public static void main(String[] args) {
		int[] ks = { 70, 87, 76, 59, 84, 96, 77, 88 , 86, 63};
		
		//�迭�� ����ִ� �� �� ���� ���� ���� �� ��ġ�� ���ϼ���.
		int min=ks[0]; // ���� ���� �ִ� boundary�� �𸣹Ƿ� *****ù ��° �迭�� ���� �۴ٰ� ����
		int position = 0; // ****ù��° �迭�� ���� �۴ٰ� �����߱� ������, 0 ���� ������ ��.
		for(int i = 0 ; i < ks.length; i ++){
			if(min>ks[i]) {
				min = ks[i];
				position = i;
			}
		}
		
		System.out.println("�ּڰ�: "+ min +"\n��ġ: "+position);
		
		
		for(int i = 0 ; i <ks.length; i++){
			System.out.print(ks[i]+" ");
		}
		System.out.println();
		
		//java 5.5 ���� �߰��� �ڹ� for-each�� 
		// �Է� �� �ް� , ������ ������ �� ( �߰� ���� �Ұ�)
		// ��ġ���ϱ� �Ұ�
		// for( int k : datas[�迭,collecton])
		for(int k : ks){
			System.out.print(k+" ");
		}
		
	}//end main

}// end class
