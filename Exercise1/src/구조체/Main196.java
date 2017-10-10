package 구조체;

import java.util.Scanner;


// Address 라는 클래스가 이미 Main195 코드에서 정의 되어있어서 중복돼서 에러남
// 채점을 위해서 붙여놓은 것일 뿐이다. 안적어도 돌아간다. 왜냐하면 packagae 내에서는 class 참조가 
// 가능하기 때문이다.
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
