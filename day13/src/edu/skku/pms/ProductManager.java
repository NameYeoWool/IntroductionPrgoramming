package edu.skku.pms;

public class ProductManager {
	Product[] ps = new Product[100];
	int index=0; // �迭�� ������ ���� ��ġ 
	
	//��ǰ ����
	public void add(Product p){
		ps[index++] = p;
		//index++;
	}
	//��ǰ ��ü �˻�
	public void search(){
		for(int i = 0  ; i < index; i ++){
			System.out.println(ps[i]);
		}
	}
	//��ǰ��ȣ�� ��ǰ ���� ã��
	public Product search(int pnum){
		for(int i = 0 ; i < index; i ++){
			if(pnum == ps[i].getPnum()) return ps[i];
		}
		return null;
	}
	
	//��ǰ �������� ��ǰ ���� ã��
	public void searchPrice(int price){
		for(int i = 0 ; i < index; i ++){
			if(ps[i].getPrice() <= price) System.out.println(ps[i]);//ps[i].toString
		}
	}
	//��ǰ �߰� ����
	public void buy(int pnum,int quant){
		Product p=search(pnum);
		if(p != null){
			p.setQuant(p.getQuant()+quant);
		}else{
			System.out.println("��ǰ�� �������� ����");
		}
	}
	
	//��ǰ �Ǹ�
	public void sell(int pnum, int quant){
		Product p=search(pnum);
		if(p != null){
			if(p.getQuant() >= quant) p.setQuant(p.getQuant()-quant);
			else System.out.println("��� ����");
		}else{
			System.out.println("��ǰ�� �������� ����");
		}
		
	}
	//��ǰ ������ ����
	public int getProductCount(){
		return index;
	}
	//��ǰ ��� ��ü �ݾ�
	public int getTotalAmount(){
		int total = 0 ;
		for(int i = 0 ; i < index; i++){
			total += ps[i].getPrice()*ps[i].getQuant();
		}
		return total;
	}
	
	
}
