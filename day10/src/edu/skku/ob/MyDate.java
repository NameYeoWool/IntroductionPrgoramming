package edu.skku.ob;

public class MyDate {
	int year, month, day; // Member 변수
	
	
	//생성자 : Constructor
	//클래스와 이름이 같고, 리턴 타입이 없어야 한다.
	//오직, new 할 때 호출됨.
	public MyDate(){}// 기본 생성자
	public MyDate(int y, int m, int d){
		year= y;
		month = m;
		day = d;
	}
	//OverLoading
	//이름을 같게 하고,
	//매개변수를 다르게해서 정의하는 기법
	public MyDate(int month, int day){
		year= 2017;
		this.month = month;//로컬변수- 매개변수도 지역변수로 본다. 메소드 내에서
		this.day = day;
	}
	public void info(){
		System.out.println(year + "년" + month + "월"
				+day + "일");
		
	}

}
