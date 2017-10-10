package ±¸Á¶Ã¼;

import java.util.Scanner;

class Weight{
	String name;
	int height;
	double weight;
	
	Weight(){};
	Weight(String name, int height, double weight){
		this.name= name;
		this.height = height;
		this.weight = weight;
	}
	
	void out(){
		System.out.printf("%s %d %.1f\n",name,height,weight);
	}
}

public class Main618 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Weight[] w = new Weight[5];
		
		for(int i = 0 ; i < 5 ; i ++){
			w[i]= new Weight(scan.next(),scan.nextInt(),scan.nextDouble());
		}
		
		System.out.println("name");
		nsort(w);
		for(int i = 0 ; i <5; i ++){
			w[i].out();
		}
		System.out.println();
		
		
		System.out.println("weight");
		wsort(w);
		for(int i = 0 ; i < 5; i ++){
			w[i].out();
		}
		
		
		
	}
	
	
	static void nsort(Weight[] arr){
		Weight tmp = new Weight();
		for(int i = 0 ; i <  4 ; i++){
			for(int j = i+1; j<5; j++){
				if(arr[i].name.compareTo(arr[j].name)>0){
					tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
			
		}
	}
	
	static void wsort(Weight[] brr){
		Weight tmp = new Weight();
		for(int i = 0 ; i <4; i++){
			for( int j = i+1 ; j <5; j++){
				if(brr[i].weight<brr[j].weight){
					tmp = brr[i];
					brr[i]= brr[j];
					brr[j]= tmp;
				}
			}
		}
	}
	

}
