package day_9_26;

import java.util.Scanner;

public class Problem7 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		while(true){
			
			System.out.println("�� ���� �Է��ϼ���.");
			int n = scan.nextInt();
			int m = scan.nextInt();
			
			
			System.out.println("1. ����");
			System.out.println("2. ����");
			System.out.println("3. ����");
			System.out.println("4. ������");
			System.out.println("0. ����");
			System.out.print("��ȣ�� ������.");
			int k = scan.nextInt();
			if( k == 0 ) break;
			
			switch(k){
			case 1:
				System.out.println(n+m);
				break;
			case 2:
				System.out.println(n-m);
				break;
			case 3:
				System.out.println(n*m);
				break;
			case 4:
				System.out.println(n/m);
				break;
			case 0:
				break;
			default:
				System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
				break;
			}
		}
		
		
	}
}
