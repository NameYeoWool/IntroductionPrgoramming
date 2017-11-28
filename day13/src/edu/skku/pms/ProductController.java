package edu.skku.pms;

public class ProductController {
	
	public static void main(String[] args) {
		ProductManager mgr = new ProductManager();
		Product p = new Product(1001,"SmartTV",5000,10);
		mgr.add(p);
		mgr.add(new Product(2001,"냉장고",100,5));
		mgr.add(new Product(3001,"건조기",200,15));
		mgr.search();
		System.out.println("==================== 검색 : 2001 =================");
		System.out.println(mgr.search(2001));
		System.out.println("====================상품가격검색 : 1000 =================");
		mgr.searchPrice(1000);
		System.out.println("========= 상품 구매 :2001,6");
		mgr.buy(2001, 6);
		System.out.println(mgr.search(2001));
		System.out.println("========= 상품 판매 :2001,7");
		mgr.sell(2001, 7);
		System.out.println(mgr.search(2001));
		System.out.println("전체 재고 금액:"+mgr.getTotalAmount());
	}	

}
