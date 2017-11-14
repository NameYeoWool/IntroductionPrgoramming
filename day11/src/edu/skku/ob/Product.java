package edu.skku.ob;
/**
 * 
 * @author aaa - computer 이름 처음에 들어옮
 *
 */

public class Product {
	/** 상품 코드, 4자리 */
	int pcode = 1000; // member variabel
	/** 상품명 */
	String pname= "Smart Tv";
	int price = 150;
	int quant = 15;
	String pdesc = "LED TV";
	
	public Product(){}
	
	public Product(int pcode, String pname, //local variable
			int price, int quant){
		this.pcode = pcode;
		this.pname = pname;
		this.price = price;
		this.quant = quant;
		this.pdesc = "";
	}
	
	public Product(int pcode, String pname, //local variable
			int price, int quant, String pdesc){
		this.pcode = pcode;
		this.pname = pname;
		this.price = price;
		this.quant = quant;
		this.pdesc = pdesc;
		
	}
	
	/**
	 * 저장된 상품 정보를 출력해주는 메소드
	 */
	public void info(){
		System.out.println("상품명:" + pname +" 가격 :" +price);
		
	}
	
	public void toStirng(){
		System.out.println("상품명:" + pname +" 가격 :" +price);
		
	}

}
