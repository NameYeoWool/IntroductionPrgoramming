package ±¸Á¶Ã¼;

import java.util.Scanner;

class Height{
	String name;
	int height;
	
	Height(){};
	Height(String name, int height){
		this.name = name;
		this.height = height;
	}
	
	void out(){
		System.out.printf("%s %d",name,height);
	}
	
	
}

public class Main617 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Height[] h =new Height[5];
		
		for(int i = 0 ; i<5; i++){
			h[i]= new Height(scan.next(),scan.nextInt());
		}
		
		
		max(h).out();
		

	}
	
	
	static Height max(Height[] arr){
		Height mindata = new Height();
		mindata.height=500;
		for(int i = 0 ; i < 5; i++){
			if(mindata.height>arr[i].height){
				mindata = arr[i];
			}
		}
		
		return mindata;
	}
	
}
