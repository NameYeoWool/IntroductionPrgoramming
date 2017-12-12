package kr.jaen.cms;

import java.io.*;
/** 고객의 데이타를 관리, 저장하는 클래스 */
public class  CustomerDAO{
	private Customer[] list= new Customer[100];
	private  int index=0;
	
	public CustomerDAO(){
		open();
	}
	
	/** 파일로 부터 자료 읽어서 메모리(ArrayList)에 저장하기*/
	public void open(){
		ObjectInputStream ois=null;
		File file=new File("cust.dat");
		if (!file.exists()) { return; }
		try{	
			ois=new ObjectInputStream(new FileInputStream(file));
			Object ob=null;
			while((ob=ois.readObject())!=null){//마지막 EOF Exception발생
				list[index++]=(Customer)ob;
			}
		}catch(EOFException fe){
			System.out.println("파일이 읽기 완료");
		}catch(Exception ioe){
			System.out.println("오류 발생 :"+ioe);
		}finally{
				try{
					if(ois !=null) ois.close();
				}catch(IOException oe){	System.out.println("파일을 닫는데 실패했습니다");	}
		}
	}
/** 종료하기 전에 메모리의 내용을 파일에 저장하기 */
	public void close(){
		ObjectOutputStream oos=null;
		try{
			oos=new ObjectOutputStream(	new FileOutputStream("cust.dat"));
			for(int i=0; i<index; i++){
				oos.writeObject(list[i]);
			}
		}catch(IOException ioe){
			System.out.println("파일 저장 하는데 실패하였습니다");
		}finally{
			try{
				if(oos!=null) oos.close();
			}catch(IOException oe){	System.out.println("파일을 닫는데 실패했습니다");	}
		}
	}
	/** 고객의 모든 정보를 리턴한다.*/
	public Customer[] allCust(){
		Customer[]  re=new Customer[index];
		for(int i=0;i<index;i++){
			re[i]=list[i];
		}
		return re;
	}
	/** 전달된 고객의 정보를 추가한다.*/
	public void addCust( int num, String name,String address){
		Customer newCust = new Customer(num,name,address);
		list[index++] = newCust;
		// 구현하세요.
		
		
	}
	/** 이름 검색 메소드*/
	public Customer search(String name){
		
		for(int i =0 ; i < index; i ++){
			if(list[i].getName().equals(name)){
				return list[i];
			}
		}
		// 구현하세요.
		
		return null;
	}
	/** 번호 검색 메소드*/
	public Customer search(int num){
		for(int i = 0 ; i < index; i++){
			if(list[i].getNum()== num){
				return list[i];
			}
		}
		// 구현하세요.
		
		return null;
	}
	/** 이름 검색, 제거 메소드 */
	public void delete(String name){
		for(int i = 0 ; i < index; i ++){
			if(list[i].getName().equals(name)){
				list[i] = null;
				index--;
			}
		}
		// 구현하세요.
		
	}
	/** 번호를 검색, 제거 메소드*/
	public void delete(int num){
		for(int i = 0; i < index; i++){
			if(list[i].getNum() ==num){
				list[i] = null;
				index--;
			}
		}
		// 구현하세요.
		
	}
	/** 번호를 검색하여 이름,주소를 수정한다. */
	public void updateCust(int num, String name,String address){
		for(int i = 0 ; i < index; i++){
			if(list[i].getNum() == num){
				list[i].setName(name);
				list[i].setAddress(address);
				return;
			
			}
		}
		list[index++] = new Customer(num,name, address);
		
		
		// 구현하세요.
		
	}
}
