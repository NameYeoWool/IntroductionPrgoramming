package edu.skku.hw3;

public class BookTest {
	
	public static void main(String[] args) {
		Book[] books = new Book[5];
		Magazine[] magazines = new Magazine[5];
		
		books[0] = new Book("21424","Java Basic","김하나","Jaen.kr",15000,"Java 기본 문법");
		books[1] = new Book("33455","JDBC Pro","김철수","Jean.kr",23000);
		books[2] = new Book("55355","Servlet/JSP","박자바","Jean.kr",41000,"Mode12 기반");
		books[3] = new Book("35332","Android App","홍길동","Jean.kr",25000,"Lightweight Framework");
		books[4] = new Book("35355","OOAD 분석,설계","소나무","Jean.kr",30000);
		//books[4] = new Book("35355","OOAD 분석,설계","소나무","Jean.kr",30000);
		
		
		magazines[0] = new Magazine("35535","Java World","편집부","Jean.kr",7000,2013,2);
		magazines[1] = new Magazine("33434","Mobile World","편집부","Jean.kr",8000,2013,8);
		magazines[2] = new Magazine("75342","Next Web","편집부","Jean.kr",10000,"AJAX 소개",2012,10);
		magazines[3] = new Magazine("76543","Architecture","편집부","Jean.kr",5000,"java 시스템",2010,3);
		magazines[4] = new Magazine("76534","Data Modeling","편집부","Jean.kr",14000,2012,12);
		
		
		System.out.println("******************************  도서 목록  *******************");
		for(int i = 0 ; i < 5; i ++){
			books[i].toString();
		}
		System.out.println();
		
		System.out.println("**********************잡지 목록  **************************");
		for(int i = 0 ; i < 5; i ++){
			magazines[i].toString();
		}
		
	}
}
