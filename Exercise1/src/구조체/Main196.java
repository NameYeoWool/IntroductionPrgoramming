package ����ü;

import java.util.Scanner;


// Address ��� Ŭ������ �̹� Main195 �ڵ忡�� ���� �Ǿ��־ �ߺ��ż� ������
// ä���� ���ؼ� �ٿ����� ���� ���̴�. ����� ���ư���. �ֳ��ϸ� packagae �������� class ������ 
// �����ϱ� �����̴�.
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


public class Main196 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Address[] add =new Address[3];
		
		for(int i = 0 ; i< 3; i++){
			add[i] = new Address(scan.next(),scan.next(),scan.next());
		}
		
		first(add).out();
		
	}
	
	static Address first(Address[] arr){
		Address maxdata = new Address();
		maxdata.name="zzzz";
		for(int i = 0 ; i <3; i ++){
			if(maxdata.name.compareTo(arr[i].name)>0){
				maxdata=arr[i];
			}
		}
		
		return maxdata;
		
	}

}
