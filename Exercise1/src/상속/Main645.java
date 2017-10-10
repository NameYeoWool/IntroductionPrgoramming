package »ó¼Ó;

import java.util.Scanner;

class Body{
	String name;
	double weight;
	int height;
	
	void set(String name, int height, double weight){
		this.name= name;
		this.height= height;
		this.weight = weight;
	}
	
	
	public boolean equals(Body bo){
		return weight==bo.weight && height == bo.height;
	}
	
	public String toString(){
		return name + "'s body";
	}
	
	
	
	
}


class Person extends Body{
	
	Person(String name, int height, double weight){
		super.set(name, height, weight);
	}
	
	void out(){
		System.out.printf("%s's body : %dcm, %.1fkg\n",name,height,weight);
	}
	
}



public class Main645 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Person p1 = new Person(scan.next(),scan.nextInt(),scan.nextDouble());
		Person p2 = new Person(scan.next(),scan.nextInt(),scan.nextDouble());
		
		System.out.println("Body.Student");
		p1.out();
		if(p1.equals(p2)) System.out.printf("%s == %s ",p1.toString(),p2.toString());
		else System.out.printf("%s != %s ",p1.toString(),p2.toString());
	}

}
