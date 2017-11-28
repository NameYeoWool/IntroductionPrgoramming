package edu.skku.pms;

public class ProductController {
	
	public static void main(String[] args) {
		ProductManager mgr = new ProductManager();
		Product p = new Product(1001,"SmartTV",5000,10);
		mgr.add(p);
		mgr.add(new Product(2001,"�����",100,5));
		mgr.add(new Product(3001,"������",200,15));
		mgr.search();
		System.out.println("==================== �˻� : 2001 =================");
		System.out.println(mgr.search(2001));
		System.out.println("====================��ǰ���ݰ˻� : 1000 =================");
		mgr.searchPrice(1000);
		System.out.println("========= ��ǰ ���� :2001,6");
		mgr.buy(2001, 6);
		System.out.println(mgr.search(2001));
		System.out.println("========= ��ǰ �Ǹ� :2001,7");
		mgr.sell(2001, 7);
		System.out.println(mgr.search(2001));
		System.out.println("��ü ��� �ݾ�:"+mgr.getTotalAmount());
	}	

}
