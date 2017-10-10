package day_9_26;

import java.util.Scanner;

public class Problem7 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		while(true){
			
			System.out.println("µÎ ¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä.");
			int n = scan.nextInt();
			int m = scan.nextInt();
			
			
			System.out.println("1. µ¡¼À");
			System.out.println("2. »¬¼À");
			System.out.println("3. °ö¼À");
			System.out.println("4. ³ª´°¼À");
			System.out.println("0. Á¾·á");
			System.out.print("¹øÈ£¸¦ °í¸£¼¼¿ä.");
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
				System.out.println("¹øÈ£¸¦ Àß¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù.");
				break;
			}
		}
		
		
	}
}
