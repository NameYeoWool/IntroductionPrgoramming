package ±¸Á¶Ã¼;

import java.util.Scanner;

class HW{
	int height;
	double weight;
	
	HW(){}
	HW(int height, double weight){
		this.height=height;
		this.weight=weight;
		
	}
	
	void out(){
		System.out.printf("height : %dcm\nweight : %.1fkg",height,weight);
	}
	
}



public class Main198 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		HW fa = new HW(scan.nextInt(),scan.nextDouble());
		HW ma = new HW(scan.nextInt(),scan.nextDouble());
		
		son(fa,ma).out();
		

	}
	
	static HW son(HW a, HW b){
		HW son = new HW();
		
		son.height = (a.height + b.height)/2 + 5;
		son.weight = (a.weight + b.weight)/2 - 4.5;
		
		return son;
	}

}
