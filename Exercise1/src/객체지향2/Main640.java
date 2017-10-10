package °´Ã¼ÁöÇâ2;

import java.util.Scanner;

class Area{
	static private int M;
	int area;
	
	
	Area(int v, int h){
		area = v*h;
		Max(area,M);
	}
	
	void Max(int x, int y){
		M = (x > y) ? x: y;
	}
	
	static int getMax(){
		return M;
	}
	
	void out(){
		System.out.println("area : " + area);
	}
	
	
	
}



public class Main640 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		while(true){
			System.out.print("Input data : ");
			a= scan.nextInt();
			b= scan.nextInt();
			
			Area a1 = new Area(a,b);
			
			if( a == 0 || b == 0){
				System.out.println("Max area : " + a1.getMax());
				break; 
			}else{
				a1.out();
			}
			
			
		}
	}

}
