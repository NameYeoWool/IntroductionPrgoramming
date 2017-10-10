package ±¸Á¶Ã¼;

import java.util.Scanner;

class Point{
	double x,y;
	
	Point(double x, double y){
		this.x= x;
		this.y = y;
	}
	
	
	void out(){
		System.out.printf("(%.1f, %.1f)",x,y);
	}
}

public class Main616 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Point p1 = new Point(scan.nextDouble(),scan.nextDouble());
		Point p2 = new Point(scan.nextDouble(),scan.nextDouble());
		Point p3 = new Point(scan.nextDouble(),scan.nextDouble());
		
		Point p4 = new Point((p1.x + p2.x + p3.x)/3,(p1.y + p2.y + p3.y)/3);
		p4.out();
		

	}
	
	
	

}
