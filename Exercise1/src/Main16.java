import java.util.Scanner;

class Person{
	String name;
	int height;
	
	Person(){}
	Person(String name, int height){
		this.name= name;
		this.height= height;
	}
	
	void out(){
		System.out.println( name+ " " + height);
	}
	
}


public class Main16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Person[] per = new Person[5];
		
		for(int i = 0 ; i < 5; i ++){
			per[i]= new Person(scan.next(), scan.nextInt());
		}
		
		max(per).out();
		
	}

	public static Person max(Person[] p){
		Person maxdata = new Person();
		maxdata.height = 200;
		
		for(int i= 0 ; i < p.length; i++){
			if( maxdata.height > p[i].height){
				maxdata = p[i];
			}
		}
		
		return maxdata;
	}
}