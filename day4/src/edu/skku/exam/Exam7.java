package edu.skku.exam;

import java.util.Scanner;

public class Exam7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);


		while (true) {
			System.out.println("�� ���� �Է��ϼ���.");
			int a = scan.nextInt();
			int b = scan.nextInt();

			System.out.println("1. ����");
			System.out.println("2. ����");
			System.out.println("3. ����");
			System.out.println("4. ������");
			System.out.println("0. ����");
			System.out.print("��ȣ�� ������.");
			int n = scan.nextInt();//Ű���� �Է�
			if(n == 0) break;
			
			// switch �� �ȿ� break; ���� �ְ� �Ǹ� switch���� ����������
			// while���� ���������� �����Ƿ� ������ �߻��Ѵ�.
			switch(n){
			case 1:
				System.out.println(a+b);
				break;
			case 2:
				System.out.println(a-b);
				break;
			case 3:
				System.out.println(a*b);
				break;
			case 4:
				System.out.println(a/b);
				break;
			default:
				System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
			}
			
		}//end while
		System.out.println("end...");
	}// end main

}// end class
