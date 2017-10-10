package ±¸Á¶Ã¼;

import java.util.Scanner;

class Hap{
	String name;
	int x, y, z;
	int sum;
	
	Hap(){}
	Hap(String name,int x, int y, int z){
		this.name = name;
		this.x= x; 
		this.y= y;
		this.z=z;
		sum = x + y + z;
	}
	
	void out(){
		System.out.printf("%s %d %d %d %d\n",name,x,y,z,sum);
	}
	
	
	
}




public class Main199 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		
		int N = scan.nextInt();
		
		Hap[] h = new Hap[N];
		
		for(int i = 0 ; i < N ; i ++){
			h[i] = new Hap(scan.next(),scan.nextInt(),scan.nextInt(),scan.nextInt());
		}
		
		sort(h,N);
		for(int i = 0 ; i< N ; i ++){
			h[i].out();
		}
		
				
	}
	
	static void sort(Hap[] arr, int n){
		Hap tmp = new Hap();
		
		for(int i =0 ;  i < n-1; i ++){
			for( int j = i+1 ; j <n ; j++ ){
				if(arr[i].sum < arr[j].sum){
					tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
	}

}
