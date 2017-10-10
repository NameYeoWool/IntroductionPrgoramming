package ±¸Á¶Ã¼;

import java.util.Scanner;

class Rectangle{
	int x, y;
	int z, w;
	
	Rectangle(){};
	Rectangle(int x, int y, int z, int w){
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}
	
	
	void out(){
		System.out.printf("%d %d %d %d",x,y,z,w);
	}
}



public class Main197 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Rectangle r1 = new Rectangle(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt());
		Rectangle r2 = new Rectangle(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt());
		
		hap(r1,r2).out();
		

	}
	
	static Rectangle hap(Rectangle a, Rectangle b){
		Rectangle maxdata = new Rectangle();
		
		maxdata.x= (a.x < b.x) ? a.x : b.x ;
		maxdata.y = (a.y < b.y) ? a.y :b.y;
		maxdata.z = (a.z > b.z) ? a.z :b.z;
		maxdata.w = (a.w > b.w) ? a.w :b.w;
		
		return maxdata;
	}

}
