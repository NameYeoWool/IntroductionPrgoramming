package edu.skku.ob;

public class Test {
	
	public static void main(String[] args) {
		Product p = new Product();
		
		p.pcode = 100;
		p.pname= "Smart Tv";
		p.price = 150;
		p.quant = 15;
		p.pdesc = "LED TV";
		p.info();
		System.out.println(p.toString());
		System.out.println(p);//p.toString();
		// toString 없어서  주소값 안 뱉는다.
		
		Product p2 = new Product(1002,"OLED TV",300,10);
		System.out.println(p2);//p2.toString();
	}

}
