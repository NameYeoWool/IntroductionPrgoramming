package day5;

import java.util.Scanner;

public class ArrayTest2 {
	
	public static void main(String[] args) {
		//int[] ks;
		//ks = new int[10;
		int[] ks = new int[10];
		Scanner s = new Scanner(System.in);
		
		//�Է� ,ó��, �������� ���� �ۼ��ؼ� �������ְ�
		//�Է�
		int i = 0;
		for(; i < ks.length ; i++){
			int count=0;
			ks[i] = s.nextInt();
		}
		
		//ó��
		//1. �Է� ���� ���� ���Ͻÿ�.
		int sum = 0;
		for( int j = 0 ; j <ks.length; j++){
			sum = sum + ks[j];
		}
		System.out.println("�հ�: " + sum);
		
		//2. �Էµ� �� �� ���� ū ���� ���Ͻÿ�.
		int max = ks[0]; // ���� ���� ���� ���� ����ϱ� ����⶧����, *******�迭�� ù��° ���� ���� �۴ٰ� �����ϰ� �� ����.*******
		
		for(int j = 0 ; j < ks.length ; j ++){
			//�� �ڵ�
			//max = ( max <= ks[j])? ks[j] : max;
			
			//������ �ڵ�
			if(max< ks[j]) max = ks[j];
		}
		System.out.println("�ְ�: " + max);
		//System.out.println(i);  // 10 ������.
		//System.out.println(count); // �� �ȿ��� ������� ���� �� �ȿ����� ��ȿ�ϴ�. count�� for�� �ȿ����� ����Ǿ� ����.
		
		//��� ���
		/*for(int j = 0 ; j < ks.length; j++){
			System.out.println(ks[j]);
		}*/
		
		
		
	}//end main

}// end class
