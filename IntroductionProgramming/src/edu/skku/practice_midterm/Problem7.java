package edu.skku.practice_midterm;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int x, y , z ;
		boolean re = true;
		while(true){
			System.out.println("�� ���� �Է��ϼ���");
			x = scan.nextInt();
			y = scan.nextInt();
			
			System.out.print("1. ����\n2. ����\n3. ����\n4. ������\n0. ����\n��ȣ�� ������");
			z = scan.nextInt();
			
			
			switch(z){
			case 1 : System.out.println(x+y); break;
			case 2 : System.out.println(x-y); break;
			case 3 : System.out.println(x*y); break;
			case 4 : System.out.println(x/y); break;
			case 0 : re = false ; break;
			default : System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
			
			
			}
			
			if( re != true)  break;
			
		}
		
		
	}
	
	
}
