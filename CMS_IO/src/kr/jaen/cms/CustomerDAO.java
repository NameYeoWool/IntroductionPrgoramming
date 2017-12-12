package kr.jaen.cms;

import java.io.*;
/** ���� ����Ÿ�� ����, �����ϴ� Ŭ���� */
public class  CustomerDAO{
	private Customer[] list= new Customer[100];
	private  int index=0;
	
	public CustomerDAO(){
		open();
	}
	
	/** ���Ϸ� ���� �ڷ� �о �޸�(ArrayList)�� �����ϱ�*/
	public void open(){
		ObjectInputStream ois=null;
		File file=new File("cust.dat");
		if (!file.exists()) { return; }
		try{	
			ois=new ObjectInputStream(new FileInputStream(file));
			Object ob=null;
			while((ob=ois.readObject())!=null){//������ EOF Exception�߻�
				list[index++]=(Customer)ob;
			}
		}catch(EOFException fe){
			System.out.println("������ �б� �Ϸ�");
		}catch(Exception ioe){
			System.out.println("���� �߻� :"+ioe);
		}finally{
				try{
					if(ois !=null) ois.close();
				}catch(IOException oe){	System.out.println("������ �ݴµ� �����߽��ϴ�");	}
		}
	}
/** �����ϱ� ���� �޸��� ������ ���Ͽ� �����ϱ� */
	public void close(){
		ObjectOutputStream oos=null;
		try{
			oos=new ObjectOutputStream(	new FileOutputStream("cust.dat"));
			for(int i=0; i<index; i++){
				oos.writeObject(list[i]);
			}
		}catch(IOException ioe){
			System.out.println("���� ���� �ϴµ� �����Ͽ����ϴ�");
		}finally{
			try{
				if(oos!=null) oos.close();
			}catch(IOException oe){	System.out.println("������ �ݴµ� �����߽��ϴ�");	}
		}
	}
	/** ���� ��� ������ �����Ѵ�.*/
	public Customer[] allCust(){
		Customer[]  re=new Customer[index];
		for(int i=0;i<index;i++){
			re[i]=list[i];
		}
		return re;
	}
	/** ���޵� ���� ������ �߰��Ѵ�.*/
	public void addCust( int num, String name,String address){
		Customer newCust = new Customer(num,name,address);
		list[index++] = newCust;
		// �����ϼ���.
		
		
	}
	/** �̸� �˻� �޼ҵ�*/
	public Customer search(String name){
		
		for(int i =0 ; i < index; i ++){
			if(list[i].getName().equals(name)){
				return list[i];
			}
		}
		// �����ϼ���.
		
		return null;
	}
	/** ��ȣ �˻� �޼ҵ�*/
	public Customer search(int num){
		for(int i = 0 ; i < index; i++){
			if(list[i].getNum()== num){
				return list[i];
			}
		}
		// �����ϼ���.
		
		return null;
	}
	/** �̸� �˻�, ���� �޼ҵ� */
	public void delete(String name){
		for(int i = 0 ; i < index; i ++){
			if(list[i].getName().equals(name)){
				list[i] = null;
				index--;
			}
		}
		// �����ϼ���.
		
	}
	/** ��ȣ�� �˻�, ���� �޼ҵ�*/
	public void delete(int num){
		for(int i = 0; i < index; i++){
			if(list[i].getNum() ==num){
				list[i] = null;
				index--;
			}
		}
		// �����ϼ���.
		
	}
	/** ��ȣ�� �˻��Ͽ� �̸�,�ּҸ� �����Ѵ�. */
	public void updateCust(int num, String name,String address){
		for(int i = 0 ; i < index; i++){
			if(list[i].getNum() == num){
				list[i].setName(name);
				list[i].setAddress(address);
				return;
			
			}
		}
		list[index++] = new Customer(num,name, address);
		
		
		// �����ϼ���.
		
	}
}
