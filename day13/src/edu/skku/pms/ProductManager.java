package edu.skku.pms;

public class ProductManager {
	Product[] ps = new Product[100];
	int index=0; // 배열의 데이터 저장 위치 
	
	//상품 저장
	public void add(Product p){
		ps[index++] = p;
		//index++;
	}
	//상품 전체 검색
	public void search(){
		for(int i = 0  ; i < index; i ++){
			System.out.println(ps[i]);
		}
	}
	//상품번호로 상품 정보 찾기
	public Product search(int pnum){
		for(int i = 0 ; i < index; i ++){
			if(pnum == ps[i].getPnum()) return ps[i];
		}
		return null;
	}
	
	//상품 가격으로 상품 정보 찾기
	public void searchPrice(int price){
		for(int i = 0 ; i < index; i ++){
			if(ps[i].getPrice() <= price) System.out.println(ps[i]);//ps[i].toString
		}
	}
	//상품 추가 구입
	public void buy(int pnum,int quant){
		Product p=search(pnum);
		if(p != null){
			p.setQuant(p.getQuant()+quant);
		}else{
			System.out.println("상품이 존재하지 않음");
		}
	}
	
	//상품 판매
	public void sell(int pnum, int quant){
		Product p=search(pnum);
		if(p != null){
			if(p.getQuant() >= quant) p.setQuant(p.getQuant()-quant);
			else System.out.println("재고 부족");
		}else{
			System.out.println("상품이 존재하지 않음");
		}
		
	}
	//상품 개수를 리턴
	public int getProductCount(){
		return index;
	}
	//상품 재고 전체 금액
	public int getTotalAmount(){
		int total = 0 ;
		for(int i = 0 ; i < index; i++){
			total += ps[i].getPrice()*ps[i].getQuant();
		}
		return total;
	}
	
	
}
