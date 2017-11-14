package edu.skku.ob;
/**
 * 
 * @author aaa - computer �̸� ó���� ����
 *
 */

public class Product {
	/** ��ǰ �ڵ�, 4�ڸ� */
	int pcode = 1000; // member variabel
	/** ��ǰ�� */
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
	 * ����� ��ǰ ������ ������ִ� �޼ҵ�
	 */
	public void info(){
		System.out.println("��ǰ��:" + pname +" ���� :" +price);
		
	}
	
	public void toStirng(){
		System.out.println("��ǰ��:" + pname +" ���� :" +price);
		
	}

}
