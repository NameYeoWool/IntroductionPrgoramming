package edu.skku.practice_midterm;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int x, y , z ;
		boolean re = true;
		while(true){
			System.out.println("µÎ ¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
			x = scan.nextInt();
			y = scan.nextInt();
			
			System.out.print("1. µ¡¼À\n2. »¬¼À\n3. °ö¼À\n4. ³ª´°¼À\n0. Á¾·á\n¹øÈ£¸¦ °í¸£¼¼¿ä");
			z = scan.nextInt();
			
			
			switch(z){
			case 1 : System.out.println(x+y); break;
			case 2 : System.out.println(x-y); break;
			case 3 : System.out.println(x*y); break;
			case 4 : System.out.println(x/y); break;
			case 0 : re = false ; break;
			default : System.out.println("¹øÈ£¸¦ Àß¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù.");
			
			
			}
			
			if( re != true)  break;
			
		}
		
		
	}
	
	
}
