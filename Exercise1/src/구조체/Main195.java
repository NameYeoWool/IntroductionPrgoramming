package ±¸Á¶Ã¼;

import java.util.Scanner;

class Address{
	String name;
	String tel;
	String address;
	
	Address(){};
	Address(String name, String tel, String address){
		this.name= name;
		this.tel=tel;
		this.address=address;
	}
	
	void out(){
		System.out.printf("name : %s\ntel : %s\naddr : %s",name,tel,address);
	}
}

public class Main195 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Address a1 = new Address(scan.next(),scan.next(),scan.next());
		a1.out();
		
	}

}
